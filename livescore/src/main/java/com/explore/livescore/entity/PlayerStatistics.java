package com.explore.livescore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PlayerStatistics {
     @Id
     Integer playerStatisticsId;
     Integer runs;
     Integer wickets;
     Integer ballsFaced;
     Integer noBallsFaced;
     Integer fours;
     Integer sixes;
     Double strikeRate;
     Double economy;
     Integer catches;
     Integer stumpings;
     Integer runOuts;
     Double bowlingAverage;
     Double bowlingStrikeRate;
     Double bowlingEconomy;
     Integer bowlingFours;
     Integer bowlingSixes;
     Integer bowlingCatches;
     Integer bowlingWickets;
     Integer bowlingNoBalls;
     Integer fieldingCatches;
     Integer fieldingRunOuts;
}
