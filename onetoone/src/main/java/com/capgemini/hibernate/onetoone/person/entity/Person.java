package com.capgemini.hibernate.onetoone.person.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.capgemini.hibernate.onetoone.profile.entity.Profile;

@Entity
public class Person {
	
	@Id
	private int personId;
	private String personName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Profile profile;
	
	public Person() {
		super();
	
	}
	
	public Person(int personId, String personName, Profile profile) {
	
		super();
		this.personId = personId;
		this.personName = personName;
		this.profile = profile;
	}
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", profile=" + profile + "]";
	}
	
	
	
	
	

}
