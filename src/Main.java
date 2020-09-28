

import Lexer.*;
import Lexer.Communication.LexerResponse;


import java.io.FileWriter;
import java.io.IOException;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner entradaEscaner = new Scanner (System.in);
      
        try {
            FileWriter escritorArchivo = new FileWriter("src/codigo.txt");
            while(entradaEscaner.hasNext()) {
                escritorArchivo.write(entradaEscaner.nextLine()+"\n");
            }
            
            //for (int i = 0; i < 5; i++) {
            //    escritorArchivo.write(entradaEscaner.nextLine()+"\n");
            //}
            
            escritorArchivo.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        LexerBCC procesador = new LexerBCC("src/codigo.txt");
        LexerResponse response = procesador.nextToken();
        
        while(response.type_response.equals("token")){
            System.out.println(response.token.toString());
            response = procesador.nextToken();
        }
        if(response.type_response.equals("error")){
            System.out.println(response.error.toString());
        }
        
        
    }
}