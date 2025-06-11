package com.vtaskiran.statwt.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "players")
public class Player {
    @Id
    @Column(name = "player_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "player_name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "number", nullable = false)
    private int number;

    @Column(name = "position", nullable = false)
    private String position;

    @Column(name = "team_id", nullable = false)
    private long teamId;

    @Column(name = "team_name", nullable = false)
    private String teamName;

    @Column(name = "photo_url")
    private String photoUrl;    
}
