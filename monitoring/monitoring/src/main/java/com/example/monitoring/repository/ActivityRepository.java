package com.example.monitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.monitoring.model.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}

