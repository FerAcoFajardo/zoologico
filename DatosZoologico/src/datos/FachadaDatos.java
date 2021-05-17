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
public class FachadaDatos implements iDatos{
    
    private VegetacionDAO vegetacionDAO;
    private HabitatDAO habitatDAO;

    public FachadaDatos() {
        habitatDAO = new HabitatDAO();
        vegetacionDAO = new VegetacionDAO();
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
    
}
