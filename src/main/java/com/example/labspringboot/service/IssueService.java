package com.example.labspringboot.service;

import com.example.labspringboot.domain.Issue;
import com.example.labspringboot.domain.Issue2;
import com.example.labspringboot.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {

    @Autowired
    private IssueRepository repository;

    public List<Issue> listAll() {
        return repository.findAll();
    }

    public Issue save(Issue issue) {
        repository.save(issue);
        return issue;
    }

    public Issue get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
