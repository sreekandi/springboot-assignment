package com.capgemini.hibernate.onetoone.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.hibernate.onetoone.person.entity.Person;

public interface PersonDao  extends JpaRepository<Person, Integer>{
	
	

}
