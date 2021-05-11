/*
 * Queja.java
 */
package objetonegocio;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author paulb
 */
public class Queja {
    private Itinerario itinerario;
    private Calendar fecha;
    private String telefono;
    private String correo;
    private String nombreCompleto;

    public Queja() {
    }

    public Queja(Itinerario itinerario, Calendar fecha, String telefono, String correo, String nombreCompleto) {
        this.itinerario = itinerario;
        this.fecha = fecha;
        this.telefono = telefono;
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
    }

    
    
    public Queja(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        form.setCalendar(fecha);
        String formated1 = form.format(fecha.getTime());
        return "Queja{" + "itinerario=" + itinerario + ", fecha queja=" + formated1 + ", telefono=" + telefono + ", correo=" + correo + ", nombreCompleto=" + nombreCompleto + '}';
    }
    
    

    
}
