package com.vbits.model;

import org.springframework.beans.factory.annotation.Value;

public class User {

	private int id;
	@Value("Admin")
	private String userName;
	@Value("nimda")
	private String password;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString(){
		return "Username: "+userName+"\nPassword: "+password;
	}
	
	
	
}
