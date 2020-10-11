package Syntax.GrammarServices;

import Syntax.Models.Grammar;
import Syntax.Models.GrammarNoTerminal;
import Syntax.Models.GrammarRule;
import Syntax.Models.GrammarSymbol;
import java.util.ArrayList;
import java.util.HashSet;

public class GrammarTools {
    
    
    //Obtiene todos los posibles terminales que forman parte de la gramatica
    //El HashSet es para que no se repitan
    public static HashSet<GrammarNoTerminal> getNoTerminals(Grammar grammar){
        HashSet<GrammarNoTerminal> noTerminals = new HashSet<>();
        for (GrammarRule rule : grammar.rules) {
            noTerminals.add(rule.left_part);
        }
        return noTerminals;
    }
    
    //Obtiene todas Reglas asociadas a un NoTerminal
    public static ArrayList<GrammarRule> getRulesByNoTerminal(Grammar grammar, String nameNoTerminal){
        ArrayList<GrammarRule> no_terminal_rules = new ArrayList<>();
        for (GrammarRule rule : grammar.rules) {
            if(nameNoTerminal.equals(rule.left_part.name)){
                no_terminal_rules.add(rule);
            }
        }
        return no_terminal_rules;
    }
    
    //Obtiene todas Reglas en las que hay un noTerminal en la parte derecha
    public static ArrayList<GrammarRule> getRulesByNoTerminalRight (Grammar grammar, String nameNoTerminal){
        
        ArrayList<GrammarRule> rules = new ArrayList<>();
        ArrayList<GrammarSymbol> right_part;
        
        for (GrammarRule rule : grammar.rules) {
            
            right_part = rule.right_part;
            
            for (int i = 0; i < right_part.size(); i++) {
                if(nameNoTerminal.equals(right_part.get(i).name)){
                    GrammarRule newRule;
                    if(i+1<right_part.size()){
                        newRule = new GrammarRule(rule.left_part, new ArrayList<>(right_part.subList(i+1, right_part.size())));
                    }else{
                        newRule = new GrammarRule(rule.left_part, new ArrayList<GrammarSymbol>(){{add(grammar.epsilon);}});
                    }
                    rules.add(newRule);
                }
            }
        }
        
        return rules;
    }
    
    
}
