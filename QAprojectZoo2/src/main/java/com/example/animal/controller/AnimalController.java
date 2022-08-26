package com.example.animal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.animal.model.animal;
import com.example.animal.service.Animalservice;

@RestController
public class AnimalController {

	//auto-wire the AnimalsService class
		@Autowired
		Animalservice animalsService;

		@GetMapping("/")
		public String greeting() { return "Welcome Student. Please go to \"/allanimals\" for all available animal";}
		//creating a get mapping that retrieves all the animal detail from the database
		@GetMapping("/allanimals")
		private List<animal> getAllAnimals()
		{
		return animalsService.getAllAnimals();
		}
		//creating a get mapping that retrieves the detail of a specific animal
		@GetMapping("/animal/{animalTag}")
		private  Optional<animal> getAnimals(@PathVariable("animalTag") int animalTag)
		{
		 
		return animalsService.getAnimalById(animalTag);
		}
		//creating a delete mapping that deletes a specified animal
		@DeleteMapping("/delete/{animalTag}")
		private void deleteAnimal(@PathVariable("animalTag") int animalTag)
		{
		animalsService.delete(animalTag);
		}
		//creating post mapping that post the animal detail in the database  
		@PostMapping("/saveorupdateAnimal")  
		private ResponseEntity<animal> saveAnimal(@RequestBody animal animals1)   
		{  
			return new ResponseEntity<>(this.animalsService.saveOrUpdate(animals1), HttpStatus.CREATED);
		}  
		//creating put mapping that updates the animal detail
		@PutMapping("/saveAnimals")
		private animal update(@RequestBody animal animals1)
		{
		animalsService.saveOrUpdate(animals1);
		return animals1;
		}
		
		/// sorted by name get mapping 
		@GetMapping("/sortedbyname")  
		private List<animal> findAllSortedByNameC()   
		{  
		return animalsService.findAllSortedByNameS();  
		}
		
		
		
	

}
