
/*
* Empleado.java
 */
package objetonegocio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class Empleado {
    private ObjectId id;
    private String nombre;
    private String direccion;
    private String telefono;
    private Date fecha;

    /**
     *
     */
    public Empleado() {}

    /**
     * Constructor con todos los datos necesarios para contruir una instancia de Empleado
     * @param nombre Nombre del empleado
     * @param direccion Dirección del empleado
     * @param telefono Telefono del empleado
     * @param fecha Fecha de registro del empleado
     */
    public Empleado(String nombre, String direccion, String telefono, Date fecha) {
        this.nombre    = nombre;
        this.direccion = direccion;
        this.telefono  = telefono;
        this.fecha     = fecha;
    }

    public Empleado(ObjectId id) {
        this.id = id;
    }

    public Empleado(ObjectId id, String nombre, String direccion, String telefono, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha = fecha;
    }

    

    /**
     * Método que regresa la direccion del empleado
     * @return Regresa la dirección del empleado
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que establece la dirección del empleado
     * @param direccion Dirección del empleado
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que regresa la fecha de registro del empleado
     * @return Regresa la fecha de registro
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Método que establece la fecha de regitro del empleado
     * @param fecha Fecha de registro del empleado
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Método que regresa el nombre del empleado
     * @return Regresa el nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del empleado
     * @param nombre Nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que regresa el telefono del empleado
     * @return Regresa el telefono del empleado
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método que esablece el nombre del empleado
     * @param telefono Nombre del telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    
    
    @Override
    public String toString() {
        return "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", fecha=" + fecha;
    }
    
    
}


//~ Formatted by Jindent --- http://www.jindent.com
