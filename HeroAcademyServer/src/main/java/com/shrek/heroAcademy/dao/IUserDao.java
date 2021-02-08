package com.shrek.heroAcademy.dao;

import java.util.List;

import com.shrek.heroAcademy.model.User;

public interface IUserDao extends IGenericDao<User>  {
	
	public List<User> getAllUsers();
	
	public User getUser(Long id);
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(User user);
	
}
