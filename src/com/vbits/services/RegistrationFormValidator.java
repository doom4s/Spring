package com.vbits.services;

import javax.annotation.Resource;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.vbits.dao.UserDao;
import com.vbits.model.User;

public class RegistrationFormValidator implements Validator{

	@Resource
	private UserDao userDao;
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "NotEmpty.userForm.userName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.userForm.password");
	
		if(user.getUserName()==null||user.getUserName().length()<3){
			errors.rejectValue("userName", "NotEmpty.userForm.userName");
		}
		if(user.getPassword()==null||user.getPassword().length()<3){
			errors.rejectValue("userName", "NotEmpty.userForm.password");
		}
	}
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
