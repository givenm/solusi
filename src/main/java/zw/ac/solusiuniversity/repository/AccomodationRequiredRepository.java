/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zw.ac.solusiuniversity.model.AccomodationRequired;

/**
 *
 * @author Luckbliss
 */
public interface AccomodationRequiredRepository extends MongoRepository<AccomodationRequired, String>{
}
