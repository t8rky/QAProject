package com.example.animal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.animal.*;
import com.example.animal.exceptions.AnimalNotFoundID;
import com.example.animal.model.animal;
import com.example.animal.repo.animalrepo;

@Service
public class Animalservice {

	@Autowired
	animalrepo animalsRepository;
	//getting all animal record by using the method findaAll() of CrudRepository
	public List<animal> getAllAnimals()
	{
	List<animal> animals1 = new ArrayList<>();
	animalsRepository.findAll().forEach(animals2 -> animals1.add(animals2));
	return animals1;
	}
	//getting a specific record by using the method findById() of CrudRepository
    public Optional<animal> getAnimalById(int id)   
    {  
        //animal found = this.animalsRepository.findById(id).orElseThrow(AnimalNotFoundID::new);
        return animalsRepository.findById(id);
    }
	//saving a specific record by using the method save() of CrudRepository
	public animal saveOrUpdate(animal animals1)
	{
	return animalsRepository.save(animals1);
	}
	//deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id)
	{
	animalsRepository.deleteById(id);
	}
	//updating a record
	public void update(animal animals1, int animalTag)
	{
	animalsRepository.save(animals1);
	}
	
	//CustomQuery Sorted Grouping
		public List<animal> findAllSortedByNameS()   
		{  
		//List<animal> animals1 = new ArrayList<animal>(); 
		return animalsRepository.findAllSortedByNameR();	
		}
		
//		

}
