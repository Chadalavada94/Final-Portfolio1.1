package com.luv2code.spingdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/new")
public class NewController {

	@RequestMapping("/processFormthree")
	public String display()
	{
		return "new";
	}
}
