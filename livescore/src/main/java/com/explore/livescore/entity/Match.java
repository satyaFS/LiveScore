package com.explore.livescore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matchId;
    private String matchName;
    private String matchDateTime;
    private String venue;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team teamOne;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team teamTwo;

    @OneToOne
    @JoinColumn(name = "match_stats_id")
    private MatchStatisitcs matchStatisitcs;

    

    public Match(Integer matchId, String matchName, String matchDateTime, String venue, Team teamOne, Team teamTwo,
            MatchStatisitcs matchStatisitcs) {
        this.matchId = matchId;
        this.matchName = matchName;
        this.matchDateTime = matchDateTime;
        this.venue = venue;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.matchStatisitcs = matchStatisitcs;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getMatchDateTime() {
        return matchDateTime;
    }

    public void setMatchDateTime(String matchDateTime) {
        this.matchDateTime = matchDateTime;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Team getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(Team teamOne) {
        this.teamOne = teamOne;
    }

    public Team getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(Team teamTwo) {
        this.teamTwo = teamTwo;
    }

    public MatchStatisitcs getMatchStatisitcs() {
        return matchStatisitcs;
    }

    public void setMatchStatisitcs(MatchStatisitcs matchStatisitcs) {
        this.matchStatisitcs = matchStatisitcs;
    }

    
}
