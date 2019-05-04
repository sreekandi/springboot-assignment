package com.capgemini.hibernate.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.hibernate.jpa.dao.PersonDao;
import com.capgemini.hibernate.jpa.model.Person;

@Repository
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonDao persondao;

	@Override
	public void addNew(Person person) {
		persondao.save(person);
		
	}

	@Override
	public Person findById(int personId) {
		Person person = persondao.findById(personId).get();
		return person;
	}

}
