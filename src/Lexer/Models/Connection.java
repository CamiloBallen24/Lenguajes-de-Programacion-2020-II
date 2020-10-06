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
    public State origin_state;
    public State goal_state;
    public ArrayList<Character> chars_options;

    public Connection(State origin_state, State goal_state, ArrayList<Character> chars_options) {
        this.origin_state = origin_state;
        this.goal_state = goal_state;
        this.chars_options = chars_options;
    }
}
