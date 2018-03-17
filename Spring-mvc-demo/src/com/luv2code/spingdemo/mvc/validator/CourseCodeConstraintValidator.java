package com.luv2code.spingdemo.mvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	
	public String coursePrefix;
	@Override
	public void initialize(CourseCode the)
	{
		coursePrefix = the.value();
	}
	
	@Override
	public boolean isValid(String thecode, ConstraintValidatorContext theconstr) {
	
			boolean result;
			
			if(thecode!=null)
			{
			
			result =thecode.startsWith(coursePrefix);
			}
			
			else
			{
				result= true;
			}
		
			
		return result;
	}

}
