/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zw.ac.solusiuniversity.model.PreviousEducation;

/**
 *
 * @author Luckbliss
 */
public interface PreviousEducationRepository extends MongoRepository<PreviousEducation, String>{
    
}
