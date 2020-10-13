
package Syntax;

import Lexer.Communication.LexerResponse;
import Lexer.Lexer;
import Lexer.Models.State;
import Lexer.Models.Token;
import Syntax.GrammarServices.GrammarTools;
import Syntax.Models.Grammar;
import Syntax.Models.GrammarNoTerminal;
import Syntax.Models.GrammarRule;
import Syntax.Models.GrammarSymbol;
import Syntax.Models.GrammarTerminal;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SyntaxAnalyzer {
    Lexer lexer;
    Grammar grammar;
    Token current_token;

    public SyntaxAnalyzer(Lexer lexer, Grammar grammar) {
        this.lexer = lexer;
        this.grammar = grammar;
        this.current_token = null;
    }
    
    public String analyze(){
        nextToken();
        try {
            this.processNoTerminal(this.grammar.firstNoTerminal);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return "F  mi pana";
        }
        return "todo meloski mi pana";
    }
    
    public void processNoTerminal(GrammarNoTerminal no_terminal) throws Exception{
        ArrayList<GrammarRule> no_terminal_rules = GrammarTools.getRulesByNoTerminal(this.grammar, no_terminal);
        
        GrammarRule next_rule = null;
        for (GrammarRule no_terminal_rule : no_terminal_rules) {
            if(this.predictionContainsToken(this.current_token, no_terminal_rule.predictions)){
                next_rule = no_terminal_rule;
                break;
            }
        }
        
        if(next_rule == null){
            throw new Exception("Error Sintactico, no se puede avanzar mas");
        }
        
        for (GrammarSymbol symbol : next_rule.right_part) {
            if(symbol.equals(this.grammar.epsilon)) break;
            else if(symbol.getClass().equals(GrammarNoTerminal.class)){
                this.processNoTerminal((GrammarNoTerminal)symbol);
            }
            else if(symbol.getClass().equals(GrammarTerminal.class)){
                this.empareja((GrammarTerminal)symbol);
            }
        }
        
        
    
    }
    
    
    public void empareja(GrammarTerminal terminal) throws Exception{
        if(terminal.name.equals(this.current_token.getName())){
            nextToken();
        }
        else{
            throw new Exception("Error Sintactico, Al emparejar");
        }
    }
    
    
    
    public void nextToken(){
        LexerResponse response = lexer.nextToken();
        if(response.getTypeResponse().equals("token"))
            this.current_token = response.getToken();


        //Mirar si es un error Lexico

        //Finalizo
        else if(response.getTypeResponse().equals("lexer_end"))
                this.current_token = response.getToken();
          
           
    }
    
    
    public Boolean predictionContainsToken(Token token, HashSet<GrammarTerminal> predicitons){
        for (GrammarTerminal prediciton : predicitons) 
            if(token.getName().equals(prediciton.name)) 
                return true;
        return false;
    }
}
