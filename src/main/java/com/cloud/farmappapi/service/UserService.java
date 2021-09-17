package com.cloud.farmappapi.service;

import java.util.List;

import com.cloud.farmappapi.model.User;

public interface UserService  {
	
	
	public User saveUser(User user);
	
	public User findByLoginName(String loginName);
	
	public List<User> findAll();
	
	


}
