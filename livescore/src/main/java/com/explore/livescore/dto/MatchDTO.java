package com.explore.livescore.dto;

public class MatchDTO {
   private Integer matchId;
   private String matchName;
   private String matchDateTime;
   private String venue;
   private TeamDTO teamOne;
   private TeamDTO teamTwo;
   private MatchStatisticsDTO matchScore;
   
   public MatchDTO(Integer matchId, String matchName, String matchDateTime, String venue, TeamDTO teamOne,
         TeamDTO teamTwo, MatchStatisticsDTO matchScore) {
      this.matchId = matchId;
      this.matchName = matchName;
      this.matchDateTime = matchDateTime;
      this.venue = venue;
      this.teamOne = teamOne;
      this.teamTwo = teamTwo;
      this.matchScore = matchScore;
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
   public TeamDTO getTeamOne() {
      return teamOne;
   }
   public void setTeamOne(TeamDTO teamOne) {
      this.teamOne = teamOne;
   }
   public TeamDTO getTeamTwo() {
      return teamTwo;
   }
   public void setTeamTwo(TeamDTO teamTwo) {
      this.teamTwo = teamTwo;
   }
   public MatchStatisticsDTO getMatchScore() {
      return matchScore;
   }
   public void setMatchScore(MatchStatisticsDTO matchScore) {
      this.matchScore = matchScore;
   }
   
}
