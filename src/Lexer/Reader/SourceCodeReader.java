package Lexer.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
*/

public class SourceCodeReader {

    public FileReader fr = null;
    public int line = 1;
    public int column = 0;
    public char prevChar = 0;

    public SourceCodeReader(String fileName) {
        try {
            fr = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado\n"+e.getMessage());
        }
    }

    public char nextChar() {
        try {
            line = (prevChar == '\n') ? line+1 : line;
            column = (prevChar == '\n') ? 1 : column+1;
            column = (prevChar == '\t') ? column+3 : column;
            int caracter = fr.read();
            if(caracter == 13)
                caracter = fr.read();
            prevChar = (caracter == -1) ? 0 :(char) caracter;
                
        } catch (IOException e) {
            System.out.println("Error de lectura del archivo\n"+e.getMessage());
        }
        return prevChar;
    }

    public char prevChar() {
        if(prevChar == '\n' || prevChar == 0)
            return nextChar();
        return prevChar;
    }
    
    public char nextLine(){
        while(prevChar!='\n' && prevChar!=0){
            try{
                int caracter = fr.read();
                prevChar = (caracter == -1) ? 0 :(char) caracter;
            }catch (IOException e) {
            System.out.println("Error de lectura del archivo\n"+e.getMessage());
            }
        }
        return prevChar;
    }
    
    public void closeFile() {
        try {
            if (fr != null) {
                fr.close();
            }
        } catch (IOException e) {
            System.out.println("Error al cerrar el fichero"+e.getMessage());
        }
    }

}
