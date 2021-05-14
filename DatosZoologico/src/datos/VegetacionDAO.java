/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Arrays;
import java.util.List;
import objetonegocio.Vegetacion;

/**
 *
 * @author fernando
 */
public class VegetacionDAO extends BaseDAO<Vegetacion>{

    @Override
    public List<Vegetacion> buscar() {
        return Arrays.asList(new Vegetacion("Pochote", "Pachira quinata"), new Vegetacion("Pitaya", "Stenocereus queretaroensis"));
    }

    @Override
    public void guardar(Vegetacion entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
