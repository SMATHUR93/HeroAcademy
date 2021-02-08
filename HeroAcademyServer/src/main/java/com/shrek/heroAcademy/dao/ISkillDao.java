package com.shrek.heroAcademy.dao;

import java.util.List;

import com.shrek.heroAcademy.model.Skill;

public interface ISkillDao extends IGenericDao<Skill> {
	
	public List<Skill> getAllSkills();
	
	public Skill getSkill(Long id);
	
	public Skill addSkill(Skill skill);
	
	public Skill updateSkill(Skill skill);
	
	public void deleteSkill(Skill skill);
	
}
