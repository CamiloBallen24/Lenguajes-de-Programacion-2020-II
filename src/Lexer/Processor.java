package Lexer;


import java.util.ArrayList; 
 import java.util.Random;

import Lexer.State;
import Lexer.Token;
import Lexer.BCCGraph;
import Lexer.BCCProperties;

public class Processor {
    
    public ArrayList<Token> tokens;
    
    public State current_state;
    public BCCGraph graph;
    
    public String string_read;
    public int initial_line;
    public int initial_column;
    
    public State last_state_valide;
    public String last_string_valide;
    
    public String buffer;
    
    public int cursor = 0; 
    public  String cadena = "BA\n A21++A \t 33.01 #2.1";
    
    
    
    public Processor(){
        this.buffer = "";
        this.string_read = "";
        this.initial_column = 0;
        this.initial_line = 0;
        
        this.tokens = new ArrayList<Token>();
        
        this.graph = new BCCGraph();
        this.current_state = graph.initial_state;
    }
    
    
    
    public String nextToken(){
        //Reiniciar Cosas
        this.current_state = this.graph.initial_state;
        this.string_read = "";
        
        this.last_state_valide = null;
        this.last_string_valide = "";
        
        
        //Va leyendo el codigo fuente hasta finalizar el token
        Character current_character = this.nextChar();
        
        while((current_character != null)){
            
            
            this.current_state = nextState(current_character); 
            
            //Ignorar comentarios
            if(BCCProperties.characters_line_comment.contains(current_character)){
                //Hacer el santo de linea
                this.saltarLineaFake();
                
            }
            
            //Ignorar espacio, tabulador, salto de linea y comentario pero contar estado
            if(!BCCProperties.characters_to_ignore.contains(current_character)){
                this.string_read = this.string_read + current_character;
            }
            
            
            
            if(this.current_state == null){break;}
            
            if(this.current_state.is_valide == true){
                this.last_state_valide = this.current_state;
                this.last_string_valide = this.string_read;
            }
            current_character = this.nextChar();
        }
        
        
        //Define si existio algun estado valido (casi siempre el ultimo)
        if(this.last_state_valide != null){
            //Generar Token Para ese estado
            this.generateToken(this.last_state_valide, this.last_string_valide, 0, 0);
            
            //Manda lo sobrante al buffer
            this.buffer = this.string_read.substring(this.last_string_valide.length(), this.string_read.length());
        }
        
        
        
        //Reportar error
        else if (this.current_state == null){
            this.generateError(this.string_read, 0, 0);
        }
        
        else if(this.current_state.type_state.equals("initial")){
        
        }
        
        
        return null;
    }
    
    
    public Character nextChar(){
        if(this.buffer.length() > 0){
            Character character =  this.buffer.charAt(0);
            this.buffer = this.buffer.substring(1, this.buffer.length());
            return character;
        }
        else{
            return lectorNextCharFake();
        }
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
    
    
    public Token generateToken(State token_state, String token_string, int line, int column){
        System.out.println(token_state.type_state + "  " + token_string);
        return null;
    }
    
    public void generateError(String error_string, int line, int column){    
        System.out.println("ERROR" + "  " + error_string);
    }
    
    
    //COSAS FAKES
    
    //Simula el salto de linea
    public void saltarLineaFake(){
        this.cursor = 0;
        this.cadena = "AAAABBABABAED 2.12";
    }
    
    
    public Character lectorNextCharFake(){
        try{
            Character character = this.cadena.charAt(cursor);
            this.cursor++;
            return character;
        } 
        catch(Exception e){
            return  null;
        }
    }
    
}
