package Lexer.Models;

/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
*/

public class Error {
    public String error_type;
    public int row;
    public int column;

    public Error(String error_type, int row, int column) {
        this.error_type = error_type;
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return String.format(">>> " + this.error_type + "(línea:" + this.row + ",posición:" + this.column + ")");
    } 
}
