package com.aaslin.SpringDataJPA.repository;

import com.aaslin.SpringDataJPA.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long>{
}