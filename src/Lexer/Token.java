package Lexer;

import java.util.ArrayList;
import java.util.Arrays;

public class Token {
    public State token_state;
    public String lexeme;
    public int row;
    public int column;
    
    ArrayList<String> reservedWords = new ArrayList<String>( Arrays.asList("var", "num", "bool", "while", "when", "print", "end", "function", "if", "true", "false", "do", "return", "for", "input", "unless", "until", "loop", "repeat", "next", "break", "and", "or", "not"));

    public Token(State token_state, String lexeme, int row, int column) {
        this.token_state = token_state;
        this.lexeme = lexeme;
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        if((token_state.type_state.equals("indefinido_01"))){
            if(reservedWords.contains(this.lexeme)){
                return String.format("<" + this.lexeme + "," + this.row + "," + this.column + ">");
            }else{
                return String.format("<" + this.token_state.token_associate + "," + this.lexeme + "," + this.row + "," + this.column + ">");
            }
        }
        
        if(this.token_state.use_lexeme){
            return String.format("<" + this.token_state.token_associate + "," + this.lexeme + "," + this.row + "," + this.column + ">"); 
        }else{
            return String.format("<" + this.token_state.token_associate + "," + this.row + "," + this.column + ">");
        }
        
    } 
}
