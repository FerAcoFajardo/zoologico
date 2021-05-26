
/*
* Especie.java
 */
package objetonegocio;

import exceptions.BusinessException;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class Especie {
    private ObjectId id;
    private ObjectId habitat;
    private List<Animal> animales;
    private String            nombreNormal;
    private String            nombreCientifico;
    private String            descripcion;
    private List<CuidadorEspecie> listaCuidadoresEspecie;
    
    public Especie() {}

    public Especie(ObjectId id) {
        this.id = id;
    }

    public Especie(ObjectId id, List<Animal> animales, String nombreNormal, String nombreCientifico, String descripcion, ArrayList<CuidadorEspecie> listaCuidadoresEspecie) {
        this.id = id;
        this.animales = animales;
        this.nombreNormal = nombreNormal;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.listaCuidadoresEspecie = listaCuidadoresEspecie;
    }

    
    
    public Especie(List<Animal> animales, String nombreNormal, String nombreCientifico, String descripcion, ArrayList<CuidadorEspecie> listaCuidadoresEspecie) {
        this.animales = animales;
        this.nombreNormal = nombreNormal;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.listaCuidadoresEspecie = listaCuidadoresEspecie;
    }

    public Especie(String nombreNormal, String nombreCientifico, String descripcion) {
        this.nombreNormal = nombreNormal;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
    }

    /**
     * Contruye una instancia de especie de animal
     * @param animales Lista de animales que pertenecen a la especie
     * @param nombreNormal Nombre normal de la especie
     * @param nombreCientifico Nombre cientifico de la especie
     * @param descripcion Descripción de la especie
     */
    public Especie(List<Animal> animales, String nombreNormal, String nombreCientifico, String descripcion) {
        this.animales    = animales;
        this.nombreNormal     = nombreNormal;
        this.nombreCientifico = nombreCientifico;
        this.descripcion      = descripcion;
    }

    /**
     *
     * @return Regresa la descripción de la especie
     */
    public String getDescripcion() {
        return descripcion;
    }

    public ObjectId getHabitat() {
        return habitat;
    }

    public void setHabitat(ObjectId habitat) {
        this.habitat = habitat;
    }
    

    /**
     * Establece la descripción de la especia
     * @param descripcion Descripción de la especie
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return Regresa la lista de animales de la especie
     */
    public List<Animal> getAnimales() {
        return animales;
    }

    /**
     * Esablece la lista de animales de la especie
     * @param animales Lista de animales de la especie
     */
    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    /**
     *
     * @return Regresa el nombre cientifico de la especie
     */
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    /**
     * Establece el nombre cientifico de la especie
     * @param nombreCientifico Nombre cientifico de la especie
     */
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    
    /**
     *
     * @return Regresa el nombre normal de la especie
     */
    public String getNombreNormal() {
        return nombreNormal;
    }

    /**
     * Establece el nombre normal de la especie
     * @param nombreNormal nombre normal de la especie
     */
    public void setNombreNormal(String nombreNormal) {
        this.nombreNormal = nombreNormal;
    }

    public List<CuidadorEspecie> getListaCuidadoresEspecie() {
        return listaCuidadoresEspecie;
    }

    public void setListaCuidadoresEspecie(List<CuidadorEspecie> listaCuidadoresEspecie) {
        this.listaCuidadoresEspecie = listaCuidadoresEspecie;
    }

    @Override
    public String toString() {
        return "Especie{" + "id=" + id + ", habitat=" + habitat + ", animales=" + animales + ", nombreNormal=" + nombreNormal + ", nombreCientifico=" + nombreCientifico + ", descripcion=" + descripcion + '}';
    }

    
    
    public void verificarCampos() throws BusinessException{
        if(this.nombreNormal == null){
            throw new BusinessException("Error: Por favor introduzca un nombre a la especie");
        } else if(this.descripcion == null){
            throw new BusinessException("Error: Por favor introduzca una descripcion a la especie");
        }else if(this.habitat == null){
            throw new BusinessException("Error: Por favor introduzca habitat para la especie");
        }else if(this.nombreCientifico == null){
            throw new BusinessException("Error: Por favor introduzca nombre cientifico para la especie");
        }
    }

    
}


