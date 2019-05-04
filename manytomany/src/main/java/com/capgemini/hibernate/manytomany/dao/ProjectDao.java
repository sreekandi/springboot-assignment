package com.capgemini.hibernate.manytomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.hibernate.manytomany.entity.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Integer> {

}
