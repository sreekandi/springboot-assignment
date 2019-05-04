package com.capgemini.hibernate.onetomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.hibernate.onetomany.person.dao.PersonDao;
import com.capgemini.hibernate.onetomany.person.entity.Certificates;
import com.capgemini.hibernate.onetomany.person.entity.Person;


@RestController
public class Controller {
	@Autowired
	PersonDao persondao;
	
	
	@RequestMapping("/")
	public void add() {
		Set<Certificates> set = new HashSet<Certificates>();
		Certificates certificate1 = new Certificates(301,"JAVACertificate");
		Certificates certificate2 = new Certificates(302,"PYTHONCertificate");
		Certificates certificate3 = new Certificates(303,"SELENIUMCertificate");
		set.add(certificate1);
		set.add(certificate2);
		set.add(certificate3);
		Person person = new Person(101,"vidhya",set);
		persondao.save(person);
		
			
	
	}
	@RequestMapping("/get")
	public Person getDetails() {
		Person person = persondao.findById(101).get();

		return person;
	}
	

}
