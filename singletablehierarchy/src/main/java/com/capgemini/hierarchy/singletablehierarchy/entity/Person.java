package com.capgemini.hierarchy.singletablehierarchy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

public class Person {

	
	@Id
	private  int personId;
	private String personName;

	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	
}
