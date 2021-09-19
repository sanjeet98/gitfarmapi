/**
 * 
 */
package com.cloud.farmappapi.exception;

/**
 * @author Sanjeet
 *
 */
public class InvalidIdExceptionResponse {
	private String title;

	/**
	 * @param title
	 */
	public InvalidIdExceptionResponse(String title) {
		super();
		this.title = title;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
}
