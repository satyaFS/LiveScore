package com.explore.livescore.entity;

import jakarta.persistence.Id;

public class TeamScore {
    @Id
    Integer teamScoreId;
    Double runs;
    Double runRate;
    Integer wickets;
    Integer maidens;
    Double economy;
}
