package com.project.pm.controller;

import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nameM
 */
@RestController
public class UsersController {

    @Autowired
    private UserService userService;

    @Transactional(propagation = Propagation.SUPPORTS)
    @GetMapping("/getUser")
    public Object hello(int id){
        return userService.getUserInfo(id);
    }
}
