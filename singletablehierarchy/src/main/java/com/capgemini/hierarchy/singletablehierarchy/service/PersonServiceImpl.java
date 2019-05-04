package com.capgemini.hierarchy.singletablehierarchy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.hierarchy.singletablehierarchy.dao.PersonDao;
import com.capgemini.hierarchy.singletablehierarchy.entity.Person;

@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	PersonDao dao;
	
	@Override
	public Person addNew(Person person) 
	{
		dao.save(person);
		return person;
	}

}
