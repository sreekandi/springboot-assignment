package com.capgemini.hibernate.onetomany.person.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.capgemini.hibernate.onetomany.person.entity.Person;

@Entity
public class Certificates {
	
	@Id
	private int certificateId;
	private String certificateType;
	
	@ManyToOne
	@JoinColumn(name="personId")
	private Person person;

	public Certificates() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificates(int certificateId, String certificateType) {
		super();
		this.certificateId = certificateId;
		this.certificateType = certificateType;
	
	}

	public int getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}
	
	
	@Override
	public String toString() {
		return "Certificates [certificateId=" + certificateId + ", certificateType=" + certificateType + ", person="
				+ person + "]";
	}
	
	
	
	

}
