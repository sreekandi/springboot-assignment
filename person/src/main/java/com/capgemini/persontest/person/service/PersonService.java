package com.capgemini.persontest.person.service;

import com.capgemini.persontest.person.entity.Person;

public interface PersonService {
	
	Person get(int personId);
	Person newPerson(Person person);

}
