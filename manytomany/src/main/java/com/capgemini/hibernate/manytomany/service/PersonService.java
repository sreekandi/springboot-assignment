package com.capgemini.hibernate.manytomany.service;

import java.util.Set;

import com.capgemini.hibernate.manytomany.entity.Person;

public interface PersonService {
	public Set<Person> addNew(Set<Person> person);
	//public void addProject(Set<Project> project);

}
