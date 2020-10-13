package Syntax.Models;

import java.util.HashSet;

public class GrammarNoTerminal extends GrammarSymbol{
    
    public HashSet<GrammarTerminal> firsts;
    public HashSet<GrammarTerminal> nexts;
    
    public GrammarNoTerminal(String name) {
        super(name);
        this.firsts = null;
        this.nexts = null;
    }
    
}
