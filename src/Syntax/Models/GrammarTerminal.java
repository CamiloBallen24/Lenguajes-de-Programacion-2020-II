package Syntax.Models;

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
