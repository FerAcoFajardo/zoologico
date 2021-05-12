/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.regla_negocios;

import java.util.Arrays;
import java.util.List;
import objetonegocio.Clima;

/**
 *
 * @author fernando
 */
public class CtrlClima {
    
    public List<Clima> recuperarContinentes(){
        return Arrays.asList(Clima.CALIDO,Clima.FRIO,Clima.TEMPLADO);
    }
    
}
