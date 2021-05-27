/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetonegocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernando
 */
public class Horario {
    
    DiaSemana dia;
    List<String> hora;
    

    public Horario(List<String> hora, DiaSemana dia) {
        this.hora = hora;
        this.dia = dia;
    }

    public Horario() {
        hora = new ArrayList<>();
    }

    public void agregarHora(String hora){
        this.hora.add(hora);
    }

    public List<String> getHora() {
        return hora;
    }

    public void setHora(List<String> hora) {
        this.hora = hora;
    }

    public DiaSemana getDia() {
        return dia;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }
    
    @Override
    public String toString() {
        return "Horario{" + "hora=" + hora + ", dia=" + dia + '}';
    }
    
    
}
