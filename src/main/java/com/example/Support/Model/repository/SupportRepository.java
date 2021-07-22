package com.example.Support.Model.repository;
        import com.example.Support.Model.Model.Issues;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface SupportRepository extends JpaRepository<Issues, Integer> {
}
