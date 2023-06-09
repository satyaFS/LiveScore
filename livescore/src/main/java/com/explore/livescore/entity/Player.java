package com.explore.livescore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer playerId;
    private String name;
    
    @ManyToOne()
    @JoinColumn(name = "team_id")
    private Team team;

    @OneToOne
    @JoinColumn(name = "player_statistics_id")
    private PlayerStatistics playerStatistics;

    public Player(Integer playerId, String name, Team team, PlayerStatistics playerStatistics) {
        this.playerId = playerId;
        this.name = name;
        this.team = team;
        this.playerStatistics = playerStatistics;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public PlayerStatistics getPlayerStatistics() {
        return playerStatistics;
    }

    public void setPlayerStatistics(PlayerStatistics playerStatistics) {
        this.playerStatistics = playerStatistics;
    }

        
}
