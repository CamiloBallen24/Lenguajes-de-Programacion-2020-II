package Lexer.BCC;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen    - cgilb@unal.edu.co
*/

public class BCCProperties {
    
    private static ArrayList<Character> characters_to_ignore;
    
    private static ArrayList<Character> characters_line_comment;
    private static final ArrayList<String> reservedWords = new ArrayList<String>( Arrays.asList("else", "var", "num", "bool", "while", "when", "print", "end", "function", "if", "true", "false", "do", "return", "for", "input", "unless", "until", "loop", "repeat", "next", "break", "and", "or", "not"));
    
    static {
        characters_to_ignore  = new ArrayList<Character>();
        characters_to_ignore.add('\n');
        characters_to_ignore.add('\t');
        characters_to_ignore.add(' ');
        characters_to_ignore.add('#');
        
        
        characters_line_comment = new ArrayList<>();
        characters_line_comment.add('#');
        
    }
    
    public static ArrayList<Character> getCharactersToIgnore(){
        return characters_to_ignore;
    }

    public static ArrayList<Character> getCharactersLineComment(){
        return characters_line_comment;
    }

    public static ArrayList<String> getReserverWords(){
        return reservedWords;
    }
}
