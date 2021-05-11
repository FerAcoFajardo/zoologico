/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaszoologico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import objetonegocio.Animal;
import objetonegocio.Clima;
import objetonegocio.Continente;
import objetonegocio.Cuidador;
import objetonegocio.CuidadorEspecie;
import objetonegocio.Especie;
import objetonegocio.Guia;
import objetonegocio.Habitat;
import objetonegocio.Itinerario;
import objetonegocio.Queja;
import objetonegocio.Recorrido;
import objetonegocio.Sexo;
import objetonegocio.Vegetacion;
import objetonegocio.Zona;

/**
 *
 * @author fernando
 */
public class PruebasZoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Guia guia = new Guia("x", "x", "x", Calendar.getInstance());
        Cuidador cuidador = new Cuidador("x", "x", "x", new GregorianCalendar());
        
        Itinerario itinerario = new Itinerario(2, guia, new GregorianCalendar());
        
        Zona zona1 = new Zona("Zona 1", 50);
        Zona zona2 = new Zona("Zona 2", 100);
        
        
        Recorrido recorrido1 = new Recorrido(itinerario, zona1, 30, 50, 3);
        Recorrido recorrido2 = new Recorrido(itinerario, zona2, 20, 50, 4);
        
        
        Queja queja = new Queja(itinerario, new GregorianCalendar(), "5465464", "hotmai..co", "Pedro");
        
        Vegetacion vegetacion = new Vegetacion("Arbol", "Arbolis caluroso");
        Vegetacion pino = new Vegetacion("pino", "Arbolis pino");
        
        
        //ArrayList<> cotinentes = new ArrayList<>();
        
        Habitat habitat = new Habitat("Sabana", Clima.CALIDO, vegetacion, new ArrayList<>(Arrays.asList(Continente.AFRICA)) );
        Habitat tundra = new Habitat("Tundra", Clima.FRIO, pino, new ArrayList<>(Arrays.asList(Continente.AMERICA)));
        
        
        Especie leon = new Especie("Leon", "Leopardis leonis", "Es un felino", zona2, habitat);
        Especie lobo = new Especie("Lobo", "Canis chilus", "Es un perrito", zona1, tundra);
        
        Animal coyote = new Animal("El coyote",13 , lobo, Sexo.MACHO);
        Animal simba = new Animal("Simba", 13, leon, Sexo.MACHO);
        Animal coyote2 = new Animal("El coyote",13 , lobo, Sexo.HEMBRA);
        Animal simba2 = new Animal("Simba", 13, leon, Sexo.HEMBRA);
        
        
        lobo.setListaAnimales(new ArrayList<>(Arrays.asList(coyote,coyote2)));
        leon.setListaAnimales(new ArrayList<>(Arrays.asList(simba,simba2)));
        
        CuidadorEspecie cuidacion1 = new CuidadorEspecie(leon, cuidador,true);
        CuidadorEspecie cuidacion2 = new CuidadorEspecie(lobo, cuidador,false);
        
        
        System.out.println(cuidacion1.toString());
        System.out.println(cuidacion2.toString());
        
        System.out.println(recorrido1.toString());
        System.out.println(recorrido2.toString());
    
    
        System.out.println(queja);
    }
    
}
