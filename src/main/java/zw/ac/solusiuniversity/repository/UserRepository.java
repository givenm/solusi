/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.repository;

import zw.ac.solusiuniversity.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author given
 */
public interface UserRepository extends MongoRepository<User, String>{
    public User findByUsername(String username);    
}
