package com.capgemini.hierarchy.singletablehierarchy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.hierarchy.singletablehierarchy.entity.Employee;
import com.capgemini.hierarchy.singletablehierarchy.entity.Person;
import com.capgemini.hierarchy.singletablehierarchy.service.PersonService;

@RestController
public class PersonController 
{
	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public Person addPerson()
	{		
		Person person = new Employee(101, "sarath", 3000.0, "CSE");
		service.addNew(person);
		return person;
	}
}
