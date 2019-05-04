package com.capgemini.persontest.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.persontest.person.dao.PersonDao;
import com.capgemini.persontest.person.entity.Person;

@Service
public class PersonServiceImpl  implements PersonService{
	
	@Autowired
	private PersonDao dao;

	@Override
	public Person get(int personId) {
return dao.findById(personId).get();
		
	}

	

	@Override
	public Person newPerson(Person person) {
		return dao.save(person);
		
	}	
	

}
