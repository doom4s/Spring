package com.vbits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoodC {
	@RequestMapping(value = "/good", method = RequestMethod.GET)
	public String good() {
		System.out.println("GOOD");
		return "good";
	}

}
