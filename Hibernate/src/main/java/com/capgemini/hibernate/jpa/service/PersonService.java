package com.capgemini.hibernate.jpa.service;

import org.springframework.stereotype.Repository;

import com.capgemini.hibernate.jpa.model.Person;

@Repository
public interface PersonService  {
	
	public void addNew(Person person);
	public Person findById(int personId);

}
