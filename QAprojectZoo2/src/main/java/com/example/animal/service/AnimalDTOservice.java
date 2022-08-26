package com.example.animal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.animal.dto.AnimalDTO;
import com.example.animal.model.animal;
import com.example.animal.repo.animalrepo;

@Service
public class AnimalDTOservice {

	//wiring the repo
	@Autowired
	private animalrepo repo;

	private ModelMapper mapper;

	public AnimalDTOservice(animalrepo repo , ModelMapper mapper) {
        super();
        this.repo = repo;
        this.mapper = mapper;
    }
	//DTO Service
	private AnimalDTO mapToDTO(animal animals1) {
		AnimalDTO dto = new AnimalDTO();
        dto.setAge(animals1.getAge());
        dto.setanimalTag(animals1.getanimalTag());
        dto.setAnimalName(animals1.getAnimalName());
        return dto;
    }

	public AnimalDTO addAnimal(animal animals1) {
        animal saved =  this.repo.save(animals1);
        return this.mapToDTO(saved);
    }

	public List<animal> getAllAnimals()
	{
	List<animal> animals1 = new ArrayList<>();
	repo.findAll().forEach(animals2 -> animals1.add(animals2));
	return animals1;
	}

    public AnimalDTO updateAnimal(int id, animal animals1) {
        Optional<animal> existingOptional = this.repo.findById(id);
        animal existing = existingOptional.get();

        existing.setAge(animals1.getAge());
        existing.setAnimalName(animals1.getAnimalName());

        animal updated =  this.repo.save(existing);
        return this.mapToDTO(updated);
    }

    public boolean removeAnimal(int id) {
        this.repo.deleteById(id);
        boolean exists = this.repo.existsById(id);
        return !exists;
    }
}
