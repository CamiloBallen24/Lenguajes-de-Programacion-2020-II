package Syntax.GrammarServices;

import Syntax.Models.Grammar;
import Syntax.Models.GrammarNoTerminal;
import Syntax.Models.GrammarRule;
import Syntax.Models.GrammarSymbol;
import Syntax.Models.GrammarTerminal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GrammarFirstsGenerator {
    
    //Se asegura que existan los primeros para todos y cada uno de los No terminales en la gramatica 
    public static HashMap<GrammarNoTerminal, HashSet<GrammarTerminal>> getAllFirsts(Grammar grammar){
        HashSet<GrammarNoTerminal> no_terminals = GrammarTools.getNoTerminals(grammar);
        HashMap<GrammarNoTerminal, HashSet<GrammarTerminal>> firsts = new HashMap<>();
        for (GrammarNoTerminal no_terminal : no_terminals) {
            firsts.put(no_terminal, getFirstsNoTerminal(grammar, no_terminal));
        }
        return firsts;
    }
    
    
    //Calcula los primeros para un No terminal dado
    public static HashSet<GrammarTerminal> findFirsts(Grammar grammar, GrammarNoTerminal no_terminal){
        
        //Obtiene todos las reglas asociadas a un no terminal
        ArrayList<GrammarRule> rules_no_terminal = GrammarTools.getRulesByNoTerminal(grammar, no_terminal.name);
        
        //Conjunto donde se guardaran los primeros, el set evita que se repitan
        HashSet<GrammarTerminal> firsts_no_terminal = new HashSet<>();
        
        //Encuentra los primeros primeros de cada una de las reglas asociadas al no terminal
        for (GrammarRule rule : rules_no_terminal) {
            firsts_no_terminal = findFirstExpression(grammar, rule.right_part, firsts_no_terminal);
        }
        //Retorna el conjunto de primeros
        return firsts_no_terminal;
    }
    
    
    //Obtiene todos los primeros de un terminal dado
    //Si no se ha calculado los primeros para un terminal dado, lo calcula y guarda XD
    public static HashSet<GrammarTerminal> getFirstsNoTerminal(Grammar grammar, GrammarNoTerminal no_terminal){
        if(no_terminal.firsts == null){
            no_terminal.firsts = findFirsts(grammar, no_terminal);
        }
        return no_terminal.firsts;
    }
    
    public static HashSet<GrammarTerminal> findFirstExpression(Grammar grammar, ArrayList<GrammarSymbol> expression, HashSet<GrammarTerminal> firsts_no_terminal) {

        //Identifica si es posible agregar  el epsilon a los primeros
        //Se volvera true cuando un No Terminal del conjunto de simbolos tenga epsilon
        Boolean has_epsilon = false;

        //Recorre cada uno de los simbolos de la gramatica
        for (GrammarSymbol symbol : expression) {

            //Si es un terminal lo agrega a la lista de primeros y romple el ciclo (no evalua los siguientes simbolos)
            //Se asegura que el epsilon no pertenezca a los primeros (en esta regla)
            //En realidad si puede pertenecer si la regla es S -> e, pero solo es ese caso especial
            if (symbol.getClass().equals(GrammarTerminal.class)) {
                firsts_no_terminal.add((GrammarTerminal) symbol);
                has_epsilon = false;
                break;
            }

            //Si es un No terminasl, obtiene los primeros de ese No terminal (aca se produce la recusividad)
            HashSet<GrammarTerminal> firsts_symbol = GrammarFirstsGenerator.getFirstsNoTerminal(grammar, (GrammarNoTerminal) symbol);

            //Si Contiene epsilon continua el ciclo, si no se finaliza
            //En ambos casos se agregan los primeros de ese no terminal, a los primeros del terminal actual
            //No se agrega el epsilon
            //Se maneja la variable segun corresponda
            if (firsts_symbol.contains(grammar.epsilon)) {
                for (GrammarTerminal first_symbol : firsts_symbol) {
                    if (!symbol.equals(grammar.epsilon)) {
                        firsts_no_terminal.add(first_symbol);
                    }
                }
                has_epsilon = true;
            } else {
                for (GrammarTerminal first_symbol : firsts_symbol) {
                    firsts_no_terminal.add(first_symbol);
                }
                has_epsilon = false;
                break;
            }
        }
        //Se añade epsilon en caso de ser necesario
        if (has_epsilon) {
            firsts_no_terminal.add(grammar.epsilon);
        }
        
        return firsts_no_terminal;
    }
    
    public static HashSet<GrammarTerminal> findFirstExpression(Grammar grammar, ArrayList<GrammarSymbol> expression) {
        return findFirstExpression(grammar, expression, new HashSet<>());
    }
}
