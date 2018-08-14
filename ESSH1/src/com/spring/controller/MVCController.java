package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVCController {
	
	@RequestMapping("test")
	public String test() {
		System.out.println("test spring today");
		return "/demo.jsp";
	}
}
