/**
 * 
 */
package com.cloud.farmappapi.service;

import java.util.List;

import com.cloud.farmappapi.entity.Advertisement;

/**
 * @author Sanjeet
 *
 */
public interface AdvertisementService {

	public Advertisement saveAdvertisement(Advertisement Advertisement);
	public Advertisement findBytitle(String title);
	public Advertisement findByadvertiseIdentifier(String advertiseIdentifier);
	public Advertisement findByPostedBy(String PostedBy);
	
	public List<Advertisement> findAll();
}
