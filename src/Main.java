import Lexer.*;
import Lexer.Communication.LexerResponse;
import Syntax.Models.Grammar;
import Syntax.Reader.GrammarReader;
import Syntax.SyntaxAnalyzer;



import java.io.FileWriter;
import java.io.IOException;


import java.util.Scanner;


/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
*/

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner entradaEscaner = new Scanner (System.in);
      
        try {
            FileWriter escritorArchivo = new FileWriter("src/Files/codigo.txt");
            while(entradaEscaner.hasNextLine()) {
                escritorArchivo.write(entradaEscaner.nextLine()+"\n");
            }
            
            escritorArchivo.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        

        Lexer lexerBCC = new Lexer("src/Files/codigo.txt");
        GrammarReader grammar_reader = new GrammarReader("src//Files//gramatica.txt");
        Grammar my_grammar = grammar_reader.getGrammar();
        
        
        SyntaxAnalyzer analyzer = new SyntaxAnalyzer(lexerBCC, my_grammar);
        System.out.println(analyzer.analyze().response);
        
        
        
//        LexerResponse response = lexerBCC.nextToken();
//        
//        while(response.getTypeResponse().equals("token")){
//            System.out.println(response.getToken().token_name());
//            response = lexerBCC.nextToken();
//        }
//        if(response.getTypeResponse().equals("error")){
//            System.out.println(response.getError().toString());
//        }
        
        
    }
}
