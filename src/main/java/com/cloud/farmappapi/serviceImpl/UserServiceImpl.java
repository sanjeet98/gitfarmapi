package com.cloud.farmappapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.farmappapi.exception.UserNotFoundException;
import com.cloud.farmappapi.model.User;
import com.cloud.farmappapi.repository.UserRepository;
import com.cloud.farmappapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		if (user.getUserName() == null || user.getLoginName() == null || user.getPwd() == null) {
			throw new NullPointerException("Please Enter All Values in the field");
		}
		
		return userRepo.save(user);
	}



	@Override
	public User findByLoginName(String loginName) {
		// TODO add findbyname logic
		try {
			
			return userRepo.findByLoginName(loginName);
		} catch (Exception e) {
			
			throw new UserNotFoundException("User with loginName : " + loginName + " does not exist");
		}
	}



	/**
	 *
	 */
	@Override
	public List<User> findAll() {
		// TODO add findall user logic
		try {
			
			return userRepo.findAll();
		} catch (Exception e) {
			
			throw new UserNotFoundException("No User Found");
		}
	}




}
