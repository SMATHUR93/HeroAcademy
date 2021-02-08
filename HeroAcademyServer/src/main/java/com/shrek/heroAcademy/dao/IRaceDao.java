package com.shrek.heroAcademy.dao;

import java.util.List;

import com.shrek.heroAcademy.model.Race;

public interface IRaceDao extends IGenericDao<Race> {
	
	public List<Race> getAllRaces();
	
	public Race getRace(Long id);
	
	public Race addRace(Race race);
	
	public Race updateRace(Race race);
	
	public void deleteRace(Race race);
	
	
}
