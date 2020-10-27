package com.example.demo.repository;

import com.example.demo.domain.Lists;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ListsRepository extends JpaRepository<Lists, UUID> {
    Lists findByName(String name);
}
