package com.capgemini.hibernate.manytomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.hibernate.manytomany.entity.Person;

@Repository
public interface PersonDao  extends JpaRepository<Person, Integer>{

	
}
