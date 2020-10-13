package Syntax.Models;

import java.util.ArrayList;
import java.util.HashSet;

public class GrammarRule {
    public GrammarNoTerminal left_part;
    public ArrayList<GrammarSymbol> right_part;
    public HashSet<GrammarTerminal> predictions;

    public GrammarRule(GrammarNoTerminal left_part, ArrayList<GrammarSymbol> right_part) {
        this.left_part = left_part;
        this.right_part = right_part;
    }

    public void setPredictions(HashSet<GrammarTerminal> prediction){
        this.predictions = prediction;
    }
}
