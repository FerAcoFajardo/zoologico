/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.regla_negocios;

import datos.iDatos;
import infraestructura.Factory;
import java.util.List;
import objetonegocio.Clima;
import objetonegocio.Continente;
import objetonegocio.Habitat;
import objetonegocio.Vegetacion;

/**
 *
 * @author fernando
 */
public class FachadaRN implements iNegocios{

    CtrlClima ctrlClima;
    CtrlContinente ctrlContinente;
    CtrlHabitat ctrlHabitat;
    CtrlVegetacion ctrlVegetacion;
    
    public FachadaRN() {
        this.ctrlClima = new CtrlClima();
        this.ctrlContinente = new CtrlContinente();
        this.ctrlHabitat = new CtrlHabitat();
        this.ctrlVegetacion = new CtrlVegetacion();
    }
    
    

    @Override
    public List<Habitat> buscaHabitat() {
        return ctrlHabitat.buscarHabitat();
    }

    @Override
    public void guadarHabitat(Habitat habitat) {
        ctrlHabitat.guardarHabitat(habitat);
    }

    @Override
    public List<Vegetacion> recuperarVegetacion() {
        return ctrlVegetacion.recuperarVegetacion();
    }

    @Override
    public List<Continente> recuperarContinente() {
        return ctrlContinente.recuperarContinentes();
    }

    @Override
    public List<Clima> recuperarClima() {
        return ctrlClima.recuperarContinentes();
    }
    
    
}
