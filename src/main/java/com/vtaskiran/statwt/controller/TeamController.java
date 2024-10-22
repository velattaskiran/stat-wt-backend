package com.vtaskiran.statwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtaskiran.statwt.entity.Team;
import com.vtaskiran.statwt.repository.TeamRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173")
public class TeamController {
    
    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/teams")
    public List<Team> fetchLeagues(){
        System.out.println(teamRepository.findAll());
        return teamRepository.findAll();
    }

}
