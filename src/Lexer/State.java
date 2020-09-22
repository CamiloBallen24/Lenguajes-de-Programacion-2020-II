package Lexer;

import java.util.ArrayList; 
import Lexer.Connection;


public class State {
    public String type_state;
    public String token_associate;
    public Boolean is_valide;

    public State(String type_state, String token_associate, Boolean is_valide) {
        this.type_state = type_state;
        this.token_associate = token_associate;
        this.is_valide = is_valide;
    }  
}
