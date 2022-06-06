package com.github.godzillajim.awsgithubcicd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.godzillajim.awsgithubcicd.payloads.HealthStatus;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public HealthStatus getHealthStatus(){
        return new HealthStatus();
    }
}
