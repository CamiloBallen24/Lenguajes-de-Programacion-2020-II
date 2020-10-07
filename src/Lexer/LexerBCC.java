package Lexer;

import Lexer.Communication.LexerResponse;
import Lexer.Models.Connection;
import Lexer.Models.Error;
import Lexer.Reader.SourceCodeReader;

import java.util.ArrayList; 
import java.util.Random;

import Lexer.Models.State;
import Lexer.Models.Token;
import Lexer.BCC.BCCGraph;
import Lexer.BCC.BCCProperties;

public class LexerBCC {
    
    private ArrayList<Token> tokens;

    public SourceCodeReader reader;
    public State current_state;
    public BCCGraph graph;
    
    private String string_read;
    private int initial_line;
    private int initial_column;
    
    private State last_state_valide;
    private String last_string_valide;
    
    private String buffer;
    
    private Boolean is_active;
    
    
    
    
    public LexerBCC(String fileName){
        this.reader = new SourceCodeReader(fileName);
        
        this.buffer = "";
        this.string_read = "";
        this.initial_column = 0;
        this.initial_line = 0;
        
        this.tokens = new ArrayList<>();
        
        this.graph = new BCCGraph();
        this.current_state = BCCGraph.getInitialState();
        
        this.is_active = Boolean.TRUE;
    }
    
    public LexerResponse nextToken(){
        if(!this.is_active){
            return  new LexerResponse("lexer_end");
        }
        
        //Reiniciar Cosas
        this.current_state = BCCGraph.getInitialState();
        this.string_read = "";
        
        this.last_state_valide = null;
        this.last_string_valide = "";
        
        
        //Va leyendo el codigo fuente hasta finalizar el token
        Character current_character;
        do{
            current_character = this.nextChar();
            this.initial_column = reader.getColumn() - buffer.length();
            this.initial_line = reader.getLine();
            if(BCCProperties.getCharactersLineComment().contains(current_character)) this.reader.nextLine();
        }while(BCCProperties.getCharactersToIgnore().contains(current_character));
        
        
        if(current_character==0){
            this.is_active = Boolean.FALSE;
            return  new LexerResponse("file_end");
        }
        
        while((current_character != null)){
            
            this.current_state = nextState(current_character); 
            this.string_read = this.string_read + current_character;   
            
            if(this.current_state == null) break;
            
            if(this.current_state.getIsValide() == true){
                this.last_state_valide = this.current_state;
                this.last_string_valide = this.string_read;
            }
            current_character = this.nextChar();
        }
        
        //Define si existio algun estado valido (casi siempre el ultimo)
        if(this.last_state_valide != null){
            //Generar Token Para ese estado
            Token token = this.generateToken(this.last_state_valide, this.last_string_valide, this.initial_line, this.initial_column);
            
            //Manda lo sobrante al buffer
            this.buffer = this.string_read.substring(this.last_string_valide.length());
            
            return new LexerResponse(token);
        }
        
        //Reportar error
        else if (this.current_state == null){
            this.is_active = Boolean.FALSE;
            Error error = this.generateError("Error léxico", this.initial_line, this.initial_column);
            return new LexerResponse(error);
        }
        
        else if(this.current_state.getTypeState().equals("initial")){
        
        }
        this.is_active = Boolean.FALSE;
        return new LexerResponse("other_case");
    }
    

    
    public State nextState(Character character){
        ArrayList<Connection> connections_current_state = BCCGraph.connectionsByState(this.current_state);
        
        for (Connection connection : connections_current_state) {
            if(connection.getCharOptions().contains(character)){
                return connection.getGoalState();
            }
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
    public Token generateToken(State token_state, String token_string, int line, int column){
        this.tokens.add(new Token(token_state, token_string, line, column));
        return new Token(token_state, token_string, line, column);
    }
    
    public Error generateError(String error_string, int line, int column){
        Error error = new Error(error_string, line, column);
        return error;
    }

    public void generateTokenReport(){
        this.tokens.forEach(x -> System.out.println(x));
    }


    
}
