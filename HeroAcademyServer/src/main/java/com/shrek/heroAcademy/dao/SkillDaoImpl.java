package com.shrek.heroAcademy.dao;

import java.util.List;

import com.shrek.heroAcademy.model.Skill;

public class SkillDaoImpl extends GenericDaoImpl<Skill> implements ISkillDao{
	
	public List<Skill> getAllSkills() {
		return (List<Skill>) findAll();
	}

	public Skill getSkill(Long id){
		return (Skill) find(id);
	}
	
	public Skill addSkill(Skill skill){
		return (Skill)create(skill);
	}

}
