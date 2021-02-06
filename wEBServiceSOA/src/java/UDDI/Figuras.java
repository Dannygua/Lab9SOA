/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Kirineko
 */
@WebService(serviceName = "Figuras")
public class Figuras {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "cuadrado")
    public double cuadrado(@WebParam(name = "lado1") double lado1 ,@WebParam(name = "lado2") double lado2 ) {
        return lado1+lado2;
    }
    
    @WebMethod(operationName = "triangulo")
    public double triangulo(@WebParam(name = "lado1") double lado1 ,@WebParam(name = "lado2") double lado2 ) {
        return lado1*lado2;
    }
}
