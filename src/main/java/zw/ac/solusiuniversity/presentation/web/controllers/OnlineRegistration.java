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
    public String sectionAOne() {        
        return "section-a-1";
    }
    
    @RequestMapping(value = {"/saveSectionAOne"})
    public String saveSectionAOne() { 
        
        return "section-a-2";
    }
    
    @RequestMapping(value = {"/section-a-2"})
    public String sectionATwo() {        
        return "section-a-2";
    }
    
    @RequestMapping(value = {"/saveSectionATwo"})
    public String saveSectionATwo() { 
        
        return "section-a-3";
    }
    
    @RequestMapping(value = {"/section-a-3"})
    public String sectionAThree() {        
        return "section-a-3";
    }

}
