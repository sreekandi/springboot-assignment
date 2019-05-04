package com.capgemini.hibernate.onetomany.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.hibernate.onetomany.person.entity.Person;

public interface PersonDao  extends JpaRepository<Person, Integer>{

}
