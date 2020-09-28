package Lexer.Models;

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
