package com.explore.livescore.dto;

public class MatchStatisticsDTO {
   private Integer matchStatsId;
   private Double totalOvers;
   private Double currentOver;
   private TeamScoreDTO battinTeamScore;
   private TeamScoreDTO bowlingTeamScore;
   private Double projectedScore;
   private Boolean isDLS;
   private Double dlsOvers;
   private Integer currentBowlerId;
   private Integer currentBatsmanId;
   private Integer nonStrikerBatsmanId;

   public MatchStatisticsDTO(Integer matchStatsId, Double totalOvers, Double currentOver, TeamScoreDTO battinTeamScore,
         TeamScoreDTO bowlingTeamScore, Double projectedScore, Boolean isDLS, Double dlsOvers, Integer currentBowlerId,
         Integer currentBatsmanId, Integer nonStrikerBatsmanId) {
      this.matchStatsId = matchStatsId;
      this.totalOvers = totalOvers;
      this.currentOver = currentOver;
      this.battinTeamScore = battinTeamScore;
      this.bowlingTeamScore = bowlingTeamScore;
      this.projectedScore = projectedScore;
      this.isDLS = isDLS;
      this.dlsOvers = dlsOvers;
      this.currentBowlerId = currentBowlerId;
      this.currentBatsmanId = currentBatsmanId;
      this.nonStrikerBatsmanId = nonStrikerBatsmanId;
   }

   public Integer getMatchStatsId() {
      return matchStatsId;
   }

   public void setMatchStatsId(Integer matchStatsId) {
      this.matchStatsId = matchStatsId;
   }

   public Double getTotalOvers() {
      return totalOvers;
   }

   public void setTotalOvers(Double totalOvers) {
      this.totalOvers = totalOvers;
   }

   public Double getCurrentOver() {
      return currentOver;
   }

   public void setCurrentOver(Double currentOver) {
      this.currentOver = currentOver;
   }

   public TeamScoreDTO getBattinTeamScore() {
      return battinTeamScore;
   }

   public void setBattinTeamScore(TeamScoreDTO battinTeamScore) {
      this.battinTeamScore = battinTeamScore;
   }

   public TeamScoreDTO getBowlingTeamScore() {
      return bowlingTeamScore;
   }

   public void setBowlingTeamScore(TeamScoreDTO bowlingTeamScore) {
      this.bowlingTeamScore = bowlingTeamScore;
   }

   public Double getProjectedScore() {
      return projectedScore;
   }

   public void setProjectedScore(Double projectedScore) {
      this.projectedScore = projectedScore;
   }

   public Boolean getIsDLS() {
      return isDLS;
   }

   public void setIsDLS(Boolean isDLS) {
      this.isDLS = isDLS;
   }

   public Double getDlsOvers() {
      return dlsOvers;
   }

   public void setDlsOvers(Double dlsOvers) {
      this.dlsOvers = dlsOvers;
   }

   public Integer getCurrentBowlerId() {
      return currentBowlerId;
   }

   public void setCurrentBowlerId(Integer currentBowlerId) {
      this.currentBowlerId = currentBowlerId;
   }

   public Integer getCurrentBatsmanId() {
      return currentBatsmanId;
   }

   public void setCurrentBatsmanId(Integer currentBatsmanId) {
      this.currentBatsmanId = currentBatsmanId;
   }

   public Integer getNonStrikerBatsmanId() {
      return nonStrikerBatsmanId;
   }

   public void setNonStrikerBatsmanId(Integer nonStrikerBatsmanId) {
      this.nonStrikerBatsmanId = nonStrikerBatsmanId;
   }

   
   
}
