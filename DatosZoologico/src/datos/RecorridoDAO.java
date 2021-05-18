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
import objetonegocio.Continente;
import objetonegocio.Especie;
import objetonegocio.Recorrido;
import objetonegocio.Recorrido;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class RecorridoDAO extends BaseDAO<Recorrido> {

    @Override
    public Recorrido buscar(ObjectId id) throws DAOException {
        try {
           MongoCollection<Recorrido> coleccionRecorrido = this.getColeccion();
            Recorrido recorrido = coleccionRecorrido.find(
                    Filters.eq("_id", id)).first();
            if(recorrido == null){
                throw new DAOException("Error: El recorrido no existe");
            }
            return recorrido;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public Recorrido buscar(String id) throws DAOException {
        try {
            return this.buscar(new ObjectId(id));
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void actualizar(Recorrido recorrido) throws DAOException {
        try {
            MongoCollection<Recorrido> coleccionRecorrido = this.getColeccion();
            Recorrido recorridoActualizado = coleccionRecorrido.find(
                    Filters.eq("_id", recorrido.getId())).first();

            recorridoActualizado.setDuracion(recorrido.getDuracion());
            recorridoActualizado.setLongitud(recorrido.getLongitud());
            recorridoActualizado.setNumEspecies(recorrido.getNumEspecies());
            recorridoActualizado.setZona(recorrido.getZona());
//            if (!recorridoActualizado.getEspecies().isEmpty()) {
//                recorridoActualizado.setEspecies(recorrido.getEspecies());
//            }

            coleccionRecorrido.findOneAndReplace(
                    Filters.eq("_id", recorrido.getId()),
                    recorridoActualizado);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void eliminar(ObjectId id) throws DAOException {
        try {
            MongoCollection<Recorrido> coleccionRecorrido = this.getColeccion();
            Recorrido recorrido = coleccionRecorrido.findOneAndDelete(Filters.eq("_id", id));
            if(recorrido == null)
                throw new DAOException("Error: El recorrido no existe");
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
    protected MongoCollection<Recorrido> getColeccion() throws DAOException {
        MongoCollection<Recorrido> colecionRecorrido
                = this.generarConexion().getCollection("recorridos", Recorrido.class);
        return colecionRecorrido;
    }

    @Override
    public List<Recorrido> buscar() throws DAOException {
        try {
            MongoCollection<Recorrido> coleccionRecorrido = this.getColeccion();
            List<Recorrido> recorridos = new ArrayList<>();
            coleccionRecorrido.find().into(recorridos);
            return recorridos;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }

    }

    @Override
    public void guardar(Recorrido entidad) throws DAOException {
        try {
            MongoCollection<Recorrido> coleccionRecorrido = this.getColeccion();
            coleccionRecorrido.insertOne(entidad);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    public void agregarContinente(ObjectId id, List<Continente> continentes) throws DAOException {
        try {
            MongoCollection<Recorrido> coleccionRecorrido = this.getColeccion();
            coleccionRecorrido.updateOne(Filters.eq("_id", id),
                    new Document("$push", new Document()
                            .append("continentes", continentes)
                    )
            );
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }

    }

    public void agregarEspecies(ObjectId idRecorrido, List<Especie> especies) throws DAOException {
         try {
            MongoCollection<Recorrido> coleccionRecorrido = this.getColeccion();
            coleccionRecorrido.updateOne(Filters.eq("_id", idRecorrido),
                    new Document("$push", new Document()
                            .append("especies", especies)
                    )
            );
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }
    
    
    public void eliminarEspecies(ObjectId idRecorrido, ObjectId idEspecies) throws DAOException {
         try {
            MongoCollection<Recorrido> coleccionRecorrido = this.getColeccion();
            coleccionRecorrido.updateOne(Filters.eq("_id", idRecorrido),
                    new Document("$pull", new Document()
                            .append("especies", Filters.eq("_id",idEspecies))
                    )
            );
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

}
