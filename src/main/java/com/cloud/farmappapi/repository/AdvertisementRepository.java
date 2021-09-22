/**
 * 
 */
package com.cloud.farmappapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.farmappapi.entity.Advertisement;

/**
 * @author Sanjeet
 *
 */
@Repository
public interface AdvertisementRepository extends JpaRepository <Advertisement, Long> {
	
	public Advertisement findBytitle(String title);
	public Advertisement findByadvertiseIdentifier(String advertiseIdentifier);
	public Advertisement findByPostedBy(String postedBy);
	public void deleteByadvertiseIdentifier(String advertiseIdentifier);

}
