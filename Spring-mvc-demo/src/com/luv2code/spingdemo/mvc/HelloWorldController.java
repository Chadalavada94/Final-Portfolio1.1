package com.luv2code.spingdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	
@RequestMapping("/showForm")
public String showForm()
{
	return "helloworld";
}
@RequestMapping("/processForm")
public String processForm()
{
	return "processForm";
}
@RequestMapping("/processFormtwo")
public String shout(HttpServletRequest req, Model model)
{
	String name=req.getParameter("username");
	
	name = name.toUpperCase();
	
	String result = "yo! " +name;
	
	model.addAttribute("message", result);
	
	return "processForm";
	
	
	
}
	
@RequestMapping("/processFormthree")
public String shoot(@RequestParam("username") String name, Model model)
{
	
	
	name = name.toUpperCase();
	
	String result = "yo hey ! " +name;
	
	model.addAttribute("message", result);
	
	return "processForm";
	
	
	
}
}
