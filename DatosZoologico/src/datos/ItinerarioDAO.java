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
import objetonegocio.Habitat;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class ItinerarioDAO extends BaseDAO<Habitat> {

    @Override
    public Habitat buscar(ObjectId id) throws DAOException {
        try {
           MongoCollection<Habitat> coleccionHabitat = this.getColeccion();
            Habitat habitat = coleccionHabitat.find(
                    Filters.eq("_id", id)).first();
            if(habitat == null){
                throw new DAOException("Error: El habitat no existe");
            }
            return habitat;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public Habitat buscar(String id) throws DAOException {
        try {
            return this.buscar(new ObjectId(id));
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void actualizar(Habitat habitat) throws DAOException {
        try {
            MongoCollection<Habitat> coleccionHabitat = this.getColeccion();
            Habitat habitatActualizado = coleccionHabitat.find(
                    Filters.eq("_id", habitat.getId())).first();

            habitatActualizado.setNombre(habitat.getNombre());
            habitatActualizado.setClima(habitat.getClima());
            habitatActualizado.setContinentes(habitat.getContinentes());
           // if (!habitatActualizado.getEspecies().isEmpty()) {
            //    habitatActualizado.setEspecies(habitat.getEspecies());
            //}

            coleccionHabitat.findOneAndReplace(
                    Filters.eq("_id", habitat.getId()),
                    habitatActualizado);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    @Override
    public void eliminar(ObjectId id) throws DAOException {
        try {
            MongoCollection<Habitat> coleccionHabitat = this.getColeccion();
            Habitat habitat = coleccionHabitat.findOneAndDelete(Filters.eq("_id", id));
            if(habitat == null)
                throw new DAOException("Error: El habitat no existe");
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
    protected MongoCollection<Habitat> getColeccion() throws DAOException {
        MongoCollection<Habitat> colecionHabitat
                = this.generarConexion().getCollection("habitats", Habitat.class);
        return colecionHabitat;
    }

    @Override
    public List<Habitat> buscar() throws DAOException {
        try {
            MongoCollection<Habitat> coleccionHabitat = this.getColeccion();
            List<Habitat> habitats = new ArrayList<>();
            coleccionHabitat.find().into(habitats);
            return habitats;
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }

    }

    @Override
    public void guardar(Habitat entidad) throws DAOException {
        try {
            MongoCollection<Habitat> coleccionHabitat = this.getColeccion();
            coleccionHabitat.insertOne(entidad);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    public void agregarContinente(ObjectId id, List<Continente> continentes) throws DAOException {
        try {
            MongoCollection<Habitat> coleccionHabitat = this.getColeccion();
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
            MongoCollection<Habitat> coleccionHabitat = this.getColeccion();
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
            MongoCollection<Habitat> coleccionHabitat = this.getColeccion();
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
