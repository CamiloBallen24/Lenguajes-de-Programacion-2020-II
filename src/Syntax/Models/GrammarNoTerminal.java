package Syntax.Models;

import java.util.HashSet;
/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
*/
public class GrammarNoTerminal extends GrammarSymbol{
    
    public HashSet<GrammarTerminal> firsts;
    public HashSet<GrammarTerminal> nexts;
    
    public GrammarNoTerminal(String name) {
        super(name);
        this.firsts = null;
        this.nexts = null;
    }
    
}
