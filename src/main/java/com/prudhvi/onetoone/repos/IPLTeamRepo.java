package com.prudhvi.onetoone.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prudhvi.onetoone.model.IPLTeam;

public interface IPLTeamRepo extends JpaRepository<IPLTeam, Integer>{

}
