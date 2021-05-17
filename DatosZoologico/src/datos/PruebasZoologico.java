/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import exceptions.DAOException;
import java.util.Arrays;
import objetonegocio.Clima;
import objetonegocio.Continente;
import objetonegocio.Especie;
import objetonegocio.Habitat;
import objetonegocio.Vegetacion;

/**
 *
 * @author fernando
 */
public class PruebasZoologico {

    /**
     * @param args the command line arguments
     * @throws exceptions.DAOException
     */
    public static void main(String[] args) throws DAOException {
        HabitatDAO habitatDAO = new HabitatDAO();
        
//        Habitat habitat = new Habitat();
//        habitat.setNombre("Desierto de sonora");
//        habitat.setClima(Clima.CALIDO);
//        habitat.setVegetacion(new Vegetacion("Pitaya", "Pitayus algo"));
//        habitat.setContinentes(Arrays.asList(Continente.AMERICA));
       
       //Habitat habitat = habitatDAO.buscar("60a190e8ef7a452446445430");
       
       //habitat.agregarContinente(Continente.AFRICA);
//       habitat.agregarEspecie(new Especie("si", "si", "si"));

        habitatDAO.eliminar("60a190e8ef7a452446445430");
        
        // TODO code application logic here
        

    }
    
}
