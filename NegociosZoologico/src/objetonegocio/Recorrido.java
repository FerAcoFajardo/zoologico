/*
 * Recorrido.java
 */
package objetonegocio;

/**
 *
 * @author paulb
 */
public class Recorrido {
    private Itinerario itinerario;
    private Zona zona;
    private int duracion;
    private int longitud;
    private int numEspecies;

    public Recorrido() {
    }

    public Recorrido(Itinerario itinerario, Zona zona, int duracion, int longitud, int numEspecies) {
        this.itinerario = itinerario;
        this.zona = zona;
        this.duracion = duracion;
        this.longitud = longitud;
        this.numEspecies = numEspecies;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
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

    @Override
    public String toString() {
        return "Recorrido{" + "itinerario=" + itinerario + ", zona=" + zona + ", duracion=" + duracion + ", longitud=" + longitud + ", numEspecies=" + numEspecies + '}';
    }

    
}
