/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;
import objetonegocio.Habitat;
import objetonegocio.Vegetacion;

/**
 *
 * @author fernando
 */
public interface iDatos {
    
    List<Habitat> buscarHabitat();
    
    public void guardarHabitat(Habitat habitat);
    
    /**
     *
     * @return
     */
    public List<Vegetacion> buscarVegetacion();
    
    void guardarVegetacion(Vegetacion vegetacion);
    
    
}
