package com.explore.livescore.repository;

import org.springframework.data.repository.CrudRepository;

import com.explore.livescore.entity.TeamScore;

public interface TeamScoreRepository extends CrudRepository<TeamScore, Integer>{
    
}
