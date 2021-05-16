
/*
* Guia.java
 */
package objetonegocio;

import java.util.Calendar;
import java.util.List;


/**
 *
 * @author fernando
 */
public class Guia extends Empleado {
    private List<Itinerario> listaItinerarios;
    
    public Guia() {}
    
    /**
     * Contructor que contruye el guia con los datos necesarios
     * @param nombre Nombre del guia
     * @param direccion Dirección del guia
     * @param telefono Telefono del guia
     * @param fecha Fecha de registro del guia
     */
    public Guia(String nombre, String direccion, String telefono, Calendar fecha) {
        super(nombre, direccion, telefono, fecha);
    }

    public Guia(List<Itinerario> listaItinerarios) {
        this.listaItinerarios = listaItinerarios;
    }

    public Guia(List<Itinerario> listaItinerarios, String nombre, String direccion, String telefono, Calendar fecha) {
        super(nombre, direccion, telefono, fecha);
        this.listaItinerarios = listaItinerarios;
    }

    public List<Itinerario> getListaItinerarios() {
        return listaItinerarios;
    }

    public void setListaItinerarios(List<Itinerario> listaItinerarios) {
        this.listaItinerarios = listaItinerarios;
    }
        
    /**
     * Método que regresa todos los datos del guia
     * @return Regresa todos los datos del guia
     */
    @Override
    public String toString() {
        return "Guia{" + super.toString() + '}';
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
