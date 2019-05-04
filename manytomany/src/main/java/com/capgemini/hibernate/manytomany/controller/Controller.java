package com.capgemini.hibernate.manytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.hibernate.manytomany.entity.Person;
import com.capgemini.hibernate.manytomany.entity.Project;
import com.capgemini.hibernate.manytomany.service.PersonService;

@RestController
public class Controller {

	@Autowired
	private PersonService service;

	@RequestMapping("/")
	public Set<Person> addNewPerson()
	{
		Set<Project> project = new HashSet<Project>();
		project.add(new Project(1 , "Java Project"));
		project.add(new Project(2 , "Python Project"));
		
		Set<Person> person = new HashSet<Person>();
		person.add(new Person(101, "vidhya", project));
		person.add(new Person(102, "shiva", project));
		
		service.addNew(person);
		return person;
	}
	
	

}
