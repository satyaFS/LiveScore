package com.explore.livescore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MatchStatisitcs {
    @Id
    Integer matchStatsId;
    Double totalOvers;
    Double currentOver;
    TeamScore battinTeamScore;
    TeamScore bowlingTeamScore;
    Double projectedScore;
    Boolean isDLS;
    Double dlsOvers;
    Integer currentBowlerId;
    Integer currentBatsmanId;
    Integer nonStrikerBatsmanId;
}
