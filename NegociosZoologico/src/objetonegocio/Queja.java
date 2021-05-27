/*
 * Queja.java
 */
package objetonegocio;

import exceptions.DAOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    private String descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    
    
    public void validar() throws DAOException{
        
        
        if(this.descripcion.isEmpty()){
            throw  new DAOException("Error: La descripción no puede estar vacia");
        }
        
        String regex = "^(.+)@(.+)$";
               
 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(this.correo);
        
        if(correo.isEmpty()){
            throw  new DAOException("Error: El correo no puede estar vacio");
        }
        
        if(matcher.matches() == false){
           throw  new DAOException("Correo invalido");
        }
        regex = "^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";
        
        
        if(telefono.isEmpty()){
             throw  new DAOException("Error: El telefono no puede estar vacio");
        }
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(this.telefono);
        
        if(matcher.matches() == false){
            throw  new DAOException("Telefono invalido");
        }
    }

    @Override
    public String toString() {
        return "Queja{" + "nombreCompleto=" + nombreCompleto + '}';
    }
    

   

        
    

    
}
