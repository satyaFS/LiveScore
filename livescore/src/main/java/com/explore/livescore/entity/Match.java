package com.explore.livescore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Match {
    @Id
    Integer matchId;
    String matchName;
    String matchDateTime;
    String venue;
    @ManyToOne
    @JoinColumn(name = "team_id")
    Team teamOne;
    @ManyToOne
    @JoinColumn(name = "team_id")
    Team teamTwo;
    @OneToOne
    @JoinColumn(name = "match_stats_id")
    MatchStatisitcs matchStatisitcs;
}
