package com.explore.livescore.dto;

import java.util.List;

public class TeamDTO {
   private Integer teamId;
   private String teamName;
   private List<PlayerDTO> players;
   private TeamScoreDTO teamScore;

   public TeamDTO(Integer teamId, String teamName, List<PlayerDTO> players, TeamScoreDTO teamScore) {
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
   public List<PlayerDTO> getPlayers() {
      return players;
   }
   public void setPlayers(List<PlayerDTO> players) {
      this.players = players;
   }
   public TeamScoreDTO getTeamScore() {
      return teamScore;
   }
   public void setTeamScore(TeamScoreDTO teamScore) {
      this.teamScore = teamScore;
   }

   
}
