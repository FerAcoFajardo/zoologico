
/*
* Cuidador.java
 */
package objetonegocio;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class Cuidador extends Empleado {

    private List<CuidadorEspecie> listaCuidadorEspecie;
    
    public Cuidador() {
    }

    /**
     * Contruye una instancia de cuidador
     *
     * @param nombre Nombre del cuidador
     * @param direccion Dirección del cuidador
     * @param telefono Telefono del cuidador
     * @param fecha Fecha de registro del cuidador
     */
    public Cuidador(String nombre, String direccion, String telefono, Date fecha) {
        super(nombre, direccion, telefono, fecha);
    }

    public Cuidador(ObjectId id) {
        super(id);
    }

    public Cuidador(ObjectId id, String nombre, String direccion, String telefono, Date fecha) {
        super(id, nombre, direccion, telefono, fecha);
    }

    public List<CuidadorEspecie> getListaCuidadorEspecie() {
        return listaCuidadorEspecie;
    }

    public void setListaCuidadorEspecie(List<CuidadorEspecie> listaCuidadorEspecie) {
        this.listaCuidadorEspecie = listaCuidadorEspecie;
    }

    
    /**
     * Regresa todos los atributos del cuidador
     *
     * @return Regresa todos los atributos del cuidador
     */
    @Override
    public String toString() {
        return "Cuidador{" + super.toString() + '}';
    }

}
