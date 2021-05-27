/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas_negocio;

import exceptions.DAOException;
import java.util.List;
import objetonegocio.Animal;
import objetonegocio.Especie;
import objetonegocio.Habitat;
import objetonegocio.Itinerario;
import objetonegocio.Queja;
import objetonegocio.Zona;
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
    
    public List recuperarDatosFormHabitat() throws DAOException;
    
    public List recuperarDatosFormEspecie() throws DAOException;
    
    public List recuperarDatosFormQueja() throws DAOException;
    
    public void guadarEspecie(Especie especie) throws DAOException;

    public List recurerarDatosFormItinerario() throws DAOException;
    
   public void guardaItinerario(Itinerario itinerario) throws DAOException;
   
   public Itinerario recuperaItinerario(ObjectId id) throws DAOException;
   
   public Itinerario recuperaItinerario(String itinerio) throws DAOException;
   
   public List<Itinerario> recuperaItinerario() throws DAOException;
   
   public void guardarQueja(Queja queja) throws DAOException;
   
   public Zona recuperarZona(ObjectId objectId) throws DAOException;
}
