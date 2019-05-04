package com.capgemini.hibernate.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capgemini.hibernate.onetoone.person.dao.PersonDao;
import com.capgemini.hibernate.onetoone.person.entity.Person;
import com.capgemini.hibernate.onetoone.profile.entity.Profile;

@RestController
public class Controller {
	
	@Autowired
	PersonDao dao;
	
	
	@RequestMapping("/")
	public void add() {
		Person person = new Person(100, "vidhya",new Profile(2001,"JAVA with CLOUD"));
		dao.save(person);
		
	}

	@RequestMapping("/get")
	public Person findById() {
		Person person = dao.findById(100).get();
		return person;
	}
	

}
