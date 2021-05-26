/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas_negocio;

import datos.iDatos;
import exceptions.DAOException;
import java.util.List;
import objetonegocio.Animal;
import objetonegocio.Especie;
import objetonegocio.Habitat;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public interface iNegocios {  
    public List<Habitat> buscaHabitat() throws DAOException;
    public void guadarHabitat(Habitat habitat) throws DAOException;
    public Especie buscarEspecie(String nombreComun) throws DAOException;
    public List<Animal> recuperarAnimales(ObjectId idEspecie) throws DAOException;
//    public List<Vegetacion> recuperarVegetacion() throws DAOException;
//    public List<Continente> recuperarContinente() throws DAOException;
//    public List<Clima>recuperarClima() throws DAOException;
    
    public List recuperarDatosFormHabitat() throws DAOException;
    public List recuperarDatosFormEspecie() throws DAOException;

    public void guadarEspecie(Especie especie) throws DAOException;

}
