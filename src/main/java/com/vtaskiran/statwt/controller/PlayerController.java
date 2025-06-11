package com.vtaskiran.statwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtaskiran.statwt.entity.Player;
import com.vtaskiran.statwt.repository.PlayerRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/players")
    public List<Player> fetchPlayers() {
        System.out.println(playerRepository.findAll());
        return playerRepository.findAll();
    }
}
