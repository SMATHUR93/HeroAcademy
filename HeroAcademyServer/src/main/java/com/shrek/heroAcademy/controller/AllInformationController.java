package com.shrek.heroAcademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shrek.heroAcademy.to.AllInformationTO;
//import com.cognizant.billing.model.Employee;
import com.shrek.heroAcademy.service.AllInformationServiceImpl;

@RestController
@RequestMapping("/allInformation")
public class AllInformationController {

  @Autowired
  AllInformationServiceImpl allInformationService;

  @RequestMapping(method = RequestMethod.GET)
  public AllInformationTO getEmployee() {
    return allInformationService.getAllInformation();
  }

}