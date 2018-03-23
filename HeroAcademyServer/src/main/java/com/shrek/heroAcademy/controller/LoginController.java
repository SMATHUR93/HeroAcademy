package com.shrek.heroAcademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shrek.heroAcademy.model.AccessToken;
import com.shrek.heroAcademy.service.AuthenticationServiceImpl;
import com.shrek.heroAcademy.to.LoginTO;
import com.shrek.heroAcademy.web.response.BasicRestResponse;
import com.shrek.heroAcademy.web.response.LoginResponse;

@RestController
@RequestMapping("/academy")
public class LoginController {
	
	@Autowired
	AuthenticationServiceImpl authenticationService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody BasicRestResponse login(@RequestBody LoginTO loginTO) {
		BasicRestResponse restResponse;
		if(authenticationService.authenticate(loginTO)){
			AccessToken accessToken = new AccessToken(loginTO.getUserName(),"abc12345");
			restResponse  = new LoginResponse("Login Successful", true, accessToken);
		} else{
			restResponse = new BasicRestResponse("Invalid Credentials", false);
		}
		return restResponse;
	}
	
}