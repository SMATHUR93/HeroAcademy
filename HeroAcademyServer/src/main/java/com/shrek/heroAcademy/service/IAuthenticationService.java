package com.shrek.heroAcademy.service;

import com.shrek.heroAcademy.to.LoginTO;

public interface IAuthenticationService {
	
	public Boolean authenticate(LoginTO loginTO);

}
