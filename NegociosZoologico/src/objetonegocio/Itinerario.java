
/*
* Itinerario.java
 */
package objetonegocio;


import exceptions.DAOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class Itinerario {

    private ObjectId id;
    private String nombre;
    private int duracion;
    private float longitud;
    private List<ObjectId> quejas;
    private List<ObjectId> recorridos;
    private int maxVisitantes;
    private ObjectId guia;
    private List<Horario> horario;

    public Itinerario() {
        this.horario = new ArrayList<>();
        this.recorridos = new ArrayList<>();
        this.quejas = new ArrayList<>();
    }

    public Itinerario(ObjectId id, String nombre, List<ObjectId> quejas, List<ObjectId> recorridos, int maxVisitantes, ObjectId guia, List<Horario> fecha) {
        this.id = id;
        this.nombre = nombre;
        this.quejas = quejas;
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.horario = fecha;
    }

    public Itinerario(String nombre, int maxVisitantes, ObjectId guia, List<Horario> fecha) {
        this.nombre = nombre;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.horario = fecha;
    }

    public Itinerario(String nombre, List<ObjectId> quejas, List<ObjectId> recorridos, int maxVisitantes, ObjectId guia, List<Horario> fecha) {
        this.nombre = nombre;
        this.quejas = quejas;
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.horario = fecha;
    }

    public Itinerario(ObjectId id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    
    
    public Itinerario(ObjectId id, String nombre, List<ObjectId> recorridos, int maxVisitantes, ObjectId guia, List<Horario> fecha) {
        this.id = id;
        this.nombre = nombre;
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.horario = fecha;
    }

    public Itinerario(String nombre, List<ObjectId> recorridos, int maxVisitantes, ObjectId guia, List<Horario> fecha) {
        this.nombre = nombre;
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.horario = fecha;
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

    public List<Horario> getHorario() {
        return horario;
    }

    public void setHorario(List<Horario> fecha) {
        this.horario = fecha;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }
    
    public void addQueja(ObjectId queja){
        this.quejas.add(queja);
    }
    

    @Override
    public String toString() {
        return nombre;
    }

    public void verificarCampos() throws DAOException{
        
         Pattern pat = Pattern.compile("(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]+$");
         
        if(this.horario.isEmpty()){
            throw new DAOException("Error: debe incluir al menos 1 fecha");
        }
        if(!this.horario.isEmpty()){
            for (Horario horario1 : horario) {
                Matcher mat = pat.matcher(horario1.getHora().toString());
                if(mat.matches())
                    throw new DAOException("Error: El formato es incorrecto");
            }
                
        }
        if(this.duracion <= 0 || this.duracion > 90){
            throw new DAOException("Error: Minimo 1 minuto de duracion");
        }
        if(this.maxVisitantes <= 0 || this.maxVisitantes > 30){
            throw new DAOException("Error: Se deben de poder incluir visitantes");
        }
        if(this.longitud <= 0.0f || this.longitud > 1500.0f){
            throw new DAOException("Error: Longitud fuera de rango, maximo 1500 mts");
        }
        if(this.nombre == null){
            throw new DAOException("Error: Nombre no puede estar vacio");
        }
        if(this.recorridos.isEmpty()){
            throw new DAOException("Error: Debe de seleccionar al menos una zona");
        }
    }
    
    
}


