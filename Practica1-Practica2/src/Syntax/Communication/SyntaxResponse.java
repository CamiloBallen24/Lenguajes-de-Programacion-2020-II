/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Syntax.Communication;
/**
 * Autores - Practica #01:
 * Julian David Acosta Bello   - jdacostabe@unal.edu.co
 * Andres Felipe Castillo Sopo - acastillos@unal.edu.co
 * Camilo Andres Gil Ballen - cgilb@unal.edu.co
*/
public class SyntaxResponse {
    public String type_response;
    public String response;

    public SyntaxResponse(String type_response, String message) {
        this.response = message;
        this.type_response = "success";
    }
}
