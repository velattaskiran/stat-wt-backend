package com.vtaskiran.statwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtaskiran.statwt.entity.League;
import com.vtaskiran.statwt.repository.LeagueRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173")
public class LeagueController {
    
    @Autowired
    private LeagueRepository leagueRepository;

    @GetMapping("/leagues")
    public List<League> fetchLeagues(){
        System.out.println(leagueRepository.findAll());
        return leagueRepository.findAll();
    }

}
