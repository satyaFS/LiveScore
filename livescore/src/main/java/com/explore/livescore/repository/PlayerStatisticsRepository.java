package com.explore.livescore.repository;

import org.springframework.data.repository.CrudRepository;

import com.explore.livescore.entity.PlayerStatistics;

public interface PlayerStatisticsRepository extends CrudRepository<PlayerStatistics, Integer>{
    
}
