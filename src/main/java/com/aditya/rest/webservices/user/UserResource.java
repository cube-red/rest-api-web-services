package com.aditya.rest.webservices.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    private UserDaoService userDaoService;

    public UserResource(UserDaoService userDaoService){
        this.userDaoService = userDaoService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userDaoService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Integer id){
        return userDaoService.getUser(id);
    }

    //Post Users
    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        userDaoService.save(user);

    }

}

