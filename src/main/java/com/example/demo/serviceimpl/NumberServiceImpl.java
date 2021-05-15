package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.demo.dao.NumberRepo;
import com.example.demo.service.NumberService;

/**
 * Implementation of Number Service.
 * 
 * @author Anant Jain
 *
 */
@Service
public class NumberServiceImpl implements NumberService {
	@Autowired
	NumberRepo numRepo;

	/**
	 * To increase the number by 1.
	 */
	@Override
	@Async
	public void increaseNum() {
		numRepo.increaseNum();
	}

}
