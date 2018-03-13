package com.shrek.heroAcademy.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shrek.heroAcademy.dao.IElementDao;
import com.shrek.heroAcademy.dao.IRaceDao;
import com.shrek.heroAcademy.dao.ISkillDao;
import com.shrek.heroAcademy.dao.ISymbolDao;
import com.shrek.heroAcademy.to.AllInformationTO;

@Service
public class AllInformationServiceImpl implements IAllInformationService {

  @Autowired
  private IElementDao elementDao;
  
  @Autowired
  private IRaceDao raceDao;
  
  @Autowired
  private ISymbolDao symbolDao;
  
  @Autowired
  private ISkillDao skillDao;

  @Override
  @Transactional
  public AllInformationTO getAllInformation() {
    AllInformationTO allInformationTO = new AllInformationTO();
    allInformationTO.setElements(elementDao.getAllElements());
    allInformationTO.setRaces(raceDao.getAllRaces());
    allInformationTO.setSymbols(symbolDao.getAllSymbols());
    allInformationTO.setSkills(skillDao.getAllSkills());
	/*Map<String, Object> allInformationTO = new HashMap<String, Object>();
	allInformationTO.put("ELEMENTS", elementDao.getAllElements());
    allInformationTO.put("RACES", raceDao.getAllRaces());
    allInformationTO.put("SYMBOLS", symbolDao.getAllSymbols());
    allInformationTO.put("SKILLS", skillDao.getAllSkills());*/
    return allInformationTO;
  }

}
