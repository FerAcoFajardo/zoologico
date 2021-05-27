
/*
* Guia.java
 */
package objetonegocio;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;


/**
 *
 * @author fernando
 */
public class Guia extends Empleado {
    
    
    
    public Guia() {}
    
    /**
     * Contructor que contruye el guia con los datos necesarios
     * @param nombre Nombre del guia
     * @param direccion Dirección del guia
     * @param telefono Telefono del guia
     * @param fecha Fecha de registro del guia
     */
    public Guia(String nombre, String direccion, String telefono, Date fecha) {
        super(nombre, direccion, telefono, fecha);
    }

    public Guia(ObjectId id) {
        super(id);
    }

    public Guia(ObjectId id, String nombre, String direccion, String telefono, Date fecha) {
        super(id, nombre, direccion, telefono, fecha);
    }

        
    /**
     * Método que regresa todos los datos del guia
     * @return Regresa todos los datos del guia
     */
    @Override
    public String toString() {
        return super.toString();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
