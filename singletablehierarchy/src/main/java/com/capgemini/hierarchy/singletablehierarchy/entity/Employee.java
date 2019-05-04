package com.capgemini.hierarchy.singletablehierarchy.entity;

import javax.persistence.Entity;

@Entity  
public class Employee extends Person
{
  
	private double employeeSal;
	
	 
	private String employeeBranch;


	public  Employee(int personId, String personName, double employeeSal, String employeeBranch) {
		super(personId, personName);
		this.employeeSal = employeeSal;
		this.employeeBranch = employeeBranch;
	}


	public  Employee() {
		super();
		
	}


	public double getEmployeeSal() {
		return employeeSal;
	}


	public void setEmployeeSal(double employeeSal) {
		this.employeeSal = employeeSal;
	}


	public String getEmployeeBranch() {
		return employeeBranch;
	}


	public void setEmployeeBranch(String employeeBranch) {
		this.employeeBranch = employeeBranch;
	}


	@Override
	public String toString() {
		return "Employee [employeeSal=" + employeeSal + ", employeeBranch=" + employeeBranch + "]";
	}


	


	
}