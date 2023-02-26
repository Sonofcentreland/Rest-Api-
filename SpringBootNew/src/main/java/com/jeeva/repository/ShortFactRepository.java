package com.jeeva.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jeeva.model.ShortFact;  

public interface ShortFactRepository extends CrudRepository<ShortFact, Integer>
{

	 List<ShortFact> findByDescriptionContainingIgnoreCase(String word);
	 List<ShortFact> findByNameContainingIgnoreCase(String name);
	
}
 