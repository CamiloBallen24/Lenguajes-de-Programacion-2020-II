package Lexer.Communication;

import Lexer.Models.Error;
import Lexer.Models.Token;
import Lexer.*;

/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
*/


public class LexerResponse {
    private Token token;
    private Error error; 
    private String type_response; 

    public LexerResponse(Error error) {
        this.error = error;
        this.type_response = "error";
    }
    
    public LexerResponse(Token token){
        this.token = token;
        this.type_response = "token";
    }

    public LexerResponse(Token token, String type_response) {
        this.token = token;
        this.type_response = type_response;
    }

    public LexerResponse(String type_response) {
        this.type_response = type_response;
    }

    public Token getToken(){
        return token;
    }

    public Error getError(){
        return error;
    }

    public String getTypeResponse(){
        return type_response;
    }
}
