/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import exceptions.DAOException;
import java.util.List;
import objetonegocio.Habitat;
import objetonegocio.Vegetacion;

/**
 *
 * @author fernando
 */
public interface iDatos {
    
    List<Habitat> buscarHabitat() throws DAOException;
    
    public void guardarHabitat(Habitat habitat) throws DAOException;
    
    /**
     *
     * @return
     */
    public List<Vegetacion> buscarVegetacion() throws DAOException;
    
    void guardarVegetacion(Vegetacion vegetacion) throws DAOException;
    
    
}
