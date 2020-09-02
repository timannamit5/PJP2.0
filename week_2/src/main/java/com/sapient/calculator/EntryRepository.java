package com.sapient.calculator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

	@Repository
	public interface EntryRepository extends JpaRepository<entry, Long>
	{
		
	}


