/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zw.ac.solusiuniversity.model.EmergencyContact;

/**
 *
 * @author Luckbliss
 */
public interface EmergencyContactRepository extends MongoRepository<EmergencyContact, String>{
    
}
