package com.example.animal.repo;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.animal.model.animal;

public interface animalrepo extends CrudRepository<animal, Integer>  {
	@Query(value = "SELECT b FROM animal b ORDER BY AnimalName")
    public List<animal> findAllSortedByNameR();
	
	

}
