package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/payment")
	public String payment(Integer item1,Integer item2,Integer item3) {
		int total = item1 + item2 + item3;
		int tax = (int)(total * 0.1);
		application.setAttribute("total",total);
		application.setAttribute("pulsTax",total + tax);
		return "exam03-result";
	}
	
}
