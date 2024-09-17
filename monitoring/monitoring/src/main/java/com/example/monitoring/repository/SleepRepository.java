package com.example.monitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.monitoring.model.Sleep;

public interface SleepRepository extends JpaRepository<Sleep, Long> {
}
