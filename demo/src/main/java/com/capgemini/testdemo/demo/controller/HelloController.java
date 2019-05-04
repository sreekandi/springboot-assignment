package com.capgemini.testdemo.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloController 
{
	
	@PostMapping("/post")	
	public String message()
	{
		return "HelloWorld";
	}

}
