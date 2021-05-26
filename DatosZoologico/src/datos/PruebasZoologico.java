/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import exceptions.DAOException;
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
//        EspecieDAO especieDAO = new EspecieDAO();
//        
//        List<Animal> animales = new ArrayList<>();
//        
//        animales.add(new Animal("Pedro", 4, Sexo.MACHO));
//        animales.add(new Animal("Nomche", 6, Sexo.MACHO));
//        animales.add(new Animal("Bibi", 3, Sexo.HEMBRA));
//        
//        Especie especie = new Especie("Pantera", "Panteris", "Es un gran gato");
//        especie.setAnimales(animales);
//        
//        
//        especieDAO.guardar(especie);
        //AnimalesDAO animalesDAO = new AnimalesDAO();
        //Animal pedro = new Animal("Bibi", 3, Sexo.HEMBRA);
        //animalesDAO.agregarAnimal(new ObjectId("60a357618d6a2d6303dffe88"), pedro/*"Bibi"*/);
        // TODO code application logic here
//        CuidadorDAO cuidadorDAO = new CuidadorDAO();
//        
//        Cuidador cuidador = new Cuidador("Pepe", "Su caso", "65498731", new Date());
//        
//        Cuidador cuidadorConsultado = cuidadorDAO.buscar("60a35c092b8faa63fd7b3c02");
//        
//        cuidadorConsultado.setDireccion("su casas");
//        
//        cuidadorDAO.eliminar("60a35c092b8faa63fd7b3c02");
//        GuiaDAO guiaDAO = new GuiaDAO();
//        
//        Guia guia = new Guia("Pepe", "Su caso", "65498731", new Date());
//        Guia guia = guiaDAO.buscar("60a361a124510e718111186d");
//        
//        
//        guia.setNombre("Caballo Homosexual");
//        guiaDAO.eliminar("60a361ba16903b3dbd5d0a2d");
//    
//    
//        AnimalesDAO animalesDAO = new AnimalesDAO();
//        
//        List<Animal> animales = animalesDAO.buscarAnimal(new ObjectId("60a357618d6a2d6303dffe88"));
//        if(animales.isEmpty()){
//            System.out.println("Ta vacio");
//        }
//            
//        for (Animal animal : animales) {
//            System.out.println(animal);
//        }
    
//        ItinerarioDAO itinerarioDAO = new ItinerarioDAO();
//        QuejaDAO quejaDAO = new QuejaDAO();
//
//        GuiaDAO guiaDAO = new GuiaDAO();
//        
//        Guia guia = guiaDAO.buscar("60a361a124510e718111186d");
//        
//        Itinerario itinerario = new Itinerario("El de la mañana", 3,guia.getId() , new Date());
//        
//        itinerarioDAO.guardar(itinerario);
//        
//        Itinerario itinerario = itinerarioDAO.buscar("60a36ef4839c1d375494ecc3");
//        
//        Queja queja = new Queja(itinerario, new Date(), "6321654", "algo@algo.com", "Jaun");
//        
//        ObjectId.guardar(queja);
//
//        Queja queja = quejaDAO.buscar("60a36fa931af584fb25c6b1c");
//        
//        itinerarioDAO.agregarQueja(itinerario.getId(), queja.getId());

//        VegetacionDAO vegetacionDAO = new VegetacionDAO();
//
//        Vegetacion vegetacion = new Vegetacion("Pitaya", "Pitayus algo");
//        
//
//        //Vegetacion vegetacion = vegetacionDAO.buscar("60a3717af9b8845576b19fd7");
//        
//        vegetacion.setNombreCientifico("Stenocereus thurberi");
//        vegetacionDAO.actualizar(vegetacion);
        
//        ZonasDAO zonaDAO = new ZonasDAO();
//        EspecieDAO especieDAO = new EspecieDAO();
        
//        List<Especie> especies = especieDAO.buscar();
//        
//        List<ObjectId> especieses = new ArrayList();
//        
//        especies.forEach(especie -> {
//            especieses.add(especie.getId());
//        });
//        
//        Zona zona = new Zona(especieses, "zona 1", 130.0f);
//        
//        zonaDAO.guardar(zona);

//        Zona zona = zonaDAO.buscar("60a3755b457b0c36c46daa8b");
//        
//        zona.setNombre("Zona 1 remodelada");
//        
//        zonaDAO.actualizar(zona);
//
//
//        RecorridoDAO recorridoDAO = new RecorridoDAO();
//        
//        Recorrido recorrido = new Recorrido(zona.getId(), 60, 200,zona.getEspecies().size() );
//
//  
//
//        Recorrido recorrido = recorridoDAO.buscar("60a3776f5ab431630f0e29aa");
//        
//        recorrido.setDuracion(90);
//        
//        recorridoDAO.actualizar(recorrido);
//recorridoDAO.guardar(recorrido);


        VegetacionDAO vegetacionDAO = new VegetacionDAO();

        Vegetacion vegetacion1 = new Vegetacion("Arbusto enano", "Abutilon Enano");
        Vegetacion vegetacion2 = new Vegetacion("Pochote", "Pachira quinata");
        Vegetacion vegetacion3 = new Vegetacion("Sahuaro", "Carnegiea gigantea");
        Vegetacion vegetacion4 = new Vegetacion("Pitaya", "Stenocereus thurberi");
        
        vegetacionDAO.guardar(vegetacion3);
        vegetacionDAO.guardar(vegetacion2);
        vegetacionDAO.guardar(vegetacion1);
        vegetacionDAO.guardar(vegetacion4);

    }
    
    

}
