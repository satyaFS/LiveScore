package com.explore.livescore.repository;

import org.springframework.data.repository.CrudRepository;

import com.explore.livescore.entity.Team;

public interface TeamRepository extends CrudRepository<Team, Integer> {
    
}
