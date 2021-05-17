
/*
* Itinerario.java
 */
package objetonegocio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class Itinerario {
    private ObjectId id;
    private String nombre;
    private List<Queja> listaQuejas;
    private List<Recorrido> recorridos;
    private int             maxVisitantes;
    private Guia            guia;
    private Date fecha;

    public Itinerario() {}

    public Itinerario(ObjectId id, String nombre, List<Queja> listaQuejas, List<Recorrido> recorridos, int maxVisitantes, Guia guia, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.listaQuejas = listaQuejas;
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.fecha = fecha;
    }

    public Itinerario(String nombre, List<Queja> listaQuejas, List<Recorrido> recorridos, int maxVisitantes, Guia guia, Date fecha) {
        this.nombre = nombre;
        this.listaQuejas = listaQuejas;
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.fecha = fecha;
    }

    public Itinerario(ObjectId id) {
        this.id = id;
    }

    public Itinerario(ObjectId id, String nombre, List<Recorrido> recorridos, int maxVisitantes, Guia guia, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.fecha = fecha;
    }

    public Itinerario(String nombre, List<Recorrido> recorridos, int maxVisitantes, Guia guia, Date fecha) {
        this.nombre = nombre;
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.fecha = fecha;
    }
    
    

    /**
     *
     * @return Regresa el guia del itinerario
     */
    public Guia getGuia() {
        return guia;
    }

    /**
     * Establece el guia del itinerario
     * @param guia Guia del itinerario
     */
    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    /**
     * Método que regresa el maximo números de visitantes
     * @return Regresa el máximo números de visitantes
     */
    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    /**
     * Método que establece el maximo número de visitantes
     * @param maxVisitantes Maximo número de visitantes
     */
    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }

    public List<Queja> getListaQuejas() {
        return listaQuejas;
    }

    public void setListaQuejas(List<Queja> listaQuejas) {
        this.listaQuejas = listaQuejas;
    }

    public List<Recorrido> getRecorridos() {
        return recorridos;
    }

    public void setRecorridos(List<Recorrido> recorridos) {
        this.recorridos = recorridos;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Itinerario{" + "id=" + id + ", nombre=" + nombre + ", listaQuejas=" + listaQuejas + ", recorridos=" + recorridos + ", maxVisitantes=" + maxVisitantes + ", guia=" + guia + ", fecha=" + fecha + '}';
    }

    
    


}


//~ Formatted by Jindent --- http://www.jindent.com
