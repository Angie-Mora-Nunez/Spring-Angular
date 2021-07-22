package com.example.labspringboot.controller;

import com.example.labspringboot.domain.User;
import com.example.labspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    @Autowired
    private UserService service;






    @GetMapping("/users")
    public List<User> list() {
        //¿reglas de negocio?
        //if...es admin
        return service.listAll();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id) {
        try {
            User usuario = service.get(id);
            return new ResponseEntity<User>(usuario, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }



    @PostMapping("/add")
    public User add(@RequestBody User usuario) {
        return service.save(usuario);
    }



    @PutMapping("/update/{id}")
    public ResponseEntity<User> update(@RequestBody User usuario, @PathVariable Integer id) {
        try {
            service.save(usuario);
            return new ResponseEntity<User>(usuario, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
