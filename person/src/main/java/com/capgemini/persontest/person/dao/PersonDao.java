package com.capgemini.persontest.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.persontest.person.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
