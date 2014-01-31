/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.repository.mongoinitservice;

import zw.ac.solusiuniversity.model.Role;
import zw.ac.solusiuniversity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
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

    public void init() {
        // Drop existing collections
        mongoTemplate.dropCollection("role");
        mongoTemplate.dropCollection("user");

        // Create new records
        Role adminRole = new Role();
        adminRole.setRole(1);
        adminRole.setRolename("Administrator");

        Role userRole = new Role();
        userRole.setRole(2);
        userRole.setRolename("User");

        User john = new User();       
        john.setFirstname("John");
        john.setLastname("Smith");
        john.setPassword("21232f297a57a5a743894a0e4a801fc3");
        john.setRole(adminRole);
        john.setUsername("john");
        
        User given = new User();       
        given.setFirstname("Given");
        given.setLastname("Nyauyanga");
        given.setPassword("ff11cbb19052e40b07aac0ca060c23ee");
        given.setRole(userRole);
        given.setUsername("given");
        
        User jane = new User();       
        jane.setFirstname("Jane");
        jane.setLastname("Adams");
        jane.setPassword("ee11cbb19052e40b07aac0ca060c23ee");
        jane.setRole(userRole);
        jane.setUsername("jane");  
        
        User elison = new User();       
        elison.setFirstname("Elison");
        elison.setLastname("Noraah");
        elison.setPassword("2266cbb19052e40b07aac0ca060c23ee");
        elison.setRole(userRole);
        elison.setUsername("elison");
        
        User laura = new User();       
        laura.setFirstname("Laura");
        laura.setLastname("Allimont");
        laura.setPassword("ppoo88b19052e40b07aac0ca060c23ee");
        laura.setRole(userRole);
        laura.setUsername("jane");  
        
        User simon = new User();       
        simon.setFirstname("Simon");
        simon.setLastname("Saya");
        simon.setPassword("2o69cbb19052e40b07aac0ca060c23ee");
        simon.setRole(userRole);
        simon.setUsername("simon");

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
