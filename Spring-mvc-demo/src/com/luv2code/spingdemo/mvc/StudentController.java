package com.luv2code.spingdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		Student thestudent = new Student();
		model.addAttribute("student",thestudent);
		
		model.addAttribute("theCountryOptions", countryOptions);
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student thestudent)
	{
		
		
		System.out.println("the student"+thestudent.getFirstname()+" " +thestudent.getLastname());
		return "confirm";
	}
	
}
