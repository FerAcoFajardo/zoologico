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
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class CuidadorDAO extends BaseDAO<Cuidador> {

    @Override
    public Cuidador buscar(ObjectId id) throws DAOException {
        try {
           MongoCollection<Cuidador> coleccionCuidador = this.getColeccion();
            Cuidador cuidador = coleccionCuidador.find(
                    Filters.eq("_id", id)).first();
            if(cuidador == null){
                throw new DAOException("Error: El habitat no existe");
            }
            return cuidador;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public Cuidador buscar(String id) throws DAOException {
        try {
            return this.buscar(new ObjectId(id));
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void actualizar(Cuidador cuidador) throws DAOException {
        try {
            MongoCollection<Cuidador> coleccionCuidador = this.getColeccion();
            Cuidador cuidadorActualizado = coleccionCuidador.find(
                    Filters.eq("_id", cuidador.getId())).first();

            cuidadorActualizado.setNombre(cuidador.getNombre());
            cuidadorActualizado.setDireccion(cuidador.getDireccion());
            cuidadorActualizado.setTelefono(cuidador.getTelefono());
            cuidadorActualizado.setFecha(cuidador.getFecha());
            coleccionCuidador.findOneAndReplace(
                    Filters.eq("_id", cuidador.getId()),
                    cuidadorActualizado);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void eliminar(ObjectId id) throws DAOException {
        try {
            MongoCollection<Cuidador> coleccionCuidador = this.getColeccion();
            Cuidador cuidador = coleccionCuidador.findOneAndDelete(Filters.eq("_id", id));
            if(cuidador == null)
                throw new DAOException("Error: El cuidador no existe");
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
    protected MongoCollection<Cuidador> getColeccion() throws DAOException {
        MongoCollection<Cuidador> colecionCuidador
                = this.generarConexion().getCollection("cuidadores", Cuidador.class);
        return colecionCuidador;
    }

    @Override
    public List<Cuidador> buscar() throws DAOException {
        try {
            MongoCollection<Cuidador> coleccionCuidador = this.getColeccion();
            List<Cuidador> cuidadores = new ArrayList<>();
            coleccionCuidador.find().into(cuidadores);
            return cuidadores;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }

    }

    @Override
    public void guardar(Cuidador entidad) throws DAOException {
        try {
            MongoCollection<Cuidador> coleccionHabitat = this.getColeccion();
            coleccionHabitat.insertOne(entidad);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

}
