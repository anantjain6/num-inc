package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.NumberService;

/**
 * Rest Controller with endpoint to increase number.
 *
 * @author Anant Jain
 */
@RestController
public class NIncrementController {
	@Autowired
	NumberService numService;
	
	/**
	 * API Endpoint to increase number.
	 * 
	 * Returns one of the following status code:
	 * 200: Success
	 * 500: Exception Occurred
	 * 
	 * @return Message with status code 
	 */
	@GetMapping("/increase")
	ResponseEntity<String> incrementNumber() {
		try {
			numService.increaseNum();
			return new ResponseEntity<String>("Success", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
