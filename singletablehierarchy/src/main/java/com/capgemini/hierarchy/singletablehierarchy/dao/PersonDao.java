package com.capgemini.hierarchy.singletablehierarchy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.hierarchy.singletablehierarchy.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{

}
