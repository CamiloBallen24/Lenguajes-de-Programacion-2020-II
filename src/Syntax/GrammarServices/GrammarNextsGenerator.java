package Syntax.GrammarServices;

import Syntax.Models.Grammar;
import Syntax.Models.GrammarNoTerminal;
import Syntax.Models.GrammarRule;
import Syntax.Models.GrammarTerminal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GrammarNextsGenerator {
    
    public static HashMap<GrammarNoTerminal, HashSet<GrammarTerminal>> getAllNexts(Grammar grammar){
        HashSet<GrammarNoTerminal> no_terminals = GrammarTools.getNoTerminals(grammar);
        HashMap<GrammarNoTerminal, HashSet<GrammarTerminal>> nexts = new HashMap<>();
        for (GrammarNoTerminal no_terminal : no_terminals) {
            nexts.put(no_terminal, getNextsNoTerminal(grammar, no_terminal));
        }
        return nexts;
    }
    
    public static HashSet<GrammarTerminal> findNexts(Grammar grammar, GrammarNoTerminal no_terminal){
        
        ArrayList<GrammarRule> rules_no_terminal = GrammarTools.getRulesByNoTerminalRight(grammar, no_terminal.name);
        HashSet<GrammarTerminal> nexts_no_terminal = new HashSet<>();
        
        if(no_terminal.name.equals(grammar.firstNoTerminal.name))
            nexts_no_terminal.add(new GrammarTerminal("$"));
        
        for (GrammarRule rule : rules_no_terminal) {
            nexts_no_terminal = findNextExpression(grammar, rule, nexts_no_terminal, no_terminal);
        }
        
        return nexts_no_terminal;   
    }
    
    public static HashSet<GrammarTerminal> getNextsNoTerminal(Grammar grammar, GrammarNoTerminal no_terminal){
        if(no_terminal.nexts == null){
            no_terminal.nexts = findNexts(grammar, no_terminal);
        }
        return no_terminal.nexts;
    }
    
    public static HashSet<GrammarTerminal> findNextExpression(Grammar grammar, GrammarRule rule, HashSet<GrammarTerminal> nexts_no_terminal, GrammarNoTerminal calledBy) {
        
        HashSet<GrammarTerminal> nexts = GrammarFirstsGenerator.findFirstExpression(grammar, rule.right_part);
        
        for (GrammarTerminal next : nexts) {
            nexts_no_terminal.add(next);
        }

        if (nexts.contains(grammar.epsilon)) {
            nexts_no_terminal.remove(grammar.epsilon);

            if (!rule.left_part.equals(calledBy)) {
                HashSet<GrammarTerminal> finalNexts = getNextsNoTerminal(grammar, rule.left_part);

                for (GrammarTerminal next : finalNexts) {
                    nexts_no_terminal.add(next);
                }
            }
        }
        
        return nexts_no_terminal;
    }
}
