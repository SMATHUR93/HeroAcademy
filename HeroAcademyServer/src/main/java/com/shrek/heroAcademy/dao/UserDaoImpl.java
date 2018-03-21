package com.shrek.heroAcademy.dao;

import java.util.List;

import com.shrek.heroAcademy.model.User;

public class UserDaoImpl extends GenericDaoImpl<User>  implements IUserDao{

	@Override
	public List<User> getAllUsers() {
		return (List<User>) findAll();
	}

	@Override
	public User getUser(Long id) {
		return (User) find(id);
	}

	@Override
	public User addSkill(User user) {
		return (User)create(user);
	}

}
