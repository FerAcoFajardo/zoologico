/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas_negocio;

import datos.iDatos;
import exceptions.DAOException;
import objetonegocio.Queja;

/**
 *
 * @author fernando
 */
public class CtrlQueja {
    
    iDatos iDatos;

    public CtrlQueja(iDatos iDatos) {
        this.iDatos = iDatos;
    }
    
    public void guardarQueja(Queja queja) throws DAOException{
        iDatos.guardarQueja(queja);
    }
    
}
