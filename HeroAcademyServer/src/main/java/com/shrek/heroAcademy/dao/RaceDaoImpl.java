package com.shrek.heroAcademy.dao;

import java.util.List;

import com.shrek.heroAcademy.model.Race;

public class RaceDaoImpl extends GenericDaoImpl<Race> implements IRaceDao{

	public List<Race> getAllRaces() {
		return (List<Race>) findAll();
	}

	public Race getRace(Long id){
		return (Race) find(id);
	}
	
	public Race addRace(Race race){
		return (Race)create(race);
	}
	
}
