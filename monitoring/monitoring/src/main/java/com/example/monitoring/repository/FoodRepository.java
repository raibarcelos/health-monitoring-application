package com.example.monitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.monitoring.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}

