package com.jwt.exaple.controllers;

import com.jwt.exaple.Model.User;
import com.jwt.exaple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    // http://localhost:8081/home/users
    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("Getting users");
        return this.userService.getUser();
    }

    // http://localhost:8081/home/current-user
    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
       return principal.getName();
    }
}
