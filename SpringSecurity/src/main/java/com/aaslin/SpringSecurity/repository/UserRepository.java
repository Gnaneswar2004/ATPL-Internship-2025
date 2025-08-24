package com.aaslin.SpringSecurity.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.aaslin.SpringSecurity.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
}