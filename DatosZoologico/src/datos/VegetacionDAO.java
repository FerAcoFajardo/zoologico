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
import objetonegocio.Vegetacion;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class VegetacionDAO extends BaseDAO<Vegetacion> {

    @Override
    public List<Vegetacion> buscar() throws DAOException {
        try {
            MongoCollection<Vegetacion> coleccionVegetacion = this.getColeccion();
            List<Vegetacion> vegetaciones = new ArrayList<>();
            coleccionVegetacion.find().into(vegetaciones);
            return vegetaciones;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage()+this.getClass(), ex);
        }
    }

    @Override
    public Vegetacion buscar(ObjectId id) throws DAOException {
        try {
            MongoCollection<Vegetacion> coleccionVegetacion = this.getColeccion();
            Vegetacion vegetacion = coleccionVegetacion.find(
                    Filters.eq("_id", id)).first();
            return vegetacion;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public Vegetacion buscar(String id) throws DAOException {
        try {
            return this.buscar(new ObjectId(id));
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void guardar(Vegetacion entidad) throws DAOException {
        try {
            MongoCollection<Vegetacion> coleccionVegetacion = this.getColeccion();
            coleccionVegetacion.insertOne(entidad);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    public void actualizarVegetacion(ObjectId idHabitat, Vegetacion vegetacion) throws DAOException {
        try {
            MongoCollection<Vegetacion> coleccionVegetacion = this.getColeccion();
            coleccionVegetacion.updateOne(
                    Filters.eq("_id", idHabitat),
                    new Document("$set", new Document()
                            .append("vegetacion", vegetacion)
                    )
            );
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void actualizar(Vegetacion entidad) throws DAOException {
        try {
            MongoCollection<Vegetacion> coleccionVegetacion = this.getColeccion();
            Vegetacion vegetacionActualizado = coleccionVegetacion.find(
                    Filters.eq("_id", entidad.getId())).first();

            vegetacionActualizado.setNombre(entidad.getNombre());
            vegetacionActualizado.setNombreCientifico(entidad.getNombreCientifico());

            coleccionVegetacion.findOneAndReplace(
                    Filters.eq("_id", entidad.getId()),
                    vegetacionActualizado);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void eliminar(ObjectId id) throws DAOException {
        try {
            MongoCollection<Vegetacion> coleccionVegetacion = this.getColeccion();
            Vegetacion vegetacion = coleccionVegetacion.findOneAndDelete(Filters.eq("_id", id));
            if (vegetacion == null) {
                throw new DAOException("Error: La vegetación no existe");
            }
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
    protected MongoCollection<Vegetacion> getColeccion() throws DAOException {
        MongoCollection<Vegetacion> colecionVegetacion
                = this.generarConexion().getCollection("vegetacion", Vegetacion.class);
        return colecionVegetacion;
    }

}
