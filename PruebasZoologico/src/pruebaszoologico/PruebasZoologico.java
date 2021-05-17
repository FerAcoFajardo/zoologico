/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaszoologico;

import datos.HabitatDAO;
import java.util.Arrays;
import objetonegocio.Clima;
import objetonegocio.Continente;
import objetonegocio.Habitat;
import objetonegocio.Vegetacion;

/**
 *
 * @author fernando
 */
public class PruebasZoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HabitatDAO habitatDAO = new HabitatDAO();
        
        Habitat habitat = new Habitat();
        habitat.setNombre("Desierto de sonora");
        habitat.setClima(Clima.CALIDO);
        habitat.setVegetacion(new Vegetacion("Pitaya", "Pitayus algo"));
        habitat.setContinentes(Arrays.asList(Continente.AMERICA));

        habitatDAO.guardar(habitat);
        
        // TODO code application logic here
        

    }
    
}
