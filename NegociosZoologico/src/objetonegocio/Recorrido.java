/*
 * Recorrido.java
 */
package objetonegocio;

import org.bson.types.ObjectId;

/**
 *
 * @author paulb
 */
public class Recorrido {
    private ObjectId id;
    private ObjectId zona;
    private Itinerario itinerario;
    private int duracion;
    private int longitud;
    private int numEspecies;

    public Recorrido() {
    }

    public Recorrido(ObjectId id) {
        this.id = id;
    }

    public Recorrido(ObjectId id, ObjectId zona, int duracion, int longitud, int numEspecies) {
        this.id = id;
        this.zona = zona;
        this.duracion = duracion;
        this.longitud = longitud;
        this.numEspecies = numEspecies;
    }

    
    public Recorrido(ObjectId zona, int duracion, int longitud, int numEspecies) {
        this.zona = zona;
        this.duracion = duracion;
        this.longitud = longitud;
        this.numEspecies = numEspecies;
    }

    public ObjectId getZona() {
        return zona;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    
    
    public void setZona(ObjectId zona) {
        this.zona = zona;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getNumEspecies() {
        return numEspecies;
    }

    public void setNumEspecies(int numEspecies) {
        this.numEspecies = numEspecies;
    }
    
    

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    
    @Override
    public String toString() {
        return "Recorrido{" + "zona=" + zona + ", duracion=" + duracion + ", longitud=" + longitud + ", numEspecies=" + numEspecies + '}';
    }

    

    
}
