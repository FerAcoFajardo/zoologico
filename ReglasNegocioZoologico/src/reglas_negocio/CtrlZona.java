/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas_negocio;

import datos.iDatos;
import exceptions.DAOException;
import java.util.List;
import objetonegocio.Zona;

/**
 *
 * @author fernando
 */
public class CtrlZona {
    
    private iDatos iDatos;
    
    public CtrlZona(iDatos iDatos) {
        this.iDatos = iDatos;
    }
    
    public List<Zona> recuperarZona() throws DAOException{
        return iDatos.recuperarZonas();
    }
    
}
