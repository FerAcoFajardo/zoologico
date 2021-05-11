
/*
* Vegetacion.java
 */
package objetonegocio;

import java.util.List;

/**
 *
 * @author fernando
 */
public class Vegetacion {
    private String nombre;
    private String nombreCientifico;
    private List<Habitat> habitat;
    
    public Vegetacion() {}

    /**
     * Contructor que crea una instancia con todos los atributos
     * @param nombre Nombre de la vegetación
     * @param nombreCientifico Nombre cientifico de la planta
     */
    public Vegetacion(String nombre, String nombreCientifico) {
        this.nombre           = nombre;
        this.nombreCientifico = nombreCientifico;
    }

    public Vegetacion(String nombre, String nombreCientifico, List<Habitat> habitat) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.habitat = habitat;
    }

    /**
     * Método que regresa todos los atributos de la vegetación
     * @return Regresa todos los atributos de la vegetación
     */
    @Override    
    public String toString() {
        return "Vegetacion{" + "nombre=" + nombre + ", nombreCientifico=" + nombreCientifico + '}';
    }

    /**
     * Método que regresa el nombre de la planta
     * @return Regresa el nombre de la planta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre de la planta
     * @param nombre Nombre de la planta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que regresa el nombre cientifico de la planta
     * @return Regresa el nombre cientifico de la planta
     */
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    /**
     * Método que establece el nombre cientifico de la planta
     * @param nombreCientifico Nombre cientifico de la planta
     */
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public List<Habitat> getHabitat() {
        return habitat;
    }

    public void setHabitat(List<Habitat> habitat) {
        this.habitat = habitat;
    }
    
    
}


//~ Formatted by Jindent --- http://www.jindent.com
