
/*
* Empleado.java
 */
package objetonegocio;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author fernando
 */
public class Empleado {
    private String nombre;
    private String direccion;
    private String telefono;
    private Calendar fecha;

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
    public Empleado(String nombre, String direccion, String telefono, Calendar fecha) {
        this.nombre    = nombre;
        this.direccion = direccion;
        this.telefono  = telefono;
        this.fecha     = fecha;
    }

    /**
     * Regresa todos los datos del empleado
     * @return Regresa datos del empleado
     */
    @Override
    public String toString() {
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        form.setCalendar(fecha);
        String formated1 = form.format(fecha.getTime());
        return "Empleado{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", fecha empleado="
               + formated1 + '}';
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
    public Calendar getFecha() {
        return fecha;
    }

    /**
     * Método que establece la fecha de regitro del empleado
     * @param fecha Fecha de registro del empleado
     */
    public void setFecha(Calendar fecha) {
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
}


//~ Formatted by Jindent --- http://www.jindent.com
