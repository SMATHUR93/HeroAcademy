package com.shrek.heroAcademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shrek.heroAcademy.service.AuthenticationServiceImpl;
import com.shrek.heroAcademy.to.LoginTO;
import com.shrek.heroAcademy.web.response.BasicRestResponse;

@RestController
@RequestMapping("/academy")
public class LoginController {
	
	@Autowired
	AuthenticationServiceImpl authenticationService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody BasicRestResponse login(@RequestBody LoginTO loginTO) {
		BasicRestResponse restResponse;
		if(authenticationService.authenticate(loginTO)){
			restResponse = new BasicRestResponse("Login Successful", true);
		} else{
			restResponse = new BasicRestResponse("Invalid Credentials", false);
		}
		return restResponse;
	}
	
}