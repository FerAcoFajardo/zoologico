/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas_negocio;

import datos.iDatos;
import exceptions.DAOException;
import java.util.List;
import objetonegocio.Guia;

/**
 *
 * @author fernando
 */
public class CtrlGuia {
    
    iDatos iDatos;

    public CtrlGuia(iDatos iDatos) {
        this.iDatos = iDatos;
    }
    
    public List<Guia> recuperaGuias() throws DAOException{
        return iDatos.recuperarGuias();
    }
    
}
