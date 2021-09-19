package com.cloud.farmappapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * @author Sanjeet
 *
 */
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class FarmappapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmappapiApplication.class, args);
	}
}