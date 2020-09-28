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
    
    public static ArrayList<Character> characters_to_ignore;
    
    public static ArrayList<Character> characters_line_comment;
    public static final ArrayList<String> reservedWords = new ArrayList<String>( Arrays.asList("else", "var", "num", "bool", "while", "when", "print", "end", "function", "if", "true", "false", "do", "return", "for", "input", "unless", "until", "loop", "repeat", "next", "break", "and", "or", "not"));
    public static final Character[] letterList = new Character[]{'_', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static final Character[] numberList = new Character[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final Character[] letterNumberList = new Character[]{'_', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    

    static {
        characters_to_ignore  = new ArrayList<Character>();
        characters_to_ignore.add('\n');
        characters_to_ignore.add('\t');
        characters_to_ignore.add(' ');
        characters_to_ignore.add('#');
        
        
        characters_line_comment = new ArrayList<>();
        characters_line_comment.add('#');
        
    }    
}
