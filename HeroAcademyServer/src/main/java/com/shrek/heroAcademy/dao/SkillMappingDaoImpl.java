package com.shrek.heroAcademy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shrek.heroAcademy.model.SkillMapping;

@Repository
public class SkillMappingDaoImpl extends GenericDaoImpl<SkillMapping> implements ISkillMappingDao{
	
	@Transactional
	public List<SkillMapping> getAllSkillMappings() {
		return (List<SkillMapping>) findAll();
	}

	@Transactional
	public SkillMapping getSkillMapping(Long id){
		return (SkillMapping) find(id);
	}
	
	@Transactional
	public SkillMapping addSkill(SkillMapping SkillMapping){
		return (SkillMapping)create(SkillMapping);
	}

}
