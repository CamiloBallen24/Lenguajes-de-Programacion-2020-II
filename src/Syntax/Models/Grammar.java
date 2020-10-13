package Syntax.Models;

import Syntax.GrammarServices.GrammarFirstsGenerator;
import Syntax.GrammarServices.GrammarNextsGenerator;
import Syntax.GrammarServices.GrammarPredictionGenerator;
import Syntax.GrammarServices.GrammarTools;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Grammar {
    public ArrayList<GrammarRule> rules;
    public GrammarNoTerminal firstNoTerminal;
    public GrammarTerminal epsilon;

    public Grammar(ArrayList<GrammarRule> rules, GrammarTerminal epsilon, GrammarNoTerminal firstNoTerminal) {
        this.rules  = rules;
        this.firstNoTerminal = firstNoTerminal;
        this.epsilon = epsilon ;
        GrammarFirstsGenerator.getAllFirsts(this);
        GrammarNextsGenerator.getAllNexts(this);
        GrammarPredictionGenerator.getAllPredictions(this);
    }
}
