package com.example.Support.Model.Service;
import com.example.Support.Model.Model.Issues;
import com.example.Support.Model.repository.SupportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service

@Transactional
public class SupportService {

    @Autowired
    private SupportRepository supportRepository;

    public List<Issues> listAll() {
        return supportRepository.findAll();
    }

    public Issues save(Issues issues) {
        supportRepository.save(issues);
        return issues;
    }

    public Issues get(int Id) {
        return supportRepository.findById(Id).get();
    }

    public void delete(int Id) {
        supportRepository.deleteById(Id);
    }

}
