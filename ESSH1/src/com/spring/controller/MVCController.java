package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.MVCService;

@Controller
public class MVCController {
	
	@Autowired
	private MVCService service;
	
	@Secured(value = "ROLE_ADMIN")
	@RequestMapping("show")
	public ModelAndView show() {
		System.out.println("show");
		ModelAndView mv = new ModelAndView("demo.jsp");
		mv.addObject("clist", service.getAllUser());
		return mv;
	}
	
	@RequestMapping("login.html")
	public String login(Model model) {
		System.out.println("login.html");
		return "/login.jsp";
	}
	@Secured(value = {"ROLE_USER","ROLE_ADMIN"})
	@RequestMapping("hello")
	public String hello() {
		System.out.println("hello");
		/*ModelAndView mv = new ModelAndView("demo.jsp");
		mv.addObject("clist", service.getAllUser());*/
		return "/index.jsp";
	}
}
