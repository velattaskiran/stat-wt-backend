package com.vtaskiran.statwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vtaskiran.statwt.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
