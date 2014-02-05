/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.repository.mongoinitservice;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import javax.servlet.ServletException;
import zw.ac.solusiuniversity.model.Role;
import zw.ac.solusiuniversity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 *
 * @author given
 */
/**
 * Service for initializing MongoDB with sample data using {@link MongoTemplate}
 */
public class InitMongoService {

    @Autowired
    private MongoTemplate mongoTemplate;
    private Mongo mongo;
    private DB mongoDB;

    public void init() throws ServletException {
        DB db = mongoTemplate.getDb(); 
        try {
            DBObject ping = new BasicDBObject("ping", "1");
            db.command(ping);
            System.out.println("Connecting to local HOST DB"); //test if we have a connection
        }
        catch (Exception  e) {
            //connect to openshift Mongo DB
            System.out.println("TRYING TO CONNECT TO OPENSHIFT MONGODB NOW!!!!!!!!");
            
            String host = System.getenv("OPENSHIFT_MONGODB_DB_HOST"); 
            String sport = System.getenv("OPENSHIFT_MONGODB_DB_PORT");
            String dbName = System.getenv("OPENSHIFT_APP_NAME");
            if (dbName == null) { 
                dbName = "testmongo";
            }
            
            String user = System.getenv("OPENSHIFT_MONGODB_DB_USERNAME");
            String password = System.getenv("OPENSHIFT_MONGODB_DB_PASSWORD");
            
            int port = Integer.decode(sport);
            
            try {
                mongo = new Mongo(host, port);
            }
            catch (UnknownHostException ue) {
                throw new ServletException("Failed to access Mongo server", ue);
            }
            mongoDB = mongo.getDB(dbName);
            if (mongoDB.authenticate(user, password.toCharArray()) == false) {
                throw new ServletException("Failed to authenticate against db: " + db);
            } else {
                UserCredentials credentials = new UserCredentials(user, password);
                MongoTemplate newMongoTemplate = new MongoTemplate(mongo, dbName, credentials);
                mongoTemplate = newMongoTemplate;

//                ApplicationContext ctx = new GenericXmlApplicationContext("applicationContext-connection.xml");
//                MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate"); 
            }
            System.out.println("Connected to openshift DB");
        }

// Drop existing collections
        mongoTemplate.dropCollection("role");
        mongoTemplate.dropCollection("user");

        // Create new records
        Role adminRole = new Role.Builder("Administrator")
                .role(1)
                .build();

        Role userRole = new Role.Builder("User")
                .role(2)
                .build();

        User john = new User.Builder("John")
                .lastname("Smith")
                .password("21232f297a57a5a743894a0e4a801fc3")
                .role(adminRole)
                .username("john@gmail.com")
                .build();
        User given = new User.Builder("Given")
                .lastname("Nyauyanga")
                .password("ff11cbb19052e40b07aac0ca060c23ee")
                .role(userRole)
                .username("given@conycto.com")
                .build();

        User jane = new User.Builder("Jane")
                .lastname("Adams")
                .password("ee11cbb19052e40b07aac0ca060c23ee")
                .role(userRole)
                .username("jane@conycto.com")
                .build();

        User elison = new User.Builder("Elison")
                .lastname("Noraah")
                .password("2266cbb19052e40b07aac0ca060c23ee")
                .role(userRole)
                .username("elison@conycto.com")
                .build();

        User laura = new User.Builder("Laura")
                .lastname("Allimont")
                .password("ppoo88b19052e40b07aac0ca060c23ee")
                .role(userRole)
                .username("laura@gmail.com")
                .build();

        User simon = new User.Builder("Simon")
                .lastname("Saya")
                .password("2o69cbb19052e40b07aac0ca060c23ee")
                .role(userRole)
                .username("simon@gmail.com")
                .build();

        // Insert to db
        mongoTemplate.insert(adminRole, "role");
        mongoTemplate.insert(userRole, "role");
        mongoTemplate.insert(john, "user");
        mongoTemplate.insert(jane, "user");
        mongoTemplate.insert(given, "user");
        mongoTemplate.insert(elison, "user");
        mongoTemplate.insert(laura, "user");
        mongoTemplate.insert(simon, "user");

    }
}
