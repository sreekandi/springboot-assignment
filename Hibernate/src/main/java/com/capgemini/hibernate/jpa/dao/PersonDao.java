package com.capgemini.hibernate.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.hibernate.jpa.model.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
