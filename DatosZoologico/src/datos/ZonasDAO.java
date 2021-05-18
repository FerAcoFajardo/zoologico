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
import objetonegocio.Zona;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class ZonasDAO extends BaseDAO<Zona> {

    @Override
    public Zona buscar(ObjectId id) throws DAOException {
        try {
           MongoCollection<Zona> coleccionHabitat = this.getColeccion();
            Zona zona = coleccionHabitat.find(
                    Filters.eq("_id", id)).first();
            if(zona == null){
                throw new DAOException("Error: El zona no existe");
            }
            return zona;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public Zona buscar(String id) throws DAOException {
        try {
            return this.buscar(new ObjectId(id));
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void actualizar(Zona zona) throws DAOException {
        try {
            MongoCollection<Zona> coleccionHabitat = this.getColeccion();
            Zona zonaActualizado = coleccionHabitat.find(
                    Filters.eq("_id", zona.getId())).first();

            zonaActualizado.setNombre(zona.getNombre());
            zonaActualizado.setEspecies(zona.getEspecies());
            zonaActualizado.setExtension(zona.getExtension());
         //   if (!zonaActualizado.getEspecies().isEmpty()) {
           //     zonaActualizado.setEspecies(zona.getEspecies());
            //}

            coleccionHabitat.findOneAndReplace(
                    Filters.eq("_id", zona.getId()),
                    zonaActualizado);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void eliminar(ObjectId id) throws DAOException {
        try {
            MongoCollection<Zona> coleccionHabitat = this.getColeccion();
            Zona zona = coleccionHabitat.findOneAndDelete(Filters.eq("_id", id));
            if(zona == null)
                throw new DAOException("Error: El zona no existe");
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
    protected MongoCollection<Zona> getColeccion() throws DAOException {
        MongoCollection<Zona> colecionHabitat
                = this.generarConexion().getCollection("zonas", Zona.class);
        return colecionHabitat;
    }

    @Override
    public List<Zona> buscar() throws DAOException {
        try {
            MongoCollection<Zona> coleccionHabitat = this.getColeccion();
            List<Zona> zonas = new ArrayList<>();
            coleccionHabitat.find().into(zonas);
            return zonas;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }

    }

    @Override
    public void guardar(Zona entidad) throws DAOException {
        try {
            MongoCollection<Zona> coleccionHabitat = this.getColeccion();
            coleccionHabitat.insertOne(entidad);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    public void agregarContinente(ObjectId id, List<Continente> continentes) throws DAOException {
        try {
            MongoCollection<Zona> coleccionHabitat = this.getColeccion();
            coleccionHabitat.updateOne(Filters.eq("_id", id),
                    new Document("$push", new Document()
                            .append("continentes", continentes)
                    )
            );
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }

    }

    public void agregarEspecies(ObjectId idHabitat, List<Especie> especies) throws DAOException {
         try {
            MongoCollection<Zona> coleccionHabitat = this.getColeccion();
            coleccionHabitat.updateOne(Filters.eq("_id", idHabitat),
                    new Document("$push", new Document()
                            .append("especies", especies)
                    )
            );
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }
    
    
    public void eliminarEspecies(ObjectId idHabitat, ObjectId idEspecies) throws DAOException {
         try {
            MongoCollection<Zona> coleccionHabitat = this.getColeccion();
            coleccionHabitat.updateOne(Filters.eq("_id", idHabitat),
                    new Document("$pull", new Document()
                            .append("especies", Filters.eq("_id",idEspecies))
                    )
            );
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

}
