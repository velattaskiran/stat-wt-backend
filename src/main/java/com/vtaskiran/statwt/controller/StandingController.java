package com.vtaskiran.statwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vtaskiran.statwt.entity.Standing;
import com.vtaskiran.statwt.repository.StandingRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173")
public class StandingController {

    @Autowired
    private StandingRepository standingRepository;

    @GetMapping("/standings")
    public List<Standing> fetchStandingsByLeagueId(@RequestParam("leagueId") Long leagueId) {
        return standingRepository.findByLeagueId(leagueId);
    }

}
