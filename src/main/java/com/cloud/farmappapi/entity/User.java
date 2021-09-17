/**
 * 
 */
package com.cloud.farmappapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * @author kmahendr
 *
 */
@Entity
@Table(name="users")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="usernames")
	private String userName;
	
	
	@Column(name="loginnames",unique = true, updatable = false)
	private String loginName;
	
	
	@Column(name="passwords")
	private String pwd;
	
	
	/**
	 * This is Role of User 
	 * example Admin,Farmer,Dealer
	 */
	@Column(name="roles")
	private String Role;

	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userName
	 * @param loginName
	 * @param pwd
	 * @param role
	 */
	public User(String userName, String loginName, String pwd, String role) {
		super();
		this.userName = userName;
		this.loginName = loginName;
		this.pwd = pwd;
		Role = role;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @param loginName the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return Role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		Role = role;
	}

	
}

