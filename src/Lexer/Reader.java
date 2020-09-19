package Lexer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public FileReader fr = null;
    public int line = 1;
    public int column = 0;
    public char prevChar = '\n';

    public Reader(String fileName) {
        try {
            fr = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado\n"+e.getMessage());
        }
    }

    public char nextChar() {
        try {
            int caracter = fr.read();
            if(caracter == 13)
                caracter = fr.read();
            prevChar = (caracter == -1) ? 0 :(char) caracter;
            column = (prevChar == '\n') ? 0 : column+1;
            line = (prevChar == '\n') ? line+1 : line;
                
        } catch (IOException e) {
            System.out.println("Error de lectura del archivo\n"+e.getMessage());
        }
        return prevChar;
    }

    public char prevChar() {
        if(prevChar == '\n')
            return nextChar();
        return prevChar;
    }
    
    public char nextLine(){
        column = 0;
        line = line+1;
        while(prevChar!='\n' && prevChar!=0){
            try{
                int caracter = fr.read();
                prevChar = (caracter == -1) ? 0 :(char) caracter;
            }catch (IOException e) {
            System.out.println("Error de lectura del archivo\n"+e.getMessage());
            }
        }
        if(prevChar==0)
            return prevChar;
        return nextChar();
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
