/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.regla_negocios;

import datos.FachadaDatos;
import infraestructura.Factory;
import java.util.List;
import objetonegocio.Habitat;

/**
 *
 * @author fernando
 */
public class CtrlHabitat {
    
    FachadaDatos fachada;
    
    
    public CtrlHabitat() {
        fachada = (FachadaDatos) Factory.crearDatos();
    }
    
    
    public List<Habitat> buscarHabitat(){
       return fachada.buscarHabitat();
    }
    
    public void guardarHabitat(Habitat habitat){
        fachada.guardarHabitat(habitat);
    }


    
}
