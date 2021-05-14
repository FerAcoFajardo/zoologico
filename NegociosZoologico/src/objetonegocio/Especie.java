
/*
* Especie.java
 */
package objetonegocio;

import java.util.ArrayList;

/**
 *
 * @author fernando
 */
public class Especie {
    private ArrayList<Animal> listaAnimales;
    private String            nombreNormal;
    private String            nombreCientifico;
    private String            descripcion;
    private ArrayList<CuidadorEspecie> listaCuidadoresEspecie;
    private Zona zona;
    private Habitat habitat;
    
    public Especie() {}

    public Especie(ArrayList<Animal> listaAnimales, String nombreNormal, String nombreCientifico, String descripcion, ArrayList<CuidadorEspecie> listaCuidadoresEspecie, Zona zona, Habitat habitat) {
        this.listaAnimales = listaAnimales;
        this.nombreNormal = nombreNormal;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.listaCuidadoresEspecie = listaCuidadoresEspecie;
        this.zona = zona;
        this.habitat = habitat;
    }

    public Especie(String nombreNormal, String nombreCientifico, String descripcion, Zona zona, Habitat habitat) {
        this.nombreNormal = nombreNormal;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.zona = zona;
        this.habitat = habitat;
    }

    /**
     * Contruye una instancia de especie de animal
     * @param listaAnimales Lista de animales que pertenecen a la especie
     * @param nombreNormal Nombre normal de la especie
     * @param nombreCientifico Nombre cientifico de la especie
     * @param descripcion Descripción de la especie
     */
    public Especie(ArrayList<Animal> listaAnimales, String nombreNormal, String nombreCientifico, String descripcion) {
        this.listaAnimales    = listaAnimales;
        this.nombreNormal     = nombreNormal;
        this.nombreCientifico = nombreCientifico;
        this.descripcion      = descripcion;
    }

    /**
     *
     * @return Regresa la descripción de la especie
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción de la especia
     * @param descripcion Descripción de la especie
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return Regresa la lista de animales de la especie
     */
    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    /**
     * Esablece la lista de animales de la especie
     * @param listaAnimales Lista de animales de la especie
     */
    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    /**
     *
     * @return Regresa el nombre cientifico de la especie
     */
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    /**
     * Establece el nombre cientifico de la especie
     * @param nombreCientifico Nombre cientifico de la especie
     */
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    /**
     *
     * @return Regresa el nombre normal de la especie
     */
    public String getNombreNormal() {
        return nombreNormal;
    }

    /**
     * Establece el nombre normal de la especie
     * @param nombreNormal nombre normal de la especie
     */
    public void setNombreNormal(String nombreNormal) {
        this.nombreNormal = nombreNormal;
    }

    public ArrayList<CuidadorEspecie> getListaCuidadoresEspecie() {
        return listaCuidadoresEspecie;
    }

    public void setListaCuidadoresEspecie(ArrayList<CuidadorEspecie> listaCuidadoresEspecie) {
        this.listaCuidadoresEspecie = listaCuidadoresEspecie;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        
        return "Especie{" + "nombreNormal=" + nombreNormal + ", nombreCientifico=" + nombreCientifico + ", descripcion=" + descripcion + ", zona=" + zona + ", habitat=" + habitat + '}';
    }

    
}


//~ Formatted by Jindent --- http://www.jindent.com
