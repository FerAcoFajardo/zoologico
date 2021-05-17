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
import objetonegocio.Continente;
import objetonegocio.Especie;
import objetonegocio.Habitat;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 */
public class AnimalesDAO {

//    public Animal buscar(ObjectId idAnimal, ObjectId idEspecie) throws DAOException {
////        try {
////           MongoCollection<Animal> coleccionAnimal = this.getColeccion();
////            Animal animal = coleccionAnimal.find(
////                    Filters.eq("_id", idAnimal,)).first();
////            if(animal == null){
////                throw new DAOException("Error: El animal no existe");
////            }
////            return animal;
////        } catch (Exception ex) {
////            throw new DAOException(ex.getMessage(), ex);
////        }
//    }
//
//    public Animal buscar(String id) throws DAOException {
//        try {
//            return this.buscar(new ObjectId(id));
//        } catch (Exception ex) {
//            throw new DAOException(ex.getMessage(), ex);
//        }
//    }

//    @Override
//    public void actualizar(Animal animal) throws DAOException {
//        try {
//            MongoCollection<Animal> coleccionAnimal = this.getColeccion();
//            Animal animalActualizado = coleccionAnimal.find(
//                    Filters.eq("_id", animal.getId())).first();
//
//            animalActualizado.setNombre(animal.getNombre());
//            animalActualizado.setClima(animal.getClima());
//            animalActualizado.setContinentes(animal.getContinentes());
//           // if (!habitatActualizado.getEspecies().isEmpty()) {
//            //    habitatActualizado.setEspecies(habitat.getEspecies());
//            //}
//
//            coleccionAnimal.findOneAndReplace(
//                    Filters.eq("_id", animal.getId()),
//                    animalActualizado);
//        } catch (Exception ex) {
//            throw new DAOException(ex.getMessage(), ex);
//        }
//    }
//
//    @Override
//    public void eliminar(ObjectId id) throws DAOException {
//        try {
//            MongoCollection<Animal> coleccionHabitat = this.getColeccion();
//            Animal habitat = coleccionHabitat.findOneAndDelete(Filters.eq("_id", id));
//            if(habitat == null)
//                throw new DAOException("Error: El habitat no existe");
//        } catch (Exception ex) {
//            throw new DAOException(ex.getMessage(), ex);
//        }
//    }
//
//    @Override
//    public void eliminar(String id) throws DAOException {
//        try {
//            this.eliminar(new ObjectId(id));
//        } catch (Exception ex) {
//            throw new DAOException(ex.getMessage(), ex);
//        }
//    }
//
//    @Override
//    protected MongoCollection<Animal> getColeccion() throws DAOException {
//        MongoCollection<Animal> colecionAnimal
//                = this.generarConexion().getCollection("animales", Animal.class);
//        return colecionAnimal;
//    }
//
//    @Override
//    public List<Animal> buscar() throws DAOException {
//        try {
//            MongoCollection<Animal> coleccionHabitat = this.getColeccion();
//            List<Animal> habitats = new ArrayList<>();
//            coleccionHabitat.find().into(habitats);
//            return habitats;
//        } catch (Exception ex) {
//            throw new DAOException(ex.getMessage(), ex);
//        }
//
//    }
//
//    @Override
//    public void guardar(Animal entidad) throws DAOException {
//        try {
//            MongoCollection<Animal> coleccionHabitat = this.getColeccion();
//            coleccionHabitat.insertOne(entidad);
//        } catch (Exception ex) {
//            throw new DAOException(ex.getMessage(), ex);
//        }
//    }
//
////    public void agregarContinente(ObjectId id, List<Continente> continentes) throws DAOException {
////        try {
////            MongoCollection<Animal> coleccionHabitat = this.getColeccion();
////            coleccionHabitat.updateOne(Filters.eq("_id", id),
////                    new Document("$push", new Document()
////                            .append("continentes", continentes)
////                    )
////            );
////        } catch (Exception ex) {
////            throw new DAOException(ex.getMessage(), ex);
////        }
////
////    }
////
////    public void agregarEspecies(ObjectId idHabitat, List<Especie> especies) throws DAOException {
////         try {
////            MongoCollection<Animal> coleccionHabitat = this.getColeccion();
////            coleccionHabitat.updateOne(Filters.eq("_id", idHabitat),
////                    new Document("$push", new Document()
////                            .append("especies", especies)
////                    )
////            );
////        } catch (Exception ex) {
////            throw new DAOException(ex.getMessage(), ex);
////        }
////    }
////    
////    
////    public void eliminarEspecies(ObjectId idHabitat, ObjectId idEspecies) throws DAOException {
////         try {
////            MongoCollection<Habitat> coleccionHabitat = this.getColeccion();
////            coleccionHabitat.updateOne(Filters.eq("_id", idHabitat),
////                    new Document("$pull", new Document()
////                            .append("especies", Filters.eq("_id",idEspecies))
////                    )
////            );
////        } catch (Exception ex) {
////            throw new DAOException(ex.getMessage(), ex);
////        }
////    }

}
