package com.capgemini.hibernate.manytomany.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.hibernate.manytomany.dao.PersonDao;
import com.capgemini.hibernate.manytomany.entity.Person;
@Repository
public class PersonImpl implements PersonService{
	@Autowired
	PersonDao dao;

	@Override
	public Set<Person> addNew(Set<Person> person) {
		dao.saveAll(person);
		return person;
	}
}
