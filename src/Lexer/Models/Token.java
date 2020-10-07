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
    private State token_state;
    private String lexeme;
    private int row;
    private int column;
    
    

    public Token(State token_state, String lexeme, int row, int column) {
        this.token_state = token_state;
        this.lexeme = lexeme;
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        if((token_state.getTypeState().equals("indefinido_01"))){
            if(BCCProperties.getReserverWords().contains(this.lexeme)){
                return String.format("<" + this.lexeme + "," + this.row + "," + this.column + ">");
            }else{
                return String.format("<" + this.token_state.getTokenAssociate() + "," + this.lexeme + "," + this.row + "," + this.column + ">");
            }
        }
        
        if(this.token_state.getUseLexeme()){
            return String.format("<" + this.token_state.getTokenAssociate() + "," + this.lexeme + "," + this.row + "," + this.column + ">"); 
        }else{
            return String.format("<" + this.token_state.getTokenAssociate() + "," + this.row + "," + this.column + ">");
        }
        
    } 
}
