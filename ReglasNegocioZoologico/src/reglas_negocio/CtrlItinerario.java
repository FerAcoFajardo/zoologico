/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas_negocio;

import datos.iDatos;
import exceptions.DAOException;
import java.util.List;
import objetonegocio.Itinerario;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class CtrlItinerario {
    
    iDatos iDatos;

    public CtrlItinerario(iDatos iDatos) {
        this.iDatos = iDatos;
    }

    public List<Itinerario> recuperaItinerario() throws DAOException{
        return iDatos.recuperItinerario();
    }
    
    public Itinerario recuperaItinerario(ObjectId id) throws DAOException{
        return iDatos.recuperarItinerario(id);
    }
    
    public void guardarItinerario(Itinerario itinerario) throws DAOException{
        iDatos.guardarItinerario(itinerario);
    }
    
    
}
