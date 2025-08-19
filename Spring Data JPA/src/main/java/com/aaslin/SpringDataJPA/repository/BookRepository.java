package com.aaslin.SpringDataJPA.repository;

import com.aaslin.SpringDataJPA.entity.Book;
import org.springframework.data.jpa.repository.*;

public interface BookRepository extends JpaRepository<Book, Long> {
}