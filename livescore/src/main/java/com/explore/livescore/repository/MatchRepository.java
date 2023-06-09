package com.explore.livescore.repository;

import org.springframework.data.repository.CrudRepository;

import com.explore.livescore.entity.Match;

public interface MatchRepository extends CrudRepository<Match, Integer> {
    
}
