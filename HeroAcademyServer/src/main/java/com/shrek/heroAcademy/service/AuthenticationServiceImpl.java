package com.shrek.heroAcademy.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.shrek.heroAcademy.dao.UserDaoImpl;
import com.shrek.heroAcademy.to.LoginTO;

public class AuthenticationServiceImpl implements IAuthenticationService{

	@Autowired
	UserDaoImpl userDao;
	
	@Override
	public Boolean authenticate(LoginTO loginTO) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("userName", loginTO.getUserName());
		parameters.put("password", loginTO.getPassword());
		Boolean isLoginSuccesssful = false;
		if(userDao.findByParameters(parameters)!=null){
			isLoginSuccesssful = true;
		}
		return isLoginSuccesssful;
	}
	
}
