package com.example.labspringboot.service;

import com.example.labspringboot.domain.Comment;
import com.example.labspringboot.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository repository;

    public List<Comment> listAll() {
        return repository.findAll();
    }

    public Comment save(Comment comment) {
        repository.save(comment);
        return comment;
    }

    public Comment get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
