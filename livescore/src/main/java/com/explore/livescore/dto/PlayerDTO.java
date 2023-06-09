package com.explore.livescore.dto;

public class PlayerDTO {
   private Integer playerId;
   private String name;
   private TeamDTO team;
   private PlayerStatisticsDTO playerStatistics;

   public PlayerDTO(Integer playerId, String name, TeamDTO team, PlayerStatisticsDTO playerStatistics) {
      this.playerId = playerId;
      this.name = name;
      this.team = team;
      this.playerStatistics = playerStatistics;
   }

   public Integer getPlayerId() {
      return playerId;
   }

   public void setPlayerId(Integer playerId) {
      this.playerId = playerId;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public TeamDTO getTeam() {
      return team;
   }

   public void setTeam(TeamDTO team) {
      this.team = team;
   }

   public PlayerStatisticsDTO getPlayerStatistics() {
      return playerStatistics;
   }

   public void setPlayerStatistics(PlayerStatisticsDTO playerStatistics) {
      this.playerStatistics = playerStatistics;
   }

   
}

