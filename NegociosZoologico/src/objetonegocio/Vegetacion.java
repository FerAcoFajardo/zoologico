
/*
* Vegetacion.java
 */
package objetonegocio;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class Vegetacion {
    private ObjectId id;
    private String nombre;
    private String nombreCientifico;
    
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


    /**
     * Método que regresa todos los atributos de la vegetación
     * @return Regresa todos los atributos de la vegetación
     */
    @Override    
    public String toString() {
        return nombre;
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


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    
}


//~ Formatted by Jindent --- http://www.jindent.com
