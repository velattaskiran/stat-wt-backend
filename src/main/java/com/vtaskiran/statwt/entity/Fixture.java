package com.vtaskiran.statwt.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "fixtures")
public class Fixture {
    @Id
    @Column(name = "fixture_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "home_team_id", nullable = false)
    private long homeTeamId;

    @Column(name = "away_team_id", nullable = false)
    private long awayTeamId;

    @Column(name = "home_team_name", nullable = false)
    private String homeTeamName;

    @Column(name = "away_team_name", nullable = false)
    private String awayTeamName;

    @Column(name = "date_time", nullable = false)
    private String dateTime;

    @Column(name = "stadium", nullable = false)
    private String stadium;
}
