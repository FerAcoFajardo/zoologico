
/*
* Animal.java
 */
package objetonegocio;

import exceptions.BusinessException;
import org.bson.types.ObjectId;

/**
 *
 * @author Fernando A.
 */
public class Animal {
    private String nombre;
    private int edad;
    private Sexo sexo;
    private ObjectId id;
    
    public Animal() {}

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }


    public Animal(String nombre, int edad, Sexo sexo, ObjectId id) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }

    

    /**
     * Método que regresa el nombre
     * @return Regresa el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del animal
     * @param nombre Nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método de regresa el sexo del animal
     * @return Sexo del animal
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Método de establece el sexo del animal
     * @param sexo Sexo del animal
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * Método que regresa la edad del animal
     * @return Edad del animal 
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método que establece la edad del animal
     * @param edad Edad del animal
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public void verificar() throws BusinessException{
        if(this.edad < 0 || this.edad > 150){
            throw new BusinessException("Error: Edad fuera de los limites");
        } else if (this.sexo == null){
            throw new BusinessException("Error: Falta indicar el sexo del animal");
        } else if (this.nombre == null || "".equals(this.nombre)){
            throw new BusinessException("Error: Falta indicar el nombre del animal");
        }
    }
}



