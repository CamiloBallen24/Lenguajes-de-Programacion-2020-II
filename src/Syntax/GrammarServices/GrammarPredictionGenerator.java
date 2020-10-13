package Syntax.GrammarServices;

import java.util.HashMap;
import java.util.HashSet;

import Syntax.Models.Grammar;
import Syntax.Models.GrammarRule;
import Syntax.Models.GrammarTerminal;

public class GrammarPredictionGenerator {

    public static HashMap<GrammarRule, HashSet<GrammarTerminal>> getAllPredictions(Grammar grammar){
        HashMap<GrammarRule, HashSet<GrammarTerminal>> predictions = new HashMap<>();
        for (GrammarRule rule : grammar.rules) {
            HashSet<GrammarTerminal> rulePrections = getRulePrediction(grammar, rule);
            predictions.put(rule, rulePrections);
            rule.setPredictions(rulePrections);
        }
        return predictions;
    }

    public static HashSet<GrammarTerminal> getRulePrediction(Grammar grammar, GrammarRule rule){
        HashSet<GrammarTerminal> predictionTerminals = new HashSet<GrammarTerminal>();
        HashSet<GrammarTerminal> firstAlpha = GrammarFirstsGenerator.findFirstExpression(grammar, rule.right_part);

        predictionTerminals = firstAlpha;

        if(firstAlpha.contains(grammar.epsilon)){
            predictionTerminals.remove(grammar.epsilon);
            HashSet<GrammarTerminal> nextsNoTerminal = GrammarNextsGenerator.findNexts(grammar, rule.left_part);
            for (GrammarTerminal next : nextsNoTerminal) {
                predictionTerminals.add(next);
            }

        }
        return predictionTerminals;
    }
   
}