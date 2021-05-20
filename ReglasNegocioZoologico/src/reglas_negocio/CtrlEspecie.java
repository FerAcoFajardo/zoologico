/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas_negocio;

import datos.FabricaDatos;
import datos.iDatos;
import exceptions.DAOException;
import java.util.List;
import objetonegocio.Animal;
import objetonegocio.Especie;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class CtrlEspecie {
    
    private iDatos iDatos;
    
    
    public CtrlEspecie(iDatos iDatos) {
        this.iDatos = iDatos;
    }
    
    public List<Especie> buscarEspecie() throws DAOException{
        return iDatos.buscarEspecie();
    }
    
    public List<Animal> buscarAnimales(ObjectId idEspecie) throws DAOException{
        return iDatos.buscarAnimal(idEspecie);
    }
    
    public void guardarEspecie(Especie especie) throws DAOException{
        iDatos.guardarEspecie(especie);
    }
    
    public Especie buscarEspecie(String nombreComun) throws DAOException{
        return iDatos.buscarEspecie(nombreComun);
    }
    
    
    
}
