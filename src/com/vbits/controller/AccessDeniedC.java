package com.vbits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccessDeniedC {
	@RequestMapping(value="/accessDenied",method=RequestMethod.GET)
	public String denied() {
		return "welcome";
	}
}
