/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.ac.solusiuniversity.services.logic.user.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.User;
import zw.ac.solusiuniversity.services.crud.user.UserServiceCRUD;
import zw.ac.solusiuniversity.services.logic.user.UserService;

/**
 *
 * @author given
 */
@Service
public class UserServicImpl implements UserService{
    @Autowired
    UserServiceCRUD userServiceCRUD;
    
    @Override
    public String updateUser(User user) {
        User existingUser = userServiceCRUD.findById(user.getId());
        if(existingUser == null){
            return "The user does not exist anymore.";
        }
        
        User userUpdate = new User.Builder(user.getFirstname())
                .user(user)
                .lastname(user.getLastname())
                .build();
        
        userServiceCRUD.merge(userUpdate);
        return "Saved!" ;
    }
}
