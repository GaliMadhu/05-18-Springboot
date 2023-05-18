package com.example.SpringBootCurd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	  @GetMapping("/mesg")
	  public String getMeaasage() {
		  System.out.println("hello spring");
		  return "Hi I am spring boot";
	  }

}
