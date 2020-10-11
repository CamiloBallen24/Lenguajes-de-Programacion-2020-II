package Syntax.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Grammar {
    ArrayList<GrammarRule> rules;
    GrammarTerminal epsilon;

    public Grammar(ArrayList<GrammarRule> rules, GrammarTerminal epsilon) {
        this.rules  = rules;
        this.epsilon = epsilon ;
        this.getAllFirsts();
    }
    
    
    //Se asegura que existan los primeros para todos y cada uno de los No terminales en la gramatica 
    public HashMap<GrammarNoTerminal, HashSet<GrammarTerminal>> getAllFirsts(){
        HashSet<GrammarNoTerminal> no_terminals = this.getNoTerminals();
        HashMap<GrammarNoTerminal, HashSet<GrammarTerminal>> firsts = new HashMap<>();
        for (GrammarNoTerminal no_terminal : no_terminals) {
            firsts.put(no_terminal, this.getFirstsNoTerminal(no_terminal));
        }
        return firsts;
    }
    
    
    //Calcula los primeros para un No terminal dado
    public HashSet<GrammarTerminal> findFirsts(GrammarNoTerminal no_terminal){
        
        //Obtiene todos las reglas asociadas a un no terminal
        ArrayList<GrammarRule> rules_no_terminal = this.getRulesByNoTerminal(no_terminal.name);
        
        //Conjunto donde se guardaran los primeros, el set evita que se repitan
        HashSet<GrammarTerminal> firsts_no_terminal = new HashSet<>();
        
        //Encuentra los primeros primeros de cada una de las reglas asociadas al no terminal
        for (GrammarRule rule : rules_no_terminal) {
            
            //Identifica si es posible agregar  el epsilon a los primeros
            //Se volvera true cuando un No Terminal del conjunto de simbolos tenga epsilon
            Boolean has_epsilon = false;
            
            
            //Recorre cada uno de los simbolos de la gramatica
            for (GrammarSymbol symbol : rule.right_part ) {
                
                //Si es un terminal lo agrega a la lista de primeros y romple el ciclo (no evalua los siguientes simbolos)
                //Se asegura que el epsilon no pertenezca a los primeros (en esta regla)
                //En realidad si puede pertenecer si la regla es S -> e, pero solo es ese caso especial
                if(symbol.getClass().equals(GrammarTerminal.class)){
                    firsts_no_terminal.add((GrammarTerminal) symbol);
                    has_epsilon = false;
                    break;
                }
                
                
                //Si es un No terminasl, obtiene los primeros de ese No terminal (aca se produce la recusividad)
                HashSet<GrammarTerminal> firsts_symbol = this.getFirstsNoTerminal((GrammarNoTerminal) symbol);
                
                //Si Contiene epsilon continua el ciclo, si no se finaliza
                //En ambos casos se agregan los primeros de ese no terminal, a los primeros del terminal actual
                //No se agrega el epsilon
                //Se maneja la variable segun corresponda
                if(firsts_symbol.contains(this.epsilon)){
                    for (GrammarTerminal first_symbol : firsts_symbol) 
                        if(!symbol.equals(this.epsilon))firsts_no_terminal.add(first_symbol);
                    has_epsilon = true;
                }
                else{
                    for (GrammarTerminal first_symbol : firsts_symbol) firsts_no_terminal.add(first_symbol);
                    has_epsilon = false;
                    break;
                }
            }
            //Se añade epsilon en caso de ser necesario
            if(has_epsilon) firsts_no_terminal.add(this.epsilon);
            
        }
        //Retorna el conjunto de primeros
        return firsts_no_terminal;
    }
    
    //Obtiene todos los primeros de un terminal dado
    //Si no se ha calculado los primeros para un terminal dado, lo calcula y guarda XD
    public HashSet<GrammarTerminal> getFirstsNoTerminal(GrammarNoTerminal no_terminal){
        if(no_terminal.firsts == null){
            no_terminal.firsts = this.findFirsts(no_terminal);
        }
        return no_terminal.firsts;
    }
    

    
    
    //Obtiene todas Reglas asociadas a un NoTerminal
    public  ArrayList<GrammarRule> getRulesByNoTerminal(String nameNoTerminal){
        ArrayList<GrammarRule> no_terminal_rules = new ArrayList<>();
        for (GrammarRule rule : this.rules) {
            if(nameNoTerminal.equals(rule.left_part.name)){
                no_terminal_rules.add(rule);
            }
        }
        return no_terminal_rules;
    }


    
    
    //Obtiene todos los posibles terminales que forman parte de la gramatica
    //El HashSet es para que no se repitan
    public HashSet<GrammarNoTerminal> getNoTerminals(){
        HashSet<GrammarNoTerminal> noTerminals = new HashSet<>();
        for (GrammarRule rule : this.rules) {
            noTerminals.add(rule.left_part);
        }
        return noTerminals;
        
    }
}
