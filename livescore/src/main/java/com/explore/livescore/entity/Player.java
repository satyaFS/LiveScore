package com.explore.livescore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Player {
    @Id
    Integer playerId;
    String name;
    
    @ManyToOne()
    @JoinColumn(name = "team_id")
    Team team;

    @OneToOne
    @JoinColumn(name = "player_statistics_id")
    PlayerStatistics playerStatistics;
}
