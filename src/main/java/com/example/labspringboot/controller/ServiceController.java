package com.example.labspringboot.controller;


import com.example.labspringboot.domain.Service;
import com.example.labspringboot.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/service")

public class ServiceController {

    @Autowired
    private ServiceService service;

    @GetMapping("/services")
    public List<Service> list() {
        //¿reglas de negocio?
        //if...es admin
        return service.listAll();
    }

    @GetMapping("/service/{id}")
    public ResponseEntity<Service> get(@PathVariable Integer id) {
        try {
            Service ser = service.get(id);
            return new ResponseEntity<Service>(ser, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Service>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public Service add(@RequestBody Service ser) {
        return service.save(ser);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Service> update(@RequestBody Service ser, @PathVariable Integer id) {
        try {
            service.save(ser);
            return new ResponseEntity<Service>(ser, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Service>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
