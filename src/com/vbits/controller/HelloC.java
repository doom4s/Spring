package com.vbits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloC {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(){
		System.out.println("HELLO");
		return "hello";
	}
}
