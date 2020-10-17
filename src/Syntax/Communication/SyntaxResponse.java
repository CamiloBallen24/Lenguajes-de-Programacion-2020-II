/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Syntax.Communication;

/**
 *
 * @author julia
 */
public class SyntaxResponse {
    public String type_response;
    public String response;

    public SyntaxResponse(String type_response, String message) {
        this.response = message;
        this.type_response = "success";
    }
}
