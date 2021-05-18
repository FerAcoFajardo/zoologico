/*
 * CuidadorEspecie.java
 */
package objetonegocio;

/**
 *
 * @author paulb
 */
public class CuidadorEspecie {
    private Cuidador cuidador;
    private Conocimiento conocimiento;
    private Especie especie;

    public CuidadorEspecie() {
    }

    public CuidadorEspecie(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public CuidadorEspecie(Cuidador cuidador, Conocimiento conocimiento) {
        this.cuidador = cuidador;
        this.conocimiento = conocimiento;
    }
    

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    
    public Conocimiento getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(Conocimiento conocimiento) {
        this.conocimiento = conocimiento;
    }

    @Override
    public String toString() {
        return "CuidadorEspecie{" + ", cuidador=" + cuidador + ", conocimiento=" + conocimiento + '}';
    }

    
    
    

    
}
