package com.shrek.heroAcademy.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.shrek.heroAcademy.model.Race;

public class RaceDaoImpl extends GenericDaoImpl<Race> implements IRaceDao{

	@Transactional
	public List<Race> getAllRaces() {
		return (List<Race>) findAll();
	}

	@Transactional
	public Race getRace(Long id){
		return (Race) find(id);
	}
	
	@Transactional
	public Race addRace(Race race){
		return (Race)create(race);
	}

	@Transactional
	public Race updateRace(Race race) {
		return (Race) update(race);
	}

	@Transactional
	public void deleteRace(Race race) {
		delete(race.getId());
	}
	
}
