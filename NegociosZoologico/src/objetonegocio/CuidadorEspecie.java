/*
 * CuidadorEspecie.java
 */
package objetonegocio;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author paulb
 */
public class CuidadorEspecie {
    private ObjectId cuidador;
    private Conocimiento conocimiento;
    private Date fecha;

    public CuidadorEspecie() {
    }

    public CuidadorEspecie(ObjectId cuidador) {
        this.cuidador = cuidador;
    }

    public CuidadorEspecie(ObjectId cuidador, Conocimiento conocimiento, Date fecha) {
        this.cuidador = cuidador;
        this.conocimiento = conocimiento;
        this.fecha = fecha;
    }
    
    

    public CuidadorEspecie(ObjectId cuidador, Conocimiento conocimiento) {
        this.cuidador = cuidador;
        this.conocimiento = conocimiento;
        this.fecha = new Date();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    

    public ObjectId getCuidador() {
        return cuidador;
    }

    public void setCuidador(ObjectId cuidador) {
        this.cuidador = cuidador;
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
