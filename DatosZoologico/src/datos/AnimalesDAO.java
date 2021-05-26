/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;


import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;
import com.mongodb.client.model.Updates;
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
public class AnimalesDAO extends BaseDAO<Especie> {

    @Override
    public List<Especie> buscar() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Especie buscar(ObjectId id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Especie buscar(String id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Especie entidad) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Especie entidad) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ObjectId id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected MongoCollection<Especie> getColeccion() throws DAOException {
        MongoCollection<Especie> colecionEspecie
                = this.generarConexion().getCollection("especies", Especie.class);
        return colecionEspecie;
    }

    public List<Animal> buscarAnimal(ObjectId idEspecie) throws DAOException {
        try {
            if (idEspecie == null) {
                return new ArrayList<>();
            } else {
                List<Animal> animales;
                MongoCollection<Especie> coleccionEspecie = this.getColeccion();
                Especie especie = coleccionEspecie.find(Filters.eq("_id", idEspecie)
                        ).projection(
                                fields(include("animales"))
                        ).first();
                
                animales = especie.getAnimales();
                return animales;
            }
            
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    public void agregarAnimal(ObjectId idEspecie, Animal animales) throws DAOException {
        try {
            MongoCollection<Especie> coleccionEspecie = this.getColeccion();
            coleccionEspecie.updateOne(Filters.eq("_id", idEspecie),
                    new Document("$push", new Document()
                            .append("animales", animales)
                    )
            );
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    public void eliminarAnimal(ObjectId idEspecie, ObjectId idAnimal) throws DAOException {
        try {
            MongoCollection<Especie> coleccionEspecie = getColeccion();
            coleccionEspecie.updateOne(Filters.eq("_id", idEspecie), 
                    Updates.pull("animales", Filters.eq("_id", idAnimal)));
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }
}
