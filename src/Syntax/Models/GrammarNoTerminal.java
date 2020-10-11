package Syntax.Models;

import java.util.HashSet;

public class GrammarNoTerminal extends GrammarSymbol{
    
    HashSet<GrammarTerminal> firsts;
    HashSet<GrammarTerminal> nexts;

    
    public GrammarNoTerminal(String name) {
        super(name);
        this.firsts = null;
        this.nexts = null;
    }
    
}
