package Lexer.Models;

import java.util.ArrayList; 


/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
*/

public class State {
    private String type_state;
    private String token_associate;
    private Boolean is_valide;
    private Boolean use_lexeme;

    public State(String type_state, String token_associate, Boolean is_valide, Boolean use_lexeme) {
        this.type_state = type_state;
        this.token_associate = token_associate;
        this.is_valide = is_valide;
        this.use_lexeme = use_lexeme;
    }  

    public String getTypeState(){
        return type_state;
    }

    public String getTokenAssociate(){
        return token_associate;
    }

    public Boolean getIsValide(){
        return is_valide;
    }

    public Boolean getUseLexeme(){
        return use_lexeme;
    }
}
