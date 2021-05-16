
/*
* Cuidador.java
 */
package objetonegocio;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author fernando
 */
public class Cuidador extends Empleado {
    private ArrayList<CuidadorEspecie> listaCuidadorEspecies;

    public Cuidador() {}

    /**
     * Contruye una instancia de cuidador
     * @param listaEspecies Lista de especies que cuida el cuidador
     * @param nombre Nombre del cuidador
     * @param direccion Dirección del cuidador
     * @param telefono Telefono del cuidador
     * @param fecha Fecha de registro del cuidador
     */
    public Cuidador(String nombre, String direccion, String telefono, Calendar fecha) {
        super(nombre, direccion, telefono, fecha);
    }
    
    /**
     * Contruye una instancia de cuidador
     * @param listaEspecies Lista de especies que cuida el cuidador
     * @param nombre Nombre del cuidador
     * @param direccion Dirección del cuidador
     * @param telefono Telefono del cuidador
     * @param fecha Fecha de registro del cuidador
     */
    public Cuidador(ArrayList<CuidadorEspecie> listaEspecies, String nombre, String direccion, String telefono, Calendar fecha) {
        super(nombre, direccion, telefono, fecha);
        this.listaCuidadorEspecies = listaEspecies;
    }

    /**
     * Regresa todos los atributos del cuidador
     * @return Regresa todos los atributos del cuidador
     */
    @Override
    public String toString() {
        return "Cuidador{" + super.toString() + '}';
    }

    /**
     * @return Regresa la lista de CuidadorEspecie
     */
    public ArrayList<CuidadorEspecie> getListaCuidadorEspecie() {
        return listaCuidadorEspecies;
    }

    /**
     * Método que establece la lista CuidadorEspecie
     * @param listaCuidadorEspecies Lista de CuidadorEspecie
     */
    public void setListaCuidadorEspecie(ArrayList<CuidadorEspecie> listaCuidadorEspecies) {
        this.listaCuidadorEspecies = listaCuidadorEspecies;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
