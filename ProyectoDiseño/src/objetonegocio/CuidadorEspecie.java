/*
 * CuidadorEspecie.java
 */
package objetonegocio;

/**
 *
 * @author paulb
 */
public class CuidadorEspecie {
    private Especie especie;
    private Cuidador cuidador;
    private boolean conocimiento;

    public CuidadorEspecie() {
    }

    public CuidadorEspecie(Especie especie, Cuidador cuidador) {
        this.especie = especie;
        this.cuidador = cuidador;
    }

    public CuidadorEspecie(Especie especie, Cuidador cuidador, boolean conocimiento) {
        this.especie = especie;
        this.cuidador = cuidador;
        this.conocimiento = conocimiento;
    }
    
    

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public boolean isConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(boolean conocimiento) {
        this.conocimiento = conocimiento;
    }

    @Override
    public String toString() {
        return "CuidadorEspecie{" + "especie=" + especie + ", cuidador=" + cuidador + ", conocimiento=" + conocimiento + '}';
    }

    
    
    

    
}
