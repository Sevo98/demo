package com.example.demo.repository;

import com.example.demo.domain.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Tasks, Long> {
    
}
