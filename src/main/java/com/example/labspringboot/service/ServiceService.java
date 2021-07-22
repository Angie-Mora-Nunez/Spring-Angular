package com.example.labspringboot.service;

import com.example.labspringboot.domain.Service;
import com.example.labspringboot.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {
    @Autowired
    private ServiceRepository repository;

    public List<Service> listAll() {
        return repository.findAll();
    }

    public Service save(Service service) {
        repository.save(service);
        return service;
    }

    public Service get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
