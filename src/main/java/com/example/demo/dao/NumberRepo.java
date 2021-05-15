package com.example.demo.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Repository class for <code>Number</code> domain objects.
 *
 * @author Anant Jain
 */
@Repository
public interface NumberRepo extends JpaRepository<com.example.demo.model.Number, Integer> {
	/**
	 * To increase the number by 1.
	 */
	@Transactional
	@Modifying
	@Query("UPDATE Number SET num = num + 1")
	void increaseNum();
}
