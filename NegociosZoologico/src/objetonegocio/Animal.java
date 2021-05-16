
/*
* Animal.java
 */
package objetonegocio;

/**
 *
 * @author Fernando A.
 */
public class Animal {
    private String nombre;
    private int edad;
    private Especie especie;
    private Sexo sexo;
    
    public Animal() {}

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String nombre, int edad, Especie especie, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.sexo = sexo;
    }
    
    

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + ", sexo=" + sexo + '}';
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

    /**
     * Método que establece la especie del animal
     * @return Especie 
     */
    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}



