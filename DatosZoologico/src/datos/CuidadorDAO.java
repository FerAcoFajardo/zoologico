/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import objetonegocio.Clima;
import objetonegocio.Continente;
import objetonegocio.Habitat;
import objetonegocio.Vegetacion;

/**
 *
 * @author fernando
 */
public class HabitatDAO extends BaseDAO<Habitat>{
    List<Habitat> habitats;

    public HabitatDAO() {
        habitats = new ArrayList(Arrays.asList(new Habitat("Desierto de sonora", Clima.TEMPLADO, new Vegetacion("Pitaya", "Stenocereus queretaroensis"), new ArrayList<>(Arrays.asList(Continente.AMERICA)))));

    }
    
    

    @Override
    public List<Habitat> buscar() {
        return habitats;
    }

    @Override
    public void guardar(Habitat entidad) {
        habitats.add(entidad);
    }
    
}
