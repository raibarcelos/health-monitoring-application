package com.example.monitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.monitoring.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
