/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.presentation.web.controllers;

import zw.ac.solusiuniversity.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import zw.ac.solusiuniversity.services.crud.UserServiceCRUD;
import zw.ac.solusiuniversity.services.logic.UserService;

/**
 *
 * @author given
 */
@Controller
public class HomeController {

    @Autowired
    private UserService userService;    
    @Autowired
    private UserServiceCRUD userServiceCRUD;

    @RequestMapping(value = {"/home", "/"})
    public String home() {        
        return "home";
    }
    
    @RequestMapping(value = "/users")
    public String users(Model model) {
        List<User> users = userServiceCRUD.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @RequestMapping(value = {"/searchuser"}, method = RequestMethod.GET)
    public @ResponseBody
    String getUser(@RequestParam(value = "username") String username) {

        System.out.println("Search for: " + username);
        User u = userServiceCRUD.readByUsername(username);
        String json = "";
        if (u != null) {
            json = u.toString();
        }
        return json;
    }

    @RequestMapping(value = "/deleteuser", method = RequestMethod.POST)
    public String deleteUser(
            @RequestParam(value = "id") String id,
            Model model) {
        User userToDelete = new User();
        userToDelete.setId(id);
        userServiceCRUD.delete(userToDelete); 
        List<User> users = userServiceCRUD.findAll(); 
        model.addAttribute("users", users);
        return "redirect:home";
    }

    @RequestMapping(value = "/updateuser/{id}", method = RequestMethod.POST)
    public @ResponseBody
    String deleteUser(
            @PathVariable(value = "id") String id,
            @RequestParam(value = "firstname") String firstname,
            @RequestParam(value = "lastname") String lastname,
            Model model) {
        System.out.println("ID received: " + id);
        User user = new User();
        user.setId(id);
        user.setFirstname(firstname);
        user.setLastname(lastname);
        String msg = userService.updateUser(user);
        System.out.println("Message: " + msg);
        return msg;
    }
}
