/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import exceptions.DAOException;
import java.util.List;
import objetonegocio.Animal;
import objetonegocio.Cuidador;
import objetonegocio.Especie;
import objetonegocio.Guia;
import objetonegocio.Habitat;
import objetonegocio.Itinerario;
import objetonegocio.Queja;
import objetonegocio.Vegetacion;
import objetonegocio.Zona;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public interface iDatos {
    

    public List<Habitat> buscarHabitat() throws DAOException;

    public List<Especie> buscarEspecie() throws DAOException;

    public List<Cuidador> buscarCuidador() throws DAOException;

    List<Animal> buscarAnimal(ObjectId idEspecie) throws DAOException;
    
    public void guardarHabitat(Habitat habitat) throws DAOException;

    public void guardarEspecie(Especie especie) throws DAOException;
    
    public List<Vegetacion> buscarVegetacion() throws DAOException;
    
    void guardarVegetacion(Vegetacion vegetacion) throws DAOException;
    
    public Especie buscarEspecie(String nombreComun) throws DAOException;
    
    public List<Zona> recuperarZonas() throws DAOException;
    
    public List<Guia> recuperarGuias() throws DAOException;

    public List<Itinerario> recuperItinerario() throws DAOException;
    
    public Itinerario recuperarItinerario(ObjectId id) throws DAOException;
    
    public Itinerario recuperarItinerario(String itinerario) throws DAOException;
    
    public void guardarItinerario(Itinerario itinerario) throws DAOException;
    
    public void guardarQueja(Queja queja) throws DAOException;


    public Zona recuperarZonas(ObjectId objectId) throws DAOException;
    
}
