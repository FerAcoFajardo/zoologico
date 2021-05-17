/*
 * Queja.java
 */
package objetonegocio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author paulb
 */
public class Queja {
    private ObjectId id;
    private Itinerario itinerario;
    private Date fecha;
    private String telefono;
    private String correo;
    private String nombreCompleto;

    public Queja() {
    }

    public Queja(ObjectId id) {
        this.id = id;
    }

    public Queja(ObjectId id, Itinerario itinerario, Date fecha, String telefono, String correo, String nombreCompleto) {
        this.id = id;
        this.itinerario = itinerario;
        this.fecha = fecha;
        this.telefono = telefono;
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
    }

    
    
    public Queja(Itinerario itinerario, Date fecha, String telefono, String correo, String nombreCompleto) {
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

    public Date getFecha() {
        return fecha;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    
    public void setFecha(Date fecha) {
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
        return "Queja{" + "itinerario=" + itinerario + ", fecha=" + fecha + ", telefono=" + telefono + ", correo=" + correo + ", nombreCompleto=" + nombreCompleto + '}';
    }

        
    

    
}
