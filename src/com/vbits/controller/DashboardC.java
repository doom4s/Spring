package com.vbits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vbits.dao.UserDao;
//@Jelena - this is the dashboard controller - Vlajko
@Controller
public class DashboardC {

	private UserDao userDao;
	
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public String dashboard(Model model){
		model.addAttribute("users",userDao.getUsers());
		return "dashboard";
	}
//test commit
	public UserDao getUserDao() {
		return userDao;
	}
	@Autowired
	public void setUserDao(@Qualifier("userDao")UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	
}
