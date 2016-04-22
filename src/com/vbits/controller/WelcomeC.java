package com.vbits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vbits.dao.UserDao;
import com.vbits.model.User;

@Controller
@RequestMapping(value = "/")
public class WelcomeC {

	private UserDao userDao;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String welcome(Model model) {
		User user = new User();
		model.addAttribute("userForm", user);
		model.addAttribute("myname", "Vlajko");
		return "welcome";
	}
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}
	@RequestMapping(value="/dashboard",method=RequestMethod.POST)
	public String login(Model model, User user){
		System.out.println(user);
		model.addAttribute("users", userDao.getUsers());
		if(userDao.validteAccess(user)){
			model.addAttribute("myname", user.getUserName());
			return "dashboard";}
		else{return "accessDenied";}
	}

	public UserDao getUserDao() {
		return userDao;
	}
	@Autowired
	public void setUserDao(@Qualifier("userDao") UserDao userDao) {
		this.userDao = userDao;
	}
	
}
