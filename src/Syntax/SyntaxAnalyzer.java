
package Syntax;

import Lexer.Communication.LexerResponse;
import Lexer.Lexer;
import Lexer.Models.Token;
import Syntax.Communication.SyntaxResponse;
import Syntax.GrammarServices.GrammarTools;
import Syntax.Models.Grammar;
import Syntax.Models.GrammarNoTerminal;
import Syntax.Models.GrammarRule;
import Syntax.Models.GrammarSymbol;
import Syntax.Models.GrammarTerminal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SyntaxAnalyzer {
    Lexer lexer;
    Grammar grammar;
    Token current_token;

    public SyntaxAnalyzer(Lexer lexer, Grammar grammar) {
        this.lexer = lexer;
        this.grammar = grammar;
        this.current_token = null;
    }
    
    public SyntaxResponse analyze() throws Exception{
        nextToken();
        try {
            this.processNoTerminal(this.grammar.firstNoTerminal);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return new SyntaxResponse("error", "Hubo un error en el procesador sintáctico");
        }
        return new SyntaxResponse("success","El analisis sintactico ha finalizado correctamente.");
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
            throwError(no_terminal);
        }
        
        for (GrammarSymbol symbol : next_rule.right_part) {
            if(symbol.equals(this.grammar.epsilon)) break;
            else if(symbol.getClass().equals(GrammarNoTerminal.class)){
                this.processNoTerminal((GrammarNoTerminal)symbol);
            }
            else if(symbol.getClass().equals(GrammarTerminal.class)){
                this.matching((GrammarTerminal)symbol);
            }
        }
    }
    
    
    public void matching(GrammarTerminal terminal) throws Exception{
        if(terminal.name.equals(this.current_token.getName())){
            nextToken();
        }else{
            System.out.println("Error Sintactico, Al emparejar");
            throwError(terminal);
        }
    }
    
    public void nextToken() throws Exception{
        LexerResponse response = lexer.nextToken();
        if(response.getTypeResponse().equals("token")){
            this.current_token = response.getToken();
        }else if(response.getTypeResponse().equals("lexer_end")){
            this.current_token = response.getToken();
        }else if(response.getTypeResponse().equals("error")){
            throw new Exception(response.toString());
        }
    }
    
    public Boolean predictionContainsToken(Token token, HashSet<GrammarTerminal> predicitons){
        for (GrammarTerminal prediciton : predicitons)
            if(token.getName().equals(prediciton.name))
                return true;
        return false;
    }
    
    private void throwError(GrammarSymbol symbol) throws Exception{
        String errorMessage = "<"+this.current_token.getColumn()+":"+this.current_token.getRow()+"> Error sintactico: se encontro: '";
        errorMessage += (this.current_token.isReservedWord()) ? this.current_token.getName(): this.current_token.getLexeme();
        errorMessage += "'; se esperaba: ";
        
        if(symbol.getClass().equals(GrammarTerminal.class)){
            errorMessage += "'"+ ((GrammarTerminal) symbol).getSymbol() +"'.";
        }else{
            ArrayList<String> expectedSymbols = this.getExpectedSymbols((GrammarNoTerminal)symbol);
            for(int i=0;i<expectedSymbols.size();i++){
                errorMessage += (i==expectedSymbols.size()-1) ? "'"+expectedSymbols.get(i)+"'." : "'"+expectedSymbols.get(i)+"', ";
            }
        }
        throw new Exception(errorMessage);
    }
    
    private ArrayList<String> getExpectedSymbols(GrammarNoTerminal no_terminal){
        
        ArrayList<String> symbols = new ArrayList<>();
        
        ArrayList<GrammarRule> no_terminal_rules = GrammarTools.getRulesByNoTerminal(this.grammar, no_terminal);
        
        GrammarRule next_rule = null;
        for (GrammarRule no_terminal_rule : no_terminal_rules) {
            for (GrammarTerminal prediction : no_terminal_rule.predictions) {
                if(!symbols.contains(prediction)){
                    symbols.add(prediction.getSymbol());
                }
            }
        }       
        
        //Se puede hacer un arreglo de Terminales, organizarlo por orden alfabético del nombre del token asociado y luego hacer otro arreglo, esta vez 
        //de las strings de los simbolos asociados
        //Collections.sort(symbols); 
        return symbols;
    }
}
