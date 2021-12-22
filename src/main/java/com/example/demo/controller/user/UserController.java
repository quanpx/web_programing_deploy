package com.example.demo.controller.user;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public interface UserController<T> {

    @GetMapping
    List<T> getAllUsers() ;
        
    @GetMapping("/{id}")
    T getUserById(@PathVariable("id") Integer userId);
    
    @PostMapping
    boolean addUser(@RequestBody T userDTO);

    @DeleteMapping("/{id}")
    boolean removeUser(@PathVariable("id") Integer userid);
    
    
}
