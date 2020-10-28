package com.example.demo.repository;

import com.example.demo.domain.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TasksRepository extends JpaRepository<Tasks, UUID> {
    Tasks findByName(String name);
}
