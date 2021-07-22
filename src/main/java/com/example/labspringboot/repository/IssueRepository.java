package com.example.labspringboot.repository;

import com.example.labspringboot.domain.Issue;
import com.example.labspringboot.domain.Issue2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Integer> {
}
