package Lexer;

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
            escritorArchivo.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        Processor procesador = new Processor("src/codigo.txt");
        procesador.nextToken();
        procesador.nextToken();
        procesador.nextToken();
        procesador.nextToken();
        procesador.nextToken();
        procesador.nextToken();
        procesador.nextToken();
        procesador.nextToken();
        procesador.nextToken();
        procesador.nextToken();
        procesador.nextToken();
        procesador.nextToken();
        procesador.nextToken();
        procesador.nextToken();
    }
}
