package com.explore.livescore.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Team {
    @Id
    Integer teamId;
    String teamName;
    
    @OneToMany(mappedBy = "team")
    List<Player> players;

    @OneToOne
    @JoinColumn(name = "team_score_id")
    TeamScore teamScore;
}
