package com.example.labspringboot.controller;

import com.example.labspringboot.domain.Comment;
import com.example.labspringboot.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/comment")

public class CommentController {
    @Autowired
    private CommentService service;

    @GetMapping("/comments")
    public List<Comment> list() {
        //¿reglas de negocio?
        //if...es admin
        return service.listAll();
    }

    @GetMapping("/comment/{id}")
    public ResponseEntity<Comment> get(@PathVariable Integer id) {
        try {
            Comment comment = service.get(id);
            return new ResponseEntity<Comment>(comment, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Comment>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public Comment add(@RequestBody Comment comment) {
        return service.save(comment);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Comment> update(@RequestBody Comment comment, @PathVariable Integer id) {
        try {
            service.save(comment);
            return new ResponseEntity<Comment>(comment, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Comment>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
