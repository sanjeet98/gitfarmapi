package com.cloud.farmappapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class UserAlreadyExistException extends RuntimeException {
	
	private static final long serialVErsionUID =1L;

	/**
	 * Create UserAlreadyExistException without Error message
	 */
	public UserAlreadyExistException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * UserAlreadyExistException with error messages
	 * @param message
	 */
	public UserAlreadyExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	

}
