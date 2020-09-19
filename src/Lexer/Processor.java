package Lexer;


import java.util.ArrayList; 
 import java.util.Random;

import Lexer.State;
import Lexer.Token;
import Lexer.BCCGraph;

public class Processor {
    
    public ArrayList<Token> tokens;
    
    public State current_state;
    public BCCGraph graph;
    
    public String string_read;
    public int initial_line;
    public int initial_column;
    
    public Processor(){
        this.string_read = "";
        this.initial_column = 0;
        this.initial_line = 0;
        
        this.tokens = new ArrayList<Token>();
        
        this.graph = new BCCGraph();
        this.current_state = graph.initial_state;
    }
    
    public String nextToken(){
        Character current_char = lectorXD();
        
        while(this.nextState(current_char) != null){
            this.current_state  = nextState(current_char);
            System.out.println(current_char + " " +current_state.type_state);
            
            current_char = lectorXD();
        }
        
        System.out.println(current_char + " " + null);
        
        return null;
    }
    
    
    
    
    public Character lectorXD(){
        Random r = new Random();
        String alphabet = "AA11111222222222211AABBC";
        Character s = alphabet.charAt(r.nextInt(alphabet.length()));
        return s;
    }
    
    
    
    
    public State nextState(Character character){
        ArrayList<Connection> connections_current_state = this.graph.connectionsByState(this.current_state);
        
        for (Connection connection : connections_current_state) {
            if(connection.chars_options.contains(character)){
                return connection.goal_state;
            }
        }    
        return null;
    }
    
    
    
}
