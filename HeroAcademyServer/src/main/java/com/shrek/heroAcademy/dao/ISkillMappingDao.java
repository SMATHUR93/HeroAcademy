package com.shrek.heroAcademy.dao;

import java.util.List;

import com.shrek.heroAcademy.model.SkillMapping;

public interface ISkillMappingDao extends IGenericDao<SkillMapping> {
	
	public List<SkillMapping> getAllSkillMappings();
	
	public SkillMapping getSkillMapping(Long id);
	
	public SkillMapping addSkillMapping(SkillMapping SkillMapping);
	
	public SkillMapping updateSkillMapping(SkillMapping skillMapping);
	
	public void deleteSkillMapping(SkillMapping skillMapping);
	
}
