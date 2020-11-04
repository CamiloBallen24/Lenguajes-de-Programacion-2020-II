package Syntax.Models;
/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
*/
public class GrammarTerminal extends GrammarSymbol{
    
    private String symbol;
    
    public GrammarTerminal(String name, String symbol) {
        super(name);
        this.symbol = symbol;
    }
    
    public String getSymbol(){
        return this.symbol;
    }
    
}
