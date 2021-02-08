package com.shrek.heroAcademy.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.shrek.heroAcademy.model.Skill;

public class SkillDaoImpl extends GenericDaoImpl<Skill> implements ISkillDao{
	
	@Transactional
	public List<Skill> getAllSkills() {
		return (List<Skill>) findAll();
	}

	@Transactional
	public Skill getSkill(Long id){
		return (Skill) find(id);
	}
	
	@Transactional
	public Skill addSkill(Skill skill){
		return (Skill)create(skill);
	}

	@Transactional
	public Skill updateSkill(Skill skill) {
		return (Skill) update(skill);
	}

	@Transactional
	public void deleteSkill(Skill skill) {
		delete(skill.getId());
	}

}
