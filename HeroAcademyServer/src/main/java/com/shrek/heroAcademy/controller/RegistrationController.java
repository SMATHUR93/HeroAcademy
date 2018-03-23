package com.shrek.heroAcademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shrek.heroAcademy.dao.UserDaoImpl;
import com.shrek.heroAcademy.model.AccessToken;
import com.shrek.heroAcademy.model.User;
import com.shrek.heroAcademy.web.response.BasicRestResponse;

@RestController
@RequestMapping("/academy")
public class RegistrationController {

	@Autowired
	UserDaoImpl userDao;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public @ResponseBody BasicRestResponse register(@RequestBody User user) {
		BasicRestResponse restResponse;
		User createdUser = userDao.create(user);
		if(createdUser!=null){
			restResponse = new BasicRestResponse("Registration Successful", true);			
		} else{
			restResponse = new BasicRestResponse("Registration Failed", false);
		}
		return restResponse;
	}
	
}
