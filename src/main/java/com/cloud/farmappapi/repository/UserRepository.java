/**
 * 
 */
package com.cloud.farmappapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.farmappapi.model.User;

/**
 * 
 * The User Repository Which Contains custom Methods for User
 * @author kmahendr
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	public User findByLoginName(String loginName);
	
	
	
}
