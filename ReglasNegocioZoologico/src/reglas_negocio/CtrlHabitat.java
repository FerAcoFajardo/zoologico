/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas_negocio;

import datos.FabricaDatos;
import datos.FachadaDatos;
import datos.iDatos;
import exceptions.DAOException;
import java.util.List;
import objetonegocio.Habitat;

/**
 *
 * @author fernando
 */
public class CtrlHabitat {
    
    iDatos iDatos;
    
    
    public CtrlHabitat() {
        iDatos = FabricaDatos.crearDatos();
    }
    
    
    public List<Habitat> buscarHabitat() throws DAOException{
       return iDatos.buscarHabitat();
    }
    
    public void guardarHabitat(Habitat habitat) throws DAOException{
        iDatos.guardarHabitat(habitat);
    }


    
}
