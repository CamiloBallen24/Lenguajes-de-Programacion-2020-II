package Syntax.Models;

import java.util.ArrayList;

public class GrammarRule {
    GrammarNoTerminal left_part;
    ArrayList<GrammarSymbol> right_part;

    public GrammarRule(GrammarNoTerminal left_part, ArrayList<GrammarSymbol> right_part) {
        this.left_part = left_part;
        this.right_part = right_part;
    }
}
