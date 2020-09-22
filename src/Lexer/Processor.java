package Lexer;

import java.util.ArrayList; 
 import java.util.Random;

import Lexer.State;
import Lexer.Token;
import Lexer.BCCGraph;
import Lexer.BCCProperties;

public class Processor {
    
    public ArrayList<Token> tokens;
    
    public Reader reader;
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
    
    
    public Processor(String fileName){
        this.reader = new Reader(fileName);
        
        this.buffer = "";
        this.string_read = "";
        this.initial_column = 0;
        this.initial_line = 0;
        
        this.tokens = new ArrayList<>();
        
        this.graph = new BCCGraph();
        this.current_state = BCCGraph.initial_state;
    }
    
    public String nextToken(){
        //Reiniciar Cosas
        this.current_state = BCCGraph.initial_state;
        this.string_read = "";
        
        this.last_state_valide = null;
        this.last_string_valide = "";
        
        
        //Va leyendo el codigo fuente hasta finalizar el token
        Character current_character;
        do{
            current_character = this.nextChar();
            this.initial_column = reader.column;
            this.initial_line = reader.line;
        }while(BCCProperties.characters_to_ignore.contains(current_character));
        
        while((current_character != null)){
            
            this.current_state = nextState(current_character); 
            
            //Ignorar comentarios
            if(BCCProperties.characters_line_comment.contains(current_character)){
                this.reader.nextLine();
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
            this.generateToken(this.last_state_valide, this.last_string_valide, this.initial_line, this.initial_column);
            
            //Manda lo sobrante al buffer
            this.buffer = this.string_read.substring(this.last_string_valide.length());
        }
        
        //Reportar error
        else if (this.current_state == null){
            this.generateError(this.string_read, this.initial_line, this.initial_column);
        }
        
        else if(this.current_state.type_state.equals("initial")){
        
        }
        return null;
    }
    
    public Character nextChar(){
        if(this.buffer.length() > 0){
            Character character =  this.buffer.charAt(0);
            this.buffer = this.buffer.substring(1);
            return character;
        }else{
            return reader.nextChar();
        }
    }
    
    public State nextState(Character character){
        ArrayList<Connection> connections_current_state = BCCGraph.connectionsByState(this.current_state);
        
        for (Connection connection : connections_current_state) {
            if(connection.chars_options.contains(character)){
                return connection.goal_state;
            }
        }    
        return null;
    }
    
    public Token generateToken(State token_state, String token_string, int line, int column){
        System.out.println(token_state.type_state + "  " + token_string+"\nLine: "+line+"   Column: "+column);
        return null;
    }
    
    public void generateError(String error_string, int line, int column){
        System.out.println("ERROR " + error_string + "\nIn line: "+line+"\nIn column: "+column);
    }
}
