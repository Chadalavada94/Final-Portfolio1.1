package com.luv2code.spingdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.spingdemo.mvc.validator.CourseCode;



public class Customer {
	
	private String firstname;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastname;
	
	@Pattern(regexp="^[a-zA-Z0-9] {5}", message="only 5 characters")
	private String postalCode;
	
	@CourseCode
	private String courseCode;
	
	
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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
