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
import objetonegocio.Animal;
import objetonegocio.Especie;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class EspecieDAO extends BaseDAO<Especie> {

    @Override
    public Especie buscar(ObjectId id) throws DAOException {
        try {
            MongoCollection<Especie> coleccionEspecie = this.getColeccion();
            Especie especie = coleccionEspecie.find(
                    Filters.eq("_id", id)).first();
            if (especie == null) {
                throw new DAOException("Error: La especie no existe");
            }
            return especie;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public Especie buscar(String id) throws DAOException {
        try {
            return this.buscar(new ObjectId(id));
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    public Especie buscarNombre(String nombreComun) throws DAOException {
        try {
            MongoCollection<Especie> coleccionEspecie = this.getColeccion();
            Especie especie = coleccionEspecie.find(
                    Filters.eq("nombreNormal", nombreComun)).first();
            if (especie == null) {
                throw new DAOException("Error: La especie no existe");
            }
            return especie;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void actualizar(Especie especie) throws DAOException {
        try {
            MongoCollection<Especie> coleccionEspecie = this.getColeccion();
            Especie especieActualizado = coleccionEspecie.find(
                    Filters.eq("_id", especie.getId())).first();

            especieActualizado.setDescripcion(especie.getDescripcion());
            especieActualizado.setHabitat(especie.getHabitat());
            especieActualizado.setAnimales(especie.getAnimales());
            especieActualizado.setNombreCientifico(especie.getNombreCientifico());
            especieActualizado.setNombreNormal(especie.getNombreNormal());
            especieActualizado.setListaCuidadoresEspecie(especie.getListaCuidadoresEspecie());
             if (!especieActualizado.getAnimales().isEmpty()) {
                especieActualizado.setAnimales(especie.getAnimales());
            }

            coleccionEspecie.findOneAndReplace(
                    Filters.eq("_id", especie.getId()),
                    especieActualizado);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void eliminar(ObjectId id) throws DAOException {
        try {
            MongoCollection<Especie> coleccionEspecie = this.getColeccion();
            Especie especie = coleccionEspecie.findOneAndDelete(Filters.eq("_id", id));
            if (especie == null) {
                throw new DAOException("Error: El habitat no existe");
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
    protected MongoCollection<Especie> getColeccion() throws DAOException {
        MongoCollection<Especie> colecionEspecie
                = this.generarConexion().getCollection("especies", Especie.class);
        return colecionEspecie;
    }

    @Override
    public List<Especie> buscar() throws DAOException {
        try {
            MongoCollection<Especie> coleccionEspecie = this.getColeccion();
            List<Especie> especies = new ArrayList<>();
            coleccionEspecie.find().into(especies);
            return especies;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }

    }

    @Override
    public void guardar(Especie entidad) throws DAOException {
        try {
            MongoCollection<Especie> coleccionEspecie = this.getColeccion();
            coleccionEspecie.insertOne(entidad);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    

    

}
