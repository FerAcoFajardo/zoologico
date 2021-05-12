/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.regla_negocios;

import datos.FachadaDatos;
import infraestructura.Factory;
import java.util.List;
import objetonegocio.Vegetacion;

/**
 *
 * @author fernando
 */
public class CtrlVegetacion {
    
    FachadaDatos fachada;
    
    
    public CtrlVegetacion() {
        fachada = (FachadaDatos) Factory.crearDatos();
    }
    
    public List<Vegetacion> recuperarVegetacion(){
        return fachada.buscarVegetacion();
    }
    
}
