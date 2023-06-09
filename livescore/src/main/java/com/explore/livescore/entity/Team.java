package com.explore.livescore.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teamId;
    private String teamName;
    
    @OneToMany(mappedBy = "team")
    private List<Player> players;

    @OneToOne
    @JoinColumn(name = "team_score_id")
    private TeamScore teamScore;

    public Team(Integer teamId, String teamName, List<Player> players, TeamScore teamScore) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.players = players;
        this.teamScore = teamScore;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public TeamScore getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(TeamScore teamScore) {
        this.teamScore = teamScore;
    }

    
}
