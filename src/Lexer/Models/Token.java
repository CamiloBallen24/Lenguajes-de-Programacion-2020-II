package Lexer.Models;

import Lexer.BCC.BCCProperties;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
*/

public class Token {
    private String name;
    private String lexeme;
    private int row;
    private int column;
    private Boolean reserved_word;
    private Boolean use_lexeme;
    

    public Token(State token_state, String lexeme, int row, int column) {
        
        if(token_state.getTypeState().equals("indefinido_01") && (BCCProperties.getReserverWords().contains(lexeme))){
            this.reserved_word = true;
            this.name = lexeme;
        }
            
        else{
            this.reserved_word = false;
            this.name = token_state.getTokenAssociate();
        }
            
        
        this.use_lexeme = token_state.getUseLexeme();
        this.lexeme = lexeme;
        
        this.row = row;
        this.column = column;
        
    }

    public Token(String name, String lexeme, int row, int column, Boolean reserved_word, Boolean use_lexeme) {
        this.name = name;
        this.lexeme = lexeme;
        this.row = row;
        this.column = column;
        this.reserved_word = reserved_word;
        this.use_lexeme = use_lexeme;
    }
    
    

    @Override
    public String toString() {
        if(this.reserved_word){
            return String.format("<" + this.name + "," + this.row + "," + this.column + ">");
        }
        
        if(this.use_lexeme){
            return String.format("<" + this.name + "," + this.lexeme + "," + this.row + "," + this.column + ">"); 
        }else{
            return String.format("<" + this.name + "," + this.row + "," + this.column + ">");
        }
        
    } 

    public String getName() {
        return name;
    }
    
    public String getLexeme(){
        return lexeme;
    }
    
    public String getRow() {
        return Integer.toString(row);
    }
    
    public String getColumn() {
        return Integer.toString(column);
    }
    
    public Boolean isReservedWord() {
        return reserved_word;
    }
}
