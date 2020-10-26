package com.example.demo.repository;

import com.example.demo.domain.Lists;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Java-doc
 */
public interface ListsRepository extends JpaRepository<Lists, Integer> {
    Lists findByName(String name);
}
