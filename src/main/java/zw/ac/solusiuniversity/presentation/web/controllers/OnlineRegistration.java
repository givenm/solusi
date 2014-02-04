/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.presentation.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import zw.ac.solusiuniversity.services.crud.user.UserServiceCRUD;
import zw.ac.solusiuniversity.services.logic.user.UserService;

/**
 *
 * @author given
 */
@Controller
public class OnlineRegistration {

    @Autowired
    private UserService userService;    
    @Autowired
    private UserServiceCRUD userServiceCRUD;

    @RequestMapping(value = {"/section-a-1"})
    public String home() {        
        return "section-a-1";
    }

}
