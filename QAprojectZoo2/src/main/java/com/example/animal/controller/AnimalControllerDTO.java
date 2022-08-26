package com.example.animal.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.animal.dto.AnimalDTO;
import com.example.animal.model.animal;
import com.example.animal.service.AnimalDTOservice;

@RestController
public class AnimalControllerDTO {


	@Autowired
	private AnimalDTOservice service;

    public AnimalControllerDTO(AnimalDTOservice service) {
        super();
        this.service = service;
    }

    @PostMapping("/createDTO")
    public AnimalDTO addAnimal(@RequestBody animal animals1) {
        return this.service.addAnimal(animals1);
    }

    @GetMapping("/getAllDTO")
    public List<animal> getAllAnimals() {
        return this.service.getAllAnimals();
    }

    @PutMapping("/updateDTO")
    public AnimalDTO updatePerson(@PathParam("id") int id, @RequestBody animal animals1) {
    	return this.service.updateAnimal(id, animals1);
    }

    @DeleteMapping("/deleteDTO/{id}")
    public boolean removePerson(@PathVariable int id) {
    	
        return this.service.removeAnimal(id);
    }

    @GetMapping("/test")
    public String test() {
        return "Hello, World!";
    }

}
