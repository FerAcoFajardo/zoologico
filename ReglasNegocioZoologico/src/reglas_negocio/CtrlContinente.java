/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas_negocio;

import java.util.Arrays;
import java.util.List;
import objetonegocio.Continente;

/**
 *
 * @author fernando
 */
public class CtrlContinente {
    
    public List<Continente> recuperarContinentes(){
        return Arrays.asList(Continente.AFRICA,Continente.AMERICA,Continente.ASIA,Continente.EUROPA,Continente.OCEANIA, Continente.ANTARTIDA);
    }
    
}
