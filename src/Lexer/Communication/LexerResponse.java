package Lexer.Communication;

import Lexer.Models.Error;
import Lexer.Models.Token;
import Lexer.*;



public class LexerResponse {
    public Token token;
    public Error error; 
    public String type_response; 

    public LexerResponse(Error error) {
        this.error = error;
        this.type_response = "error";
    }
    
    public LexerResponse(Token token){
        this.token = token;
        this.type_response = "token";
    }

    public LexerResponse(String type_response) {
        this.type_response = type_response;
    }
    
}