/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestructura;

import datos.FachadaDatos;
import datos.iDatos;
import logica.regla_negocios.FachadaRN;
import logica.regla_negocios.iNegocios;

/**
 *
 * @author fernando
 */
public class Factory {
    public static iDatos crearDatos(){
        return new FachadaDatos();
    }
    
    public static iNegocios crearNegocios(){
        return new FachadaRN();
    }
    
    
}
