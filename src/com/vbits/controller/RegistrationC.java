package com.vbits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vbits.dao.UserDao;
import com.vbits.model.User;
import com.vbits.services.RegistrationFormValidator;

@Controller
public class RegistrationC {
	
	private UserDao userDao;
	@Autowired
	private RegistrationFormValidator registrationFormValidator;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(registrationFormValidator);
	}
	
	@RequestMapping(value="/registration", method=RequestMethod.GET)
	public String register(Model model){
		return "registration";
	}
	@RequestMapping(value="/newUser",method=RequestMethod.POST)
	public String newUser(Model model, @Validated User user, BindingResult result){
		System.out.println("Here !");
		
		if(result.hasErrors()){
			System.out.println("ERRORS !!!");
			return "registration";
		}
		model.addAttribute("userForm", user);
		if(!userDao.validteUser(user)){
		userDao.addUser(user);
		model.addAttribute("users", userDao.getUsers());
		return "welcome";
		
		}else{
			System.out.println("Username already taken.");
			model.addAttribute("warning","Username already taken please choose a different one.");
			return "registration";
		}
		
		
	}
	public UserDao getUserDao() {
		return userDao;
	}
	@Autowired
	public void setUserDao(@Qualifier("userDao") UserDao userDao) {
		this.userDao = userDao;
	}
	public RegistrationFormValidator getRegistrationFormValidator() {
		return registrationFormValidator;
	}
	public void setRegistrationFormValidator(RegistrationFormValidator registrationFormValidator) {
		this.registrationFormValidator = registrationFormValidator;
	}
	

}
