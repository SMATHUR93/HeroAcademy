package com.shrek.heroAcademy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shrek.heroAcademy.dao.IElementDao;
import com.shrek.heroAcademy.to.AllInformationTO;

@Service
public class AllInformationServiceImpl implements IAllInformationService {

  @Autowired
  private IElementDao elementDao;

  /*@Autowired
  private LocationDao locationDao;

  @Autowired
  private AccountDao accountDao;*/

  @Override
  @Transactional
  public AllInformationTO getAllInformation() {
    AllInformationTO allInformationTO = new AllInformationTO();
    allInformationTO.setElements(elementDao.getAllElements());
    /*allInformationTO.setLocations(locationDao.getAllLocations());
    allInformationTO.setAccounts(accountDao.getAllProjects());*/
    return allInformationTO;
  }

}
