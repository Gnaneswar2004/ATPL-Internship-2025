package com.aaslin.SpringDataJPA.repository;

import com.aaslin.SpringDataJPA.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}