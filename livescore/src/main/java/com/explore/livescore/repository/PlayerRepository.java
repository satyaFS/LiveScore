package com.explore.livescore.repository;

import org.springframework.data.repository.CrudRepository;

import com.explore.livescore.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {
    
}
