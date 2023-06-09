package com.explore.livescore.dto;

public class TeamScoreDTO {
    private Integer teamScoreId;
    private Double runs;
    private Double runRate;
    private Integer wickets;
    private Integer maidens;
    private Double economy;

    //parametrized constructor
    public TeamScoreDTO(Integer teamScoreId, Double runs, Double runRate, Integer wickets, Integer maidens, Double economy) {
        this.teamScoreId = teamScoreId;
        this.runs = runs;
        this.runRate = runRate;
        this.wickets = wickets;
        this.maidens = maidens;
        this.economy = economy;
    }
    //getters and setters
    public Integer getTeamScoreId() {
        return teamScoreId;
    }
    public void setTeamScoreId(Integer teamScoreId) {
        this.teamScoreId = teamScoreId;
    }
    public Double getRuns() {
        return runs;
    }
    public void setRuns(Double runs) {
        this.runs = runs;
    }
    public Double getRunRate() {
        return runRate;
    }
    public void setRunRate(Double runRate) {
        this.runRate = runRate;
    }
    public Integer getWickets() {
        return wickets;
    }
    public void setWickets(Integer wickets) {
        this.wickets = wickets;
    }
    public Integer getMaidens() {
        return maidens;
    }
    public void setMaidens(Integer maidens) {
        this.maidens = maidens;
    }
    public Double getEconomy() {
        return economy;
    }
    public void setEconomy(Double economy) {
        this.economy = economy;
    }
    
}
