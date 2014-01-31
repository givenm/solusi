/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.repository;

import zw.ac.solusiuniversity.model.Role;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author given
 */
public interface RoleRepository extends MongoRepository<Role, ObjectId>{
    @Override
    public List<Role> findAll();
}
