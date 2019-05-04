package com.capgemini.hibernate.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.hibernate.jpa.model.Person;
import com.capgemini.hibernate.jpa.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService service;

	@RequestMapping("/")
	public void setPerson() {
		Person person = new Person(100, "vidhya");
		service.addNew(person);
	}

	@RequestMapping("/get")
	public Person getPerson() {
		Person person = service.findById(100);
		return person;
	}

}
