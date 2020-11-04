
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
/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
*/
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
            return new SyntaxResponse("error", ex.getMessage());
        }
        if(this.current_token.getName().equals(this.grammar.endString.name)){
            return new SyntaxResponse("success","El analisis sintactico ha finalizado correctamente.");
        }
        else{
            String errorMessage = "<"+this.current_token.getRow()+":"+this.current_token.getColumn()+"> Error sintactico: se encontro: '";
            errorMessage += (this.current_token.isReservedWord()) ? this.current_token.getName(): this.current_token.getLexeme();
            errorMessage += "'; se esperaba: 'final de archivo'";
            return new SyntaxResponse("error", errorMessage);
           
        }
        
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
//        System.out.println(no_terminal.name);
        if(next_rule == null){
            throwError(no_terminal);
        }
        
        
//        System.out.println(no_terminal.name);
//        for (GrammarSymbol grammarSymbol : next_rule.right_part) {
//            System.out.println(grammarSymbol.name);
//        }
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
        
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
//        System.out.println("");
//        System.out.println("");
//        System.out.println("Emparejar:");
//        System.out.println(terminal.name);
//        System.out.println(this.current_token.getName());
//        System.out.println("");
        if(terminal.name.equals(this.current_token.getName())){
            nextToken();
        }else{
            throwError(terminal);
        }
    }
    
    public void nextToken() throws Exception{
        LexerResponse response = lexer.nextToken();
        
        
        switch (response.getTypeResponse()) {
            case "token":
                this.current_token = response.getToken();
                break;
            case "lexer_end":
                this.current_token = response.getToken();
                break;
            case "error":
                throw new Exception(response.toString());
            default:
                break;
        }
    }
    
    public Boolean predictionContainsToken(Token token, HashSet<GrammarTerminal> predicitons){
        for (GrammarTerminal prediciton : predicitons)
            if(token.getName().equals(prediciton.name))
                return true;
        return false;
    }
    
    private void throwError(GrammarSymbol symbol) throws Exception{
        String errorMessage;
        if((current_token.getName().equals("$"))){
            errorMessage = "<"+this.current_token.getRow()+":"+this.current_token.getColumn()+"> Error sintactico: se encontro final de archivo; se esperaba 'end'.";
        }
        else{
            errorMessage = "<"+this.current_token.getRow()+":"+this.current_token.getColumn()+"> Error sintactico: se encontro: '";
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
        }
        throw new Exception(errorMessage);
    }
    
    private ArrayList<String> getExpectedSymbols(GrammarNoTerminal no_terminal){
        
        ArrayList<String> symbols = new ArrayList<>();
        
        ArrayList<GrammarRule> no_terminal_rules = GrammarTools.getRulesByNoTerminal(this.grammar, no_terminal);
        
        GrammarRule next_rule = null;
        for (GrammarRule no_terminal_rule : no_terminal_rules) {
            for (GrammarTerminal prediction : no_terminal_rule.predictions) {
                if(!symbols.contains(prediction.getSymbol())){
                    symbols.add(prediction.getSymbol());
                }
            }
        }       
        
        //Se puede hacer un arreglo de Terminales, organizarlo por orden alfabético del nombre del token asociado y luego hacer otro arreglo, esta vez 
        //de las strings de los simbolos asociados
        Collections.sort(symbols);
        
        
        if(symbols.contains("identificador")&& symbols.contains("identificador de funcion")){
            int aux = symbols.indexOf("identificador de funcion");
            symbols.set(symbols.indexOf("identificador"), "identificador de funcion");
            symbols.set(aux, "identificador");
        }
        
        return symbols;
    }
}
