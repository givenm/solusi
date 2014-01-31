/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services;

import zw.ac.solusiuniversity.model.User;
import zw.ac.solusiuniversity.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author given
 */
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public List<User> readAll(){
        return userRepository.findAll();
    }
    
    public User readByUsername(String username) {        
        return userRepository.findByUsername(username);
    }

    public String updateUser(User user) {
        User existingUser = userRepository.findOne(user.getId());
        if(existingUser == null){
            return "The user does not exist anymore.";
        }
        
        existingUser.setFirstname(user.getFirstname());
        existingUser.setLastname(user.getLastname());
        
        userRepository.save(existingUser);
        return "Saved!" ;
    }
}
