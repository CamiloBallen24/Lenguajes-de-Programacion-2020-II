package Syntax.Models;

import java.util.ArrayList;
import java.util.HashSet;
/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
*/
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
