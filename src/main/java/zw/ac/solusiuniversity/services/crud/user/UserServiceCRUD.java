/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.user;

import java.util.List;
import zw.ac.solusiuniversity.model.User;

/**
 *
 * @author given
 */
public interface UserServiceCRUD {

    public User findById(String id);

    public List<User> findAll();

    public void persist(User user);

    public void merge(User user);

    public void delete(User user);

    public User readByUsername(String username);
}
