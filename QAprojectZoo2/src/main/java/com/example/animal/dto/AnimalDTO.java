package com.example.animal.dto;

public class AnimalDTO {

	private int animalTag;

	private String animalname;

	private String animaltype;

	private int age;



	public AnimalDTO() {
		super();

	}

	public int getanimalTag() {
		return animalTag;
	}

	public void setanimalTag(int animalTag) {
		this.animalTag = animalTag;
	}

	public String getAnimalName() {
		return animalname;
	}

	public void setAnimalName(String animalname) {
		this.animalname = animalname;
	}

	public String getanimaltype() {
		return animaltype;
	}

	public void setanimaltype(String animaltype) {
		this.animaltype = animaltype;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}




}
