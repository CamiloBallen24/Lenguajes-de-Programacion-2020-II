package Lexer;

import java.util.ArrayList;
import java.util.Arrays;

public class BCCProperties {
    
    public static ArrayList<Character> characters_to_ignore;
    
    public static ArrayList<Character> characters_line_comment;
    public static ArrayList<String> reservedWords = new ArrayList<String>( Arrays.asList("var", "num", "bool", "while", "when", "print", "end", "function", "if", "true", "false", "do", "return", "for", "input", "unless", "until", "loop", "repeat", "next", "break", "and", "or", "not"));
    
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
