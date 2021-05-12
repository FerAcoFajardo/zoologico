/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

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
    public List<Habitat> buscarHabitat() {
        return habitatDAO.buscar();
    }

    @Override
    public void guardarHabitat(Habitat habitat) {
        habitatDAO.guardar(habitat);
    }

    @Override
    public List<Vegetacion> buscarVegetacion() {
        return vegetacionDAO.buscar();
    }

    @Override
    public void guardarVegetacion(Vegetacion vegetacion) {
        vegetacionDAO.guardar(vegetacion);
    }
    
}
