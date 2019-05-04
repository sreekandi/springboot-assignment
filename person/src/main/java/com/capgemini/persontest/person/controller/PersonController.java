package com.capgemini.persontest.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.persontest.person.entity.Person;
import com.capgemini.persontest.person.service.PersonService;

@RestController
@RequestMapping("/Person")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@PostMapping("/post")
	public Person get(Person person) {
		return service.newPerson(person);
	}
	

	@RequestMapping("/get")
	public Person getPerson() {
		Person p = service.get(101);
		return p;
	}

}
