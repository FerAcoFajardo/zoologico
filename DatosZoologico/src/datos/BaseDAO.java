/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import exceptions.DAOException;
import java.util.List;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;

/**
 *
 * @author fernando
 * @param <T>
 */
public abstract class BaseDAO<T> {
    
    private static final String HOST = "localhost";
    private static final String PUERTO = "27017";
    private static final String BASE_DATOS = "zoologico";
    
    protected MongoDatabase generarConexion() throws DAOException{
        try{
            CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider
                    .builder().automatic(true).build());

            CodecRegistry codecRegistry = fromRegistries(
                    MongoClientSettings.getDefaultCodecRegistry(),
                    pojoCodecRegistry);

            ConnectionString cadenaConexion = new ConnectionString(
                String.format("mongodb://%s/%s", HOST, PUERTO)
            );

            MongoClientSettings configuracionesConexion = MongoClientSettings.builder()
                .applyConnectionString(cadenaConexion)
                .codecRegistry(codecRegistry)
                .build();

            MongoClient clienteBD = MongoClients.create(configuracionesConexion);

            MongoDatabase baseDatos = clienteBD.getDatabase(BASE_DATOS);
            
            return baseDatos;
        }catch(Exception ex){
            throw new DAOException(ex.getMessage(), ex);
        }
    }
    
    /**
     *
     * @return 
     * @throws exceptions.DAOException
     */
    public abstract List<T> buscar() throws DAOException;

    /**
     *
     * @param id
     * @return
     * @throws DAOException
     */
    public abstract T buscar(ObjectId id) throws DAOException;

    /**
     *
     * @param id
     * @return
     * @throws DAOException
     */
    public abstract T buscar(String id) throws DAOException;

    /**
     *
     * @param entidad
     * @throws DAOException
     */
    public abstract void guardar(T entidad) throws DAOException;

    /**
     *
     * @param entidad
     * @throws DAOException
     */
    public abstract void actualizar(T entidad) throws DAOException;

    /**
     *
     * @param id
     * @throws DAOException
     */
    public abstract void eliminar(ObjectId id) throws DAOException;

    /**
     *
     * @param id
     * @throws DAOException
     */
    public abstract void eliminar(String id) throws DAOException;

    /**
     *
     * @return
     * @throws DAOException
     */
    protected abstract MongoCollection<T> getColeccion() throws DAOException;  
}
