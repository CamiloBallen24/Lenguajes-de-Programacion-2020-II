package Lexer.BCC;
import java.util.HashMap;
import java.util.ArrayList; 

import Lexer.Models.State;

import Lexer.Models.Connection;
import Lexer.Models.Connection;
import Lexer.Models.State;
import java.util.Arrays;


import Lexer.Reader.*;

/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
**/

public class BCCGraph {
    
    public static State initial_state;
    public static ArrayList<State> states;
    public static ArrayList<Connection> connections;

    static{
        //Lista de estados
        states = new ArrayList<State>();
        
        //Lista de Conexiones
        connections = new ArrayList<Connection>();
        
        //Definiendo el estado inicial
        State state_initial = new State("initial", null, false, false);
        initial_state = state_initial;
        
        //Graph Lexer Reader  
        BCCGraphReader graphReader = new BCCGraphReader();
        
        
        
        //states for the connections
        HashMap<String, State> states_aux = new HashMap<>(); 
        
        //Creando Estados
        for (String[] data_state : graphReader.estados) {
            String type_state       = data_state[0];
            String token_associate  = (data_state[1].equals("null"))? null : data_state[1];
            boolean is_valide       = (data_state[2].equals("true"))? true : false;
            boolean use_lexeme      = (data_state[3].equals("true"))? true : false;
            
            State state = new State(type_state, token_associate, is_valide, use_lexeme);
            states.add(state);
            
            //states for the connections
            states_aux.put(type_state, state); 
        }
        
   
        
        
        //Creando conexiones - new Connection(initial_state, initial_state, chars_options)
        for (String[] data_connection : graphReader.conexiones) {
            String actual_state                 = data_connection[0];
            String goal_state                   = data_connection[1];
            ArrayList<Character> char_options   = graphReader.referencias.get(data_connection[2]);
            
            Connection connection = new Connection(states_aux.get(actual_state), 
                                                   states_aux.get(goal_state), 
                                                   char_options);
            connections.add(connection);
        }
        
    }
    
    
    public static ArrayList<Connection> connectionsByState(State state){
        ArrayList<Connection> selected_connections = new ArrayList<Connection>();
        
        for(Connection connection : connections) {
            if(connection.origin_state.type_state.equals(state.type_state)){
                selected_connections.add(connection);
            }
        }
        
        return selected_connections;
    }
 
    
}
