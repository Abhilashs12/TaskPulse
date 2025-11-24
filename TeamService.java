package com.abhi.main.service;

import org.springframework.stereotype.Service;

import com.abhi.main.entity.Team;
import com.abhi.main.respository.TeamRespository;

@Service
public class TeamService {

    private final TeamRespository  teamRepository;

    public TeamService(TeamRespository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    public Team getTeam(Long id) {
        return teamRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Team not found"));
    }
}
