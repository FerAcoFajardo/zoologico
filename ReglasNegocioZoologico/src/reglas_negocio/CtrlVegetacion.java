/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas_negocio;

import datos.FabricaDatos;
import datos.iDatos;
import java.util.List;
import objetonegocio.Vegetacion;

/**
 *
 * @author fernando
 */
public class CtrlVegetacion {
    
    iDatos iDatos;
    
    
    public CtrlVegetacion() {
        iDatos = FabricaDatos.crearDatos();
    }
    
    public List<Vegetacion> recuperarVegetacion(){
        return iDatos.buscarVegetacion();
    }
    
}
