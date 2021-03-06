package Syntax.Models;

import Syntax.GrammarServices.GrammarFirstsGenerator;
import Syntax.GrammarServices.GrammarNextsGenerator;
import Syntax.GrammarServices.GrammarPredictionGenerator;
import Syntax.GrammarServices.GrammarTools;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
*/
public class Grammar {
    public ArrayList<GrammarRule> rules;
    public GrammarNoTerminal firstNoTerminal;
    public GrammarTerminal epsilon;
    public GrammarTerminal endString;

    public Grammar(ArrayList<GrammarRule> rules, GrammarTerminal epsilon, GrammarNoTerminal firstNoTerminal, GrammarTerminal endString) {
        this.rules  = rules;
        this.firstNoTerminal = firstNoTerminal;
        this.epsilon = epsilon ;
        this.endString = endString;
        GrammarFirstsGenerator.getAllFirsts(this);
        GrammarNextsGenerator.getAllNexts(this);
        GrammarPredictionGenerator.getAllPredictions(this);
    }
}
