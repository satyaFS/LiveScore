package com.explore.livescore.repository;

import org.springframework.data.repository.CrudRepository;

import com.explore.livescore.entity.MatchStatisitcs;

public interface MatchStatisticsRepository extends CrudRepository <MatchStatisitcs, Integer>{
    
}
