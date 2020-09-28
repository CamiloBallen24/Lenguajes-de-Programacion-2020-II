package Lexer.Models;

import java.util.ArrayList; 


public class State {
    public String type_state;
    public String token_associate;
    public Boolean is_valide;
    public Boolean use_lexeme;

    public State(String type_state, String token_associate, Boolean is_valide, Boolean use_lexeme) {
        this.type_state = type_state;
        this.token_associate = token_associate;
        this.is_valide = is_valide;
        this.use_lexeme = use_lexeme;
    }  
}
