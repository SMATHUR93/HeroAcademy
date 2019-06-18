package com.shrek.heroAcademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shrek.heroAcademy.model.SkillMapping;
import com.shrek.heroAcademy.model.User;
import com.shrek.heroAcademy.service.AllInformationServiceImpl;
import com.shrek.heroAcademy.to.AllInformationTO;
@RestController
@RequestMapping("/academy")
public class AllInformationController {
	
	@Autowired
	AllInformationServiceImpl allInformationService;
	
	@RequestMapping(value = "/allInformation", method = RequestMethod.GET)
	public AllInformationTO getAllInformation() {
		return allInformationService.getAllInformation();
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public User getEmployee(@RequestParam String userId) {
		long id = Long.parseLong(userId);
		return allInformationService.getUserInformation(id);
	}
	
	@RequestMapping(value = "/skills", method = RequestMethod.GET)
	public List<SkillMapping> getSkills() {
		return allInformationService.getSkillMappingData();
	}
}
