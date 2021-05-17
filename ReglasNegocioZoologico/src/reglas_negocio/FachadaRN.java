/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas_negocio;

import exceptions.DAOException;
import java.util.ArrayList;
import java.util.List;
import objetonegocio.Animal;
import objetonegocio.Especie;
import objetonegocio.Habitat;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class FachadaRN implements iNegocios{

    CtrlClima ctrlClima;
    CtrlContinente ctrlContinente;
    CtrlHabitat ctrlHabitat;
    CtrlVegetacion ctrlVegetacion;
    CtrlCuidador ctrlCuidador;
    CtrlEspecie ctrlEspecie;
    
    public FachadaRN() {
        this.ctrlClima = new CtrlClima();
        this.ctrlContinente = new CtrlContinente();
        this.ctrlHabitat = new CtrlHabitat();
        this.ctrlVegetacion = new CtrlVegetacion();
        this.ctrlCuidador = new CtrlCuidador();
        this.ctrlEspecie = new CtrlEspecie();
    }
    
    

    @Override
    public List<Habitat> buscaHabitat() throws DAOException {
        return ctrlHabitat.buscarHabitat();
    }

    @Override
    public void guadarHabitat(Habitat habitat) throws DAOException {
        ctrlHabitat.guardarHabitat(habitat);
    }

//    @Override
//    public List<Vegetacion> recuperarVegetacion() throws DAOException {
//        return ctrlVegetacion.recuperarVegetacion();
//    }
//
//    @Override
//    public List<Continente> recuperarContinente() throws DAOException{
//        return ctrlContinente.recuperarContinentes();
//    }
//
//    @Override
//    public List<Clima> recuperarClima() throws DAOException{
//        return ctrlClima.recuperarContinentes();
//    }

    @Override
    public List recuperarDatosFormHabitat() throws DAOException {
        List listaDatos = new ArrayList();
        
        listaDatos.add(ctrlClima.recuperarContinentes());
        listaDatos.add(ctrlContinente.recuperarContinentes());
        listaDatos.add(ctrlVegetacion.recuperarVegetacion());
        return listaDatos;
    }

    @Override
    public List recuperarDatosFormEspecie() throws DAOException {
        List listaDatos = new ArrayList();
        listaDatos.add(this.ctrlHabitat.buscarHabitat());
        listaDatos.add(this.ctrlCuidador.buscarCuidadores());
        return listaDatos;
    }

    @Override
    public Especie buscarEspecie(String nombreComun) throws DAOException {
        return ctrlEspecie.buscarEspecie(nombreComun);
    }

    @Override
    public List<Animal> recuperarAnimales(ObjectId idEspecie) throws DAOException {
        return ctrlEspecie.buscarAnimales(idEspecie);
    }

    @Override
    public void guadarEspecie(Especie especie) throws DAOException{
        ctrlEspecie.guardarEspecie(especie);
    }
    
    
}
