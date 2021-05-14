
/*
* Itinerario.java
 */
package objetonegocio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author fernando
 */
public class Itinerario {
    private List<Queja> listaQuejas;
    private List<Recorrido> recorridos;
    private int             maxVisitantes;
    private Guia            guia;
    private Calendar fecha;

    public Itinerario() {}

    public Itinerario(List<Queja> listaQuejas, List<Recorrido> recorridos, int maxVisitantes, Guia guia, Calendar fecha) {
        this.listaQuejas = listaQuejas;
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.fecha = fecha;
    }

    public Itinerario(int maxVisitantes, Guia guia, Calendar fecha) {
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.fecha = fecha;
    }

    public Itinerario(List<Recorrido> recorridos, int maxVisitantes, Guia guia, Calendar fecha) {
        this.recorridos = recorridos;
        this.maxVisitantes = maxVisitantes;
        this.guia = guia;
        this.fecha = fecha;
    }

    /**
     *
     * @return Regresa el guia del itinerario
     */
    public Guia getGuia() {
        return guia;
    }

    /**
     * Establece el guia del itinerario
     * @param guia Guia del itinerario
     */
    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    /**
     * Método que regresa el maximo números de visitantes
     * @return Regresa el máximo números de visitantes
     */
    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    /**
     * Método que establece el maximo número de visitantes
     * @param maxVisitantes Maximo número de visitantes
     */
    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }

    public List<Queja> getListaQuejas() {
        return listaQuejas;
    }

    public void setListaQuejas(List<Queja> listaQuejas) {
        this.listaQuejas = listaQuejas;
    }

    public List<Recorrido> getRecorridos() {
        return recorridos;
    }

    public void setRecorridos(List<Recorrido> recorridos) {
        this.recorridos = recorridos;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        form.setCalendar(fecha);
        String formated1 = form.format(fecha.getTime());
        return "Itinerario{" + "maxVisitantes=" + maxVisitantes + ", guia=" + guia + ", fecha itinerario=" + formated1 + '}';
    }
    
    


}


//~ Formatted by Jindent --- http://www.jindent.com
