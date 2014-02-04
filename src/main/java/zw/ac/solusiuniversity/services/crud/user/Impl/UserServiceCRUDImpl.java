/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.user.Impl;

import zw.ac.solusiuniversity.model.User;
import zw.ac.solusiuniversity.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.services.crud.user.UserServiceCRUD;

/**
 *
 * @author given
 */
@Service
public class UserServiceCRUDImpl implements UserServiceCRUD{
    
    @Autowired
    private UserRepository repository;
    
    @Override
    public List<User> findAll(){
        return repository.findAll();
    }
    
    @Override
    public User readByUsername(String username) {        
        return repository.findByUsername(username);
    }

    @Override
    public void persist(User user) {
        repository.save(user);
    }

    @Override
    public void merge(User user) {
        if (user.getId() != null) {
            repository.save(user);
        }
    }

    @Override
    public User findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(User user) {
        repository.delete(user);
    }
}
