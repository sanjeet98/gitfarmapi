/**
 * 
 */
package com.cloud.farmappapi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.farmappapi.entity.Advertisement;
import com.cloud.farmappapi.exception.AdvertisementAlreadyExistException;
import com.cloud.farmappapi.service.AdvertisementService;
import com.cloud.farmappapi.service.MapValidationErrorService;

/**
 * @author Sanjeet
 * 
 */
@RestController
@RequestMapping("/api/user/advertisement")
public class AdvertisementController {
	
	@Autowired
	private AdvertisementService advertisementService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("/create")
	public ResponseEntity<?> createNewDeveloper(@RequestBody Advertisement advertisement, BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if (errorMap != null)
			return errorMap;
		
		try {
			Advertisement savedAdvertisement = advertisementService.saveAdvertisement(advertisement);
			return new ResponseEntity<Advertisement>(savedAdvertisement, HttpStatus.CREATED);
		} catch (Exception e) {
			throw new AdvertisementAlreadyExistException("Advertisement Already exists! Please Add New Advertisement");
		}	
	}
	
	@GetMapping("/{title}")
	public ResponseEntity<?> findAdvertisementByTitle(@PathVariable String title,HttpSession session) 
	{
		//if (session.getAttribute("Role") != null && session.getAttribute("userType").equals("Client"))
		//{
		
		Advertisement foundAdvertisement=advertisementService.findBytitle(title);
		
		return new ResponseEntity<Advertisement>(foundAdvertisement, HttpStatus.OK);
		//}
		//return new ResponseEntity<String>("You do not have Access!!!", HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllAdvertisements()
	{
		List<Advertisement> advertisements = advertisementService.findAll();
		return new ResponseEntity<List<Advertisement>>(advertisements, HttpStatus.OK);
	}
}
