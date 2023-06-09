package com.explore.livescore.service;

import java.util.List;

import com.explore.livescore.dto.MatchDTO;
import com.explore.livescore.entity.Match;

public interface MatchService {
    /*
     * user fetches list of matches
     * user creates a match by providing basic details and both teams details. (MatchDTO)
     * user updates a match as required by passing updated. (MatchDTO)
     * user deletes a match. (MatchDTO)
     */
    void addMatch(MatchDTO matchDTO);
    void updateMatch(MatchDTO matchDTO);
    void deleteMatch(MatchDTO matchDTO);
    MatchDTO getMatch(MatchDTO matchDTO);
    List<Match> getAllMatches();
    void deleteMatches(List<Integer> matchIds);
}
