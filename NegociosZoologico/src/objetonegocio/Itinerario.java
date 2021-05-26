
/*
* Itinerario.java
 */
package objetonegocio;


import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class Itinerario {

    private ObjectId id;
    private String nombre;
    private List<ObjectId> quejas;
    private List<ObjectId> recorridos;
    private int maxVisitantes;
    private ObjectId guia;
    private List<DiaSemana> fecha;

    public Itinerario() {
    }

    public Itinerario(ObjectId id, String nombre, List<ObjectId> quejas, List<ObjectId> recorridos, int maxVisitantes, ObjectId guia, List<DiaSemana> fecha) {
        this.id = id;
        this.nombre = nombre;
        this.quejas = quejas;
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.fecha = fecha;
    }

    public Itinerario(String nombre, int maxVisitantes, ObjectId guia, List<DiaSemana> fecha) {
        this.nombre = nombre;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.fecha = fecha;
    }

    public Itinerario(String nombre, List<ObjectId> quejas, List<ObjectId> recorridos, int maxVisitantes, ObjectId guia, List<DiaSemana> fecha) {
        this.nombre = nombre;
        this.quejas = quejas;
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.fecha = fecha;
    }

    public Itinerario(ObjectId id) {
        this.id = id;
    }

    public Itinerario(ObjectId id, String nombre, List<ObjectId> recorridos, int maxVisitantes, ObjectId guia, List<DiaSemana> fecha) {
        this.id = id;
        this.nombre = nombre;
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.fecha = fecha;
    }

    public Itinerario(String nombre, List<ObjectId> recorridos, int maxVisitantes, ObjectId guia, List<DiaSemana> fecha) {
        this.nombre = nombre;
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.fecha = fecha;
    }

    public void setQuejas(List<ObjectId> quejas) {
        this.quejas = quejas;
    }

    /**
     *
     * @return Regresa el guia del itinerario
     */
    public ObjectId getGuia() {
        return guia;
    }

    /**
     * Establece el guia del itinerario
     *
     * @param guia Guia del itinerario
     */
    public void setGuia(ObjectId guia) {
        this.guia = guia;
    }

    /**
     * Método que regresa el maximo números de visitantes
     *
     * @return Regresa el máximo números de visitantes
     */
    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    /**
     * Método que establece el maximo número de visitantes
     *
     * @param maxVisitantes Maximo número de visitantes
     */
    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }

    public List<ObjectId> getQuejas() {
        return quejas;
    }

    public List<ObjectId> getRecorridos() {
        return recorridos;
    }

    public void setRecorridos(List<ObjectId> recorridos) {
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

    public List<DiaSemana> getFecha() {
        return fecha;
    }

    public void setFecha(List<DiaSemana> fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Itinerario{" + "id=" + id + ", nombre=" + nombre + ", listaQuejas=" + quejas + ", recorridos=" + recorridos + ", maxVisitantes=" + maxVisitantes + ", guia=" + guia + ", fecha=" + fecha + '}';
    }

}


