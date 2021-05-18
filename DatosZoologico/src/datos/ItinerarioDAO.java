/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import exceptions.DAOException;
import java.util.ArrayList;
import java.util.List;
import objetonegocio.Itinerario;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class ItinerarioDAO extends BaseDAO<Itinerario> {

    @Override
    public Itinerario buscar(ObjectId id) throws DAOException {
        try {
           MongoCollection<Itinerario> coleccionItinerario = this.getColeccion();
            Itinerario itinerario = coleccionItinerario.find(
                    Filters.eq("_id", id)).first();
            if(itinerario == null){
                throw new DAOException("Error: El itinerario no existe");
            }
            return itinerario;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public Itinerario buscar(String id) throws DAOException {
        try {
            return this.buscar(new ObjectId(id));
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void actualizar(Itinerario itinerario) throws DAOException {
        try {
            MongoCollection<Itinerario> coleccionItinerario = this.getColeccion();
            Itinerario itinerarioActualizado = coleccionItinerario.find(
                    Filters.eq("_id", itinerario.getId())).first();

            itinerarioActualizado.setFecha(itinerario.getFecha());
            itinerarioActualizado.setGuia(itinerario.getGuia());
            itinerarioActualizado.setQuejas(itinerario.getQuejas());
            itinerarioActualizado.setNombre(itinerario.getNombre());
            itinerarioActualizado.setMaxVisitantes(itinerario.getMaxVisitantes());
            coleccionItinerario.findOneAndReplace(
                    Filters.eq("_id", itinerario.getId()),
                    itinerarioActualizado);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void eliminar(ObjectId id) throws DAOException {
        try {
            MongoCollection<Itinerario> coleccionItinerario = this.getColeccion();
            Itinerario itinerario = coleccionItinerario.findOneAndDelete(Filters.eq("_id", id));
            if(itinerario == null)
                throw new DAOException("Error: El itinerario no existe");
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
    protected MongoCollection<Itinerario> getColeccion() throws DAOException {
        MongoCollection<Itinerario> colecionItinerario
                = this.generarConexion().getCollection("itinerarios", Itinerario.class);
        return colecionItinerario;
    }

    @Override
    public List<Itinerario> buscar() throws DAOException {
        try {
            MongoCollection<Itinerario> coleccionItinerario = this.getColeccion();
            List<Itinerario> itinerarios = new ArrayList<>();
            coleccionItinerario.find().into(itinerarios);
            return itinerarios;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }

    }

    @Override
    public void guardar(Itinerario entidad) throws DAOException {
        try {
            MongoCollection<Itinerario> coleccionItinerario = this.getColeccion();
            coleccionItinerario.insertOne(entidad);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }


    public void agregarQueja(ObjectId idItinerario, ObjectId queja) throws DAOException {
         try {
            MongoCollection<Itinerario> coleccionItinerario = this.getColeccion();
            coleccionItinerario.updateOne(Filters.eq("_id", idItinerario),
                    new Document("$push", new Document()
                            .append("queja", queja)
                    )
            );
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }
    
    
    public void eliminarQueja(ObjectId idItinerario, ObjectId idQueja) throws DAOException {
         try {
            MongoCollection<Itinerario> coleccionItinerario = getColeccion();
            coleccionItinerario.updateOne(Filters.eq("_id", idItinerario), 
                    Updates.pull("quejas", Filters.eq("_id", idQueja)));
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

}
