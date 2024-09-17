package com.example.monitoring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.monitoring.model.Sleep;
import com.example.monitoring.service.SleepService;

import java.util.List;

@RestController
@RequestMapping("/api/sleeps")
public class SleepController {
    @Autowired
    private SleepService sleepService;

    @GetMapping
    public List<Sleep> getAllSleeps() {
        return sleepService.getAllSleeps();
    }

    @GetMapping("/{id}")
    public Sleep getSleepById(@PathVariable Long id) {
        return sleepService.getSleepById(id);
    }

    @PostMapping
    public Sleep createSleep(@RequestBody Sleep sleep) {
        return sleepService.saveSleep(sleep);
    }

    @PutMapping("/{id}")
    public Sleep updateSleep(@PathVariable Long id, @RequestBody Sleep sleep) {
        sleep.setId(id);
        return sleepService.saveSleep(sleep);
    }

    @DeleteMapping("/{id}")
    public void deleteSleep(@PathVariable Long id) {
        sleepService.deleteSleep(id);
    }
}
