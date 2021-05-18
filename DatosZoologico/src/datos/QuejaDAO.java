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
import objetonegocio.Queja;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class QuejaDAO extends BaseDAO<Queja> {

    @Override
    public Queja buscar(ObjectId id) throws DAOException {
        try {
           MongoCollection<Queja> coleccionQueja = this.getColeccion();
            Queja queja = coleccionQueja.find(
                    Filters.eq("_id", id)).first();
            if(queja == null){
                throw new DAOException("Error: El queja no existe");
            }
            return queja;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public Queja buscar(String id) throws DAOException {
        try {
            return this.buscar(new ObjectId(id));
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void actualizar(Queja queja) throws DAOException {
        
        try {
            MongoCollection<Queja> coleccionQueja = this.getColeccion();
            Queja quejaActualizado = coleccionQueja.find(
                    Filters.eq("_id", queja.getId())).first();

            quejaActualizado.setCorreo(queja.getCorreo());
            quejaActualizado.setFecha(queja.getFecha());
            quejaActualizado.setItinerario(queja.getItinerario());
            quejaActualizado.setNombreCompleto(queja.getNombreCompleto());
            quejaActualizado.setTelefono(queja.getTelefono());
            coleccionQueja.findOneAndReplace(
                    Filters.eq("_id", queja.getId()),
                    quejaActualizado);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void eliminar(ObjectId id) throws DAOException {
        try {
            MongoCollection<Queja> coleccionQueja = this.getColeccion();
            Queja queja = coleccionQueja.findOneAndDelete(Filters.eq("_id", id));
            if(queja == null)
                throw new DAOException("Error: El queja no existe");
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
    protected MongoCollection<Queja> getColeccion() throws DAOException {
        MongoCollection<Queja> colecionQueja
                = this.generarConexion().getCollection("quejas", Queja.class);
        return colecionQueja;
    }

    @Override
    public List<Queja> buscar() throws DAOException {
        try {
            MongoCollection<Queja> coleccionQueja = this.getColeccion();
            List<Queja> quejas = new ArrayList<>();
            coleccionQueja.find().into(quejas);
            return quejas;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }

    }

    @Override
    public void guardar(Queja entidad) throws DAOException {
        try {
            MongoCollection<Queja> coleccionQueja = this.getColeccion();
            coleccionQueja.insertOne(entidad);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }



}
