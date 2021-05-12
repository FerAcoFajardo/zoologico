/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;

/**
 *
 * @author fernando
 */
public abstract class BaseDAO<T> {
    
    /**
     *
     */
    public abstract List<T> buscar();
    public abstract void guardar(T entidad);
}
