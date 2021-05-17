/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import exceptions.DAOException;
import objetonegocio.Especie;

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
//        HabitatDAO habitatDAO = new HabitatDAO();
//        
//        Habitat habitat = new Habitat();
//        habitat.setNombre("Desierto de sonora");
//        habitat.setClima(Clima.CALIDO);
//        habitat.setVegetacion(new Vegetacion("Pitaya", "Pitayus algo"));
//        habitat.setContinentes(Arrays.asList(Continente.AMERICA));
       
//       Habitat habitat = habitatDAO.buscar("60a190e8ef7a452446445430");
       
       //habitat.agregarContinente(Continente.AFRICA);
//       habitat.agregarEspecie(new Especie("si", "si", "si"));

//        habitatDAO.guardar(habitat);

//        CuidadorDAO cuidadorDAO = new CuidadorDAO();
//        
//        Cuidador cuidador = new Cuidador("Pedro", "Su casa", "645648321", new Date());
//        
//        cuidadorDAO.guardar(cuidador);

        EspecieDAO especieDAO = new EspecieDAO();
        
        Especie especie = new Especie("Pantena", "Panteris", "Es un gran gato");
        
        especieDAO.guardar(especie);
        
        // TODO code application logic here
        

    }
    
}
