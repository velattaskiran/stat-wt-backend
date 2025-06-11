package com.vtaskiran.statwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vtaskiran.statwt.entity.Standing;

public interface StandingRepository extends JpaRepository<Standing, Long> {
    List<Standing> findByLeagueId(Long leagueId);
}
