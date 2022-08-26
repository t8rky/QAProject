package com.example.animal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity
@Entity
//defining class name as Table name
@Table
public class animal {

	//Defining animal id as primary key
		@Id
		@Column
		private int animaltag;
		@Column
		private String animalname;
		@Column
		private String animaltype;
		@Column
		private int age;

		public int getanimalTag()
		{
		return animaltag;
		}
		public void setanimalTag(int animaltag)
		{
		this.animaltag = animaltag;
		}
		public String getAnimalName()
		{
		return animalname;
		}
		public void setAnimalName(String animalname)
		{
		this.animalname = animalname;
		}

		public animal() {
			super();
		}
		public animal(int animaltag, String animalname, String animaltype, int age) {
			super();
			this.animaltag = animaltag;
			this.animalname = animalname;
			this.animaltype = animaltype;
			this.age = age;
		}
		public String getanimaltype()
		{
		return animaltype;
		}
		public void setanimaltype(String animaltype)
		{
		this.animaltype = animaltype;
		}
		public int getAge()
		{
		return age;
		}
		public void setAge(int age)
		{
		this.age = age;
		}

}
