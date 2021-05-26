
/*
* Zona.java
 */
package objetonegocio;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class Zona {
    private ObjectId id;
    private List<ObjectId> especies;
    private String             nombre;
    private float              extension;

    public Zona() {}

    public Zona(List<ObjectId> especies, String nombre, float extension) {
        this.especies = especies;
        this.nombre = nombre;
        this.extension = extension;
    }

    
    
    /**
     * Contructor con todos los datos de la zona
     * @param recorridos Lista de recorridos de la zona
     * @param nombre Nombre de la zona
     * @param extension Extension de la zona
     */
    public Zona(String nombre, float extension) {
        this.nombre       = nombre;
        this.extension    = extension;
    }

    public Zona(ObjectId id, List<ObjectId> especies, String nombre, float extension) {
        this.id = id;
        this.especies = especies;
        this.nombre = nombre;
        this.extension = extension;
    }


    /**
     * Escribe todos los atributos de la zona
     * @return Regresa todos los atributos del objeto
     */
    @Override    
    public String toString() {
        return nombre;
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

    public List<ObjectId> getEspecies() {
        return especies;
    }

    public void setEspecies(List<ObjectId> especies) {
        this.especies = especies;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    
    
}

