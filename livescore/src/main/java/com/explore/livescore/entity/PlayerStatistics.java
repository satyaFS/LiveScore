package com.explore.livescore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PlayerStatistics {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer playerStatisticsId;
     private Integer runs;
     private Integer wickets;
     private Integer ballsFaced;
     private Integer noBallsFaced;
     private Integer fours;
     private Integer sixes;
     private Double strikeRate;
     private Double economy;
     private Integer catches;
     private Integer stumpings;
     private Integer runOuts;
     private Double bowlingAverage;
     private Double bowlingStrikeRate;
     private Double bowlingEconomy;
     private Integer bowlingFours;
     private Integer bowlingSixes;
     private Integer bowlingCatches;
     private Integer bowlingWickets;
     private Integer bowlingNoBalls;
     private Integer fieldingCatches;
     private Integer fieldingRunOuts;

     public PlayerStatistics(Integer playerStatisticsId, Integer runs, Integer wickets, Integer ballsFaced,
               Integer noBallsFaced, Integer fours, Integer sixes, Double strikeRate, Double economy, Integer catches,
               Integer stumpings, Integer runOuts, Double bowlingAverage, Double bowlingStrikeRate,
               Double bowlingEconomy, Integer bowlingFours, Integer bowlingSixes, Integer bowlingCatches,
               Integer bowlingWickets, Integer bowlingNoBalls, Integer fieldingCatches, Integer fieldingRunOuts) {
          this.playerStatisticsId = playerStatisticsId;
          this.runs = runs;
          this.wickets = wickets;
          this.ballsFaced = ballsFaced;
          this.noBallsFaced = noBallsFaced;
          this.fours = fours;
          this.sixes = sixes;
          this.strikeRate = strikeRate;
          this.economy = economy;
          this.catches = catches;
          this.stumpings = stumpings;
          this.runOuts = runOuts;
          this.bowlingAverage = bowlingAverage;
          this.bowlingStrikeRate = bowlingStrikeRate;
          this.bowlingEconomy = bowlingEconomy;
          this.bowlingFours = bowlingFours;
          this.bowlingSixes = bowlingSixes;
          this.bowlingCatches = bowlingCatches;
          this.bowlingWickets = bowlingWickets;
          this.bowlingNoBalls = bowlingNoBalls;
          this.fieldingCatches = fieldingCatches;
          this.fieldingRunOuts = fieldingRunOuts;
     }

     public Integer getPlayerStatisticsId() {
          return playerStatisticsId;
     }

     public void setPlayerStatisticsId(Integer playerStatisticsId) {
          this.playerStatisticsId = playerStatisticsId;
     }

     public Integer getRuns() {
          return runs;
     }

     public void setRuns(Integer runs) {
          this.runs = runs;
     }

     public Integer getWickets() {
          return wickets;
     }

     public void setWickets(Integer wickets) {
          this.wickets = wickets;
     }

     public Integer getBallsFaced() {
          return ballsFaced;
     }

     public void setBallsFaced(Integer ballsFaced) {
          this.ballsFaced = ballsFaced;
     }

     public Integer getNoBallsFaced() {
          return noBallsFaced;
     }

     public void setNoBallsFaced(Integer noBallsFaced) {
          this.noBallsFaced = noBallsFaced;
     }

     public Integer getFours() {
          return fours;
     }

     public void setFours(Integer fours) {
          this.fours = fours;
     }

     public Integer getSixes() {
          return sixes;
     }

     public void setSixes(Integer sixes) {
          this.sixes = sixes;
     }

     public Double getStrikeRate() {
          return strikeRate;
     }

     public void setStrikeRate(Double strikeRate) {
          this.strikeRate = strikeRate;
     }

     public Double getEconomy() {
          return economy;
     }

     public void setEconomy(Double economy) {
          this.economy = economy;
     }

     public Integer getCatches() {
          return catches;
     }

     public void setCatches(Integer catches) {
          this.catches = catches;
     }

     public Integer getStumpings() {
          return stumpings;
     }

     public void setStumpings(Integer stumpings) {
          this.stumpings = stumpings;
     }

     public Integer getRunOuts() {
          return runOuts;
     }

     public void setRunOuts(Integer runOuts) {
          this.runOuts = runOuts;
     }

     public Double getBowlingAverage() {
          return bowlingAverage;
     }

     public void setBowlingAverage(Double bowlingAverage) {
          this.bowlingAverage = bowlingAverage;
     }

     public Double getBowlingStrikeRate() {
          return bowlingStrikeRate;
     }

     public void setBowlingStrikeRate(Double bowlingStrikeRate) {
          this.bowlingStrikeRate = bowlingStrikeRate;
     }

     public Double getBowlingEconomy() {
          return bowlingEconomy;
     }

     public void setBowlingEconomy(Double bowlingEconomy) {
          this.bowlingEconomy = bowlingEconomy;
     }

     public Integer getBowlingFours() {
          return bowlingFours;
     }

     public void setBowlingFours(Integer bowlingFours) {
          this.bowlingFours = bowlingFours;
     }

     public Integer getBowlingSixes() {
          return bowlingSixes;
     }

     public void setBowlingSixes(Integer bowlingSixes) {
          this.bowlingSixes = bowlingSixes;
     }

     public Integer getBowlingCatches() {
          return bowlingCatches;
     }

     public void setBowlingCatches(Integer bowlingCatches) {
          this.bowlingCatches = bowlingCatches;
     }

     public Integer getBowlingWickets() {
          return bowlingWickets;
     }

     public void setBowlingWickets(Integer bowlingWickets) {
          this.bowlingWickets = bowlingWickets;
     }

     public Integer getBowlingNoBalls() {
          return bowlingNoBalls;
     }

     public void setBowlingNoBalls(Integer bowlingNoBalls) {
          this.bowlingNoBalls = bowlingNoBalls;
     }

     public Integer getFieldingCatches() {
          return fieldingCatches;
     }

     public void setFieldingCatches(Integer fieldingCatches) {
          this.fieldingCatches = fieldingCatches;
     }

     public Integer getFieldingRunOuts() {
          return fieldingRunOuts;
     }

     public void setFieldingRunOuts(Integer fieldingRunOuts) {
          this.fieldingRunOuts = fieldingRunOuts;
     }

     
     

}
