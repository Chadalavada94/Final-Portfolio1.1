package com.luv2code.spingdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstname;
	private String lastname;
	private String country;
	
	private String favlan;
	
	private String[] operatingsystems;
	
	
	public String[] getOperatingsystems() {
		return operatingsystems;
	}
	public void setOperatingsystems(String[] operatingsystems) {
		this.operatingsystems = operatingsystems;
	}
	public String getFavlan() {
		return favlan;
	}
	public void setFavlan(String favlan) {
		this.favlan = favlan;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Student()
	{
		
		
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
