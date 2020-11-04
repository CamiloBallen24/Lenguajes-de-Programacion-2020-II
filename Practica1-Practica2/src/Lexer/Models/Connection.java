package Lexer.Models;

import java.util.ArrayList; 



import java.util.ArrayList; 
import Lexer.Models.Connection;
import Lexer.Models.State;
import java.util.Arrays;

/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
*/

public class Connection {
    private State origin_state;
    private State goal_state;
    private ArrayList<Character> chars_options;

    public Connection(State origin_state, State goal_state, ArrayList<Character> chars_options) {
        this.origin_state = origin_state;
        this.goal_state = goal_state;
        this.chars_options = chars_options;
    }

    public State getOriginState(){
        return origin_state;
    }

    public State getGoalState(){
        return goal_state;
    }

    public ArrayList<Character> getCharOptions(){
        return chars_options;
    }
}
