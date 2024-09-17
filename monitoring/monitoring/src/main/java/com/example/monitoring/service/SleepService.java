package com.example.monitoring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.monitoring.model.Sleep;
import com.example.monitoring.repository.SleepRepository;

import java.util.List;

@Service
public class SleepService {
    @Autowired
    private SleepRepository sleepRepository;

    public List<Sleep> getAllSleeps() {
        return sleepRepository.findAll();
    }

    public Sleep getSleepById(Long id) {
        return sleepRepository.findById(id).orElse(null);
    }

    public Sleep saveSleep(Sleep sleep) {
        return sleepRepository.save(sleep);
    }

    public void deleteSleep(Long id) {
        sleepRepository.deleteById(id);
    }
}
