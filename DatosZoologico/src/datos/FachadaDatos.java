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
public class FachadaDatos implements iDatos{
    
    private final VegetacionDAO vegetacionDAO;
    private final HabitatDAO habitatDAO;
    private final EspecieDAO espcieDAO;
    private final AnimalesDAO animalDAO;
    private final CuidadorDAO cuidadorDAO;
    private final ItinerarioDAO itinerarioDAO;
    private final QuejaDAO quejaDAO;
    private final ZonaDAO zonasDAO;
    private final GuiaDAO guiaDAO;

    public FachadaDatos() {
        habitatDAO = new HabitatDAO();
        vegetacionDAO = new VegetacionDAO();
        espcieDAO = new EspecieDAO();
        animalDAO = new AnimalesDAO();
        cuidadorDAO = new CuidadorDAO();
        itinerarioDAO = new ItinerarioDAO();
        quejaDAO = new QuejaDAO();
        zonasDAO = new ZonaDAO();
        guiaDAO = new GuiaDAO();
    }

    
    @Override
    public List<Habitat> buscarHabitat() throws DAOException{
        return habitatDAO.buscar();
    }

    @Override
    public void guardarHabitat(Habitat habitat) throws DAOException {
        habitatDAO.guardar(habitat);
    }

    @Override
    public List<Vegetacion> buscarVegetacion() throws DAOException {
        return vegetacionDAO.buscar();
    }

    @Override
    public void guardarVegetacion(Vegetacion vegetacion) throws DAOException {
        vegetacionDAO.guardar(vegetacion);
    }

    @Override
    public List<Especie> buscarEspecie() throws DAOException {
        return espcieDAO.buscar();
    }

    @Override
    public List<Animal> buscarAnimal(ObjectId idEspecie) throws DAOException {
        return animalDAO.buscarAnimal(idEspecie);
    }

    @Override
    public void guardarEspecie(Especie especie) throws DAOException {
        espcieDAO.guardar(especie);
    }

    @Override
    public List<Cuidador> buscarCuidador() throws DAOException {
        return cuidadorDAO.buscar();
    }

    @Override
    public Especie buscarEspecie(String nombreComun) throws DAOException {
        return espcieDAO.buscarNombre(nombreComun);
    }

    @Override
    public List<Zona> recuperarZonas() throws DAOException {
        return zonasDAO.buscar();
    }

    @Override
    public List<Guia> recuperarGuias() throws DAOException {
        return guiaDAO.buscar();
    }

    @Override
    public List<Itinerario> recuperItinerario() throws DAOException {
        return itinerarioDAO.buscar();
    }

    @Override
    public Itinerario recuperarItinerario(ObjectId id) throws DAOException {
        return itinerarioDAO.buscar(id);
    }

    @Override
    public void guardarItinerario(Itinerario itinerario) throws DAOException {
        itinerarioDAO.guardar(itinerario);
    }

    @Override
    public void guardarQueja(Queja queja) throws DAOException {
        quejaDAO.guardar(queja);
    }

    @Override
    public Itinerario recuperarItinerario(String itinerario) throws DAOException {
       return itinerarioDAO.buscarNombre(itinerario);
    }

    @Override
    public Zona recuperarZonas(ObjectId objectId) throws DAOException{
        return zonasDAO.buscar(objectId);

    }
    
}
