/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas_negocio;

import java.util.List;
import objetonegocio.Clima;
import objetonegocio.Continente;
import objetonegocio.Habitat;
import objetonegocio.Vegetacion;

/**
 *
 * @author fernando
 */
public interface iNegocios {
    public List<Habitat> buscaHabitat();
    public void guadarHabitat(Habitat habitat);
    public List<Vegetacion> recuperarVegetacion();
    public List<Continente> recuperarContinente();
    public List<Clima>recuperarClima();
    
    public List recuperarDatos();
}
