/**
 * 
 */
package com.cloud.farmappapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.farmappapi.entity.Advertisement;
import com.cloud.farmappapi.exception.AdvertisementAlreadyExistException;
import com.cloud.farmappapi.exception.AdvertisementNotFoundException;
import com.cloud.farmappapi.repository.AdvertisementRepository;

/**
 * @author Sanjeet
 *
 */
@Service
public class AdvertisementServiceImpl implements AdvertisementService {
	
	@Autowired
	private AdvertisementRepository advertisementRepository;

	@Override
	public Advertisement saveAdvertisement(Advertisement Advertisement) {
		// TODO Auto-generated method stub
		if (Advertisement.getTitle() == null) {
			throw new NullPointerException("Please Enter All Values in the field");
		}
		
		if ((advertisementRepository.findBytitle(Advertisement.getTitle())) != null) {
			
			throw new AdvertisementAlreadyExistException("Advertisement already exists");
		} 
		return advertisementRepository.save(Advertisement);
		
	}
	
	@Override
	public Advertisement findBytitle(String title) {
		if (title == null) {
			
			throw new NullPointerException("Please Provide Title");
		}
		
		if ((advertisementRepository.findBytitle(title)) == null) {
			
			throw new AdvertisementNotFoundException("User with title : " + title + " does not exists");
		}
		return advertisementRepository.findBytitle(title);
		
	}

	@Override
	public Advertisement findByadvertiseIdentifier(String advertiseIdentifier) {
		if (advertiseIdentifier == null) {
			
			throw new NullPointerException("Please Provide Advertise Id");
		}
		
		if ((advertisementRepository.findByadvertiseIdentifier(advertiseIdentifier)) == null) {
			
			throw new AdvertisementNotFoundException("User with Advertise Id : " + advertiseIdentifier + " does not exists");
		}
		return advertisementRepository.findByadvertiseIdentifier(advertiseIdentifier);
		
	}

	@Override
	public Advertisement findByPostedBy(String PostedBy) {
		@SuppressWarnings("unused")
		Advertisement advertisement=null;
		if (PostedBy == null) {
			
			throw new NullPointerException("Please Provide Post");
		}
		
		if ((advertisement = advertisementRepository.findByPostedBy(PostedBy)) == null) {
			
			throw new AdvertisementNotFoundException("Advertisement with PostedBy : " + PostedBy + " does not exists");
		}
		return advertisementRepository.findByPostedBy(PostedBy);
		
	}

	@Override
	public List<Advertisement> findAll() {
		try {
			
			return advertisementRepository.findAll();
		} catch (Exception e) {
			
			throw new AdvertisementNotFoundException("No Advertisement Found");
		}
	}
}
