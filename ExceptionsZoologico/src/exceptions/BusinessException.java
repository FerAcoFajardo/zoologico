/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * Excepciones de reglas de negocio
 * @author fernando
 */
public class BusinessException extends Exception{


    /**
     * Constructor con un mensaje
     * @param string Mensaje del error
     */
    public BusinessException(String string) {
        super(string);
    }

    /**
     * Contructor con un mensaje y un lanzable
     * @param string Mensaje del error
     * @param thrwbl Lanzable del error
     */
    public BusinessException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    /**
     * Contructor con un lanzabale
     * @param thrwbl Lanzable del error
     */
    public BusinessException(Throwable thrwbl) {
        super(thrwbl);
    }
    
    
    
}
