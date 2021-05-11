
/*
* Zona.java
 */
package objetonegocio;

import java.util.ArrayList;

/**
 *
 * @author fernando
 */
public class Zona {
    private ArrayList<Recorrido> recorridos;
    private ArrayList<Especie> especies;
    private String             nombre;
    private float              extension;

    public Zona() {}

    /**
     * Contructor con todos los datos de la zona
     * @param recorridos Lista de recorridos de la zona
     * @param nombre Nombre de la zona
     * @param extension Extension de la zona
     */
    public Zona(ArrayList<Recorrido> recorridos, String nombre, float extension) {
        this.recorridos = recorridos;
        this.nombre       = nombre;
        this.extension    = extension;
    }

    public Zona(String nombre, float extension) {
        this.nombre = nombre;
        this.extension = extension;
    }
    
    

    /**
     * Escribe todos los atributos de la zona
     * @return Regresa todos los atributos del objeto
     */
    @Override    
    public String toString() {
        return "Zona{" + "nombre=" + nombre + ", extension=" + extension + '}';
    }

    /**
     * Método que regresa la extensión
     * @return Regresa la extensión de la zona
     */
    public float getExtension() {
        return extension;
    }

    /**
     * Método que establece la extension de la zona
     * @param extension Extensión de la zona
     */
    public void setExtension(float extension) {
        this.extension = extension;
    }

    /**
     * Método que regresa la lista de recorridos
     * @return Regresa la lista de recorridos
     */
    public ArrayList<Recorrido> getRecorridos() {
        return recorridos;
    }

    /**
     * Método que establece la lista de recorridos
     * @param recorridos Lista de recorridos
     */
    public void setListaEspecie(ArrayList<Recorrido> recorridos) {
        this.recorridos = recorridos;
    }

    /**
     * Método que regresa el nombre
     * @return Regresa el nombre de la zona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre de la zona
     * @param nombre Nombre de la zona
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
