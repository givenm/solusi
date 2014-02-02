/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.presentation.web.controllers;

import zw.ac.solusiuniversity.model.User;
import zw.ac.solusiuniversity.repository.UserRepository;
import zw.ac.solusiuniversity.services.UserService;
import com.mongodb.util.JSON;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author given
 */
@Controller
public class HomeController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = {"/home", "/"})
    public String home(Model model) {
        List<User> users = userService.readAll();
        model.addAttribute("users", users);
        return "home";
    }

    @RequestMapping(value = {"/searchuser"}, method = RequestMethod.GET)
    public @ResponseBody
    String getUser(@RequestParam(value = "username") String username) {

        System.out.println("Search for: " + username);
        User u = userService.readByUsername(username);
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

        userRepository.delete(new String(id));
        List<User> users = userService.readAll();
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
