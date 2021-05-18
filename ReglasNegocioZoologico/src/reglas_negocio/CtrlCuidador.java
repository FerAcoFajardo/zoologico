/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas_negocio;

import datos.FabricaDatos;
import datos.iDatos;
import exceptions.DAOException;
import java.util.List;
import objetonegocio.Cuidador;

/**
 *
 * @author fernando
 */
public class CtrlCuidador {
    iDatos iDatos;
    
    
    public CtrlCuidador() {
        iDatos = FabricaDatos.crearDatos();
    }
    
    public List<Cuidador> buscarCuidadores() throws DAOException{
        return iDatos.buscarCuidador();
    }
    
}
