package com.abhi.main.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.main.entity.Team;

public interface TeamRespository extends JpaRepository<Team, Long> {

}
