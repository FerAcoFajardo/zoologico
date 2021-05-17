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
import objetonegocio.Habitat;
import objetonegocio.Vegetacion;
import org.bson.types.ObjectId;



/**
 *
 * @author fernando
 */
public class FachadaDatos implements iDatos{
    
    private final VegetacionDAO vegetacionDAO;
    private final HabitatDAO habitatDAO;
    private final EspecieDAO espcieDAO;
    private final CuidadorDAO cuidadorDAO;

    public FachadaDatos() {
        habitatDAO = new HabitatDAO();
        vegetacionDAO = new VegetacionDAO();
        espcieDAO = new EspecieDAO();
        cuidadorDAO = new CuidadorDAO();
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
        return espcieDAO.buscarAnimal(idEspecie);
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

    
}
