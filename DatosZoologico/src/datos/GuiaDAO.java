/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import exceptions.DAOException;
import java.util.ArrayList;
import java.util.List;
import objetonegocio.Cuidador;
import objetonegocio.Guia;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class GuiaDAO extends BaseDAO<Guia> {

    @Override
    public List<Guia> buscar() throws DAOException {
        try {
            MongoCollection<Guia> coleccionGuia = this.getColeccion();
            List<Guia> guias = new ArrayList<>();
            coleccionGuia.find().into(guias);
            return guias;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public Guia buscar(ObjectId id) throws DAOException {
        try {
           MongoCollection<Guia> coleccionGuia = this.getColeccion();
            Guia guia = coleccionGuia.find(
                    Filters.eq("_id", id)).first();
            if(guia == null){
                throw new DAOException("Error: El habitat no existe");
            }
            return guia;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public Guia buscar(String id) throws DAOException {
        try {
            return this.buscar(new ObjectId(id));
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void guardar(Guia entidad) throws DAOException {
        try {
            MongoCollection<Guia> coleccionGuia = this.getColeccion();
            coleccionGuia.insertOne(entidad);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void actualizar(Guia entidad) throws DAOException {
        try {
            MongoCollection<Guia> coleccionGuia = this.getColeccion();
            Guia guiaActualizado = coleccionGuia.find(
                    Filters.eq("_id", entidad.getId())).first();

            guiaActualizado.setNombre(entidad.getNombre());
            guiaActualizado.setDireccion(entidad.getDireccion());
            guiaActualizado.setTelefono(entidad.getTelefono());
            guiaActualizado.setFecha(entidad.getFecha());
            coleccionGuia.findOneAndReplace(
                    Filters.eq("_id", entidad.getId()),
                    guiaActualizado);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void eliminar(ObjectId id) throws DAOException {
       try {
            MongoCollection<Guia> coleccionGuia = this.getColeccion();
            Guia guia = coleccionGuia.findOneAndDelete(Filters.eq("_id", id));
            if(guia == null)
                throw new DAOException("Error: El guia no existe");
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void eliminar(String id) throws DAOException {
        try {
            this.eliminar(new ObjectId(id));
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    protected MongoCollection<Guia> getColeccion() throws DAOException {
        MongoCollection<Guia> colecionGuia
                = this.generarConexion().getCollection("guias", Guia.class);
        return colecionGuia;
    }

   

}
