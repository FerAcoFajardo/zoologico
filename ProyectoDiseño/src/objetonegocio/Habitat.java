
/*
* Habitat.java
 */
package objetonegocio;

import java.util.ArrayList;

/**
 *
 * @author fernando
 */
public class Habitat {

    private String nombre;
    private Clima clima;
    private Vegetacion vegetacion;
    private ArrayList continentes;
    private ArrayList<Especie> especies;

    public Habitat() {
    }
    
    /**
     * Contructor que crea un habitat con todos los datos necesarios
     *
     * @param nombre Nombre del habitat
     * @param clima Clima del habitat
     * @param vegetacion Lista de vegetación del habitat
     * @param continentes Continentes del habitat
     */
    public Habitat(String nombre, Clima clima, Vegetacion vegetacion, ArrayList continentes) {
        this.nombre = nombre;
        this.clima = clima;
        this.vegetacion = vegetacion;
        this.continentes = continentes;
    }

    /**
     * Método que regresa todos los atributos de la instancia de habitat
     *
     * @return Regresa todos los atributos del habitat
     */
    @Override    
    public String toString() {
        return "Habitat{" + "nombre=" + nombre + ", clima=" + clima + ", vegetacion=" + vegetacion + '}';
    }

    /**
     * Regresa el clima del habitat
     *
     * @return Regresa el clima del habitat
     */
    public Clima getClima() {
        return clima;
    }

    /**
     * Método que establece el clima del habitat
     *
     * @param clima Clima del habitat
     */
    public void setClima(Clima clima) {
        this.clima = clima;
    }

    /**
     * Método que regresa la lista de continentes de habitat
     *
     * @return Regresa la lista de continentes del habitat
     */
    public ArrayList<Continente> getContinentes() {
        return continentes;
    }

    /**
     * Método que establece la lista de continentes del habitat
     *
     * @param continentes Continentes del habitat
     */
    public void setContinentes(ArrayList<Continente> continentes) {
        this.continentes = continentes;
    }

    /**
     * Método que regresa la vegetación del habitat
     *
     * @return Regresa la vegetación del habitat
     */
    public Vegetacion getVegetacion() {
        return vegetacion;
    }

    /**
     * Método que establece la vegetación del habitat
     *
     * @param vegetacion Vegetacion del habitat
     */
    public void setVegetacion(Vegetacion vegetacion) {
        this.vegetacion = vegetacion;
    }

    /**
     * Método que regresa el nombre del habitat
     *
     * @return Regresa el nombre del habitat
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del habitat
     *
     * @param nombre Nombre del habitat
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Especie> getEspecies() {
        return especies;
    }

    public void setEspecies(ArrayList<Especie> especies) {
        this.especies = especies;
    }
    
    
    
}


//~ Formatted by Jindent --- http://www.jindent.com
