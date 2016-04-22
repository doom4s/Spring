package com.vbits.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.vbits.model.User;
//@Jelena - this is my DAO class - Vlajko
@Component("userDao")
public class UserDao {

	private static ArrayList<User> users = new ArrayList<>();

	public void addUser(User user) {
		if(!findUser(user)){
		users.add(user);
		System.out.println("User has been added to the list ! Rejoyce!");
		}
	}

	public void deleteUser(User user) {
		users.remove(user);
	}

	public void deleteUser(String userName) {
		for (User user : users) {
			if (user.getUserName().equals(userName)) {
				deleteUser(user);
			}
		}
	}
	
	public void deleteUser(int id) {
		for (User user : users) {
			if (user.getId()==id) {
				deleteUser(user);
			}
		}
	}
	
	public boolean findUser(User user){
		if(users.contains(user)){return true;}
		return false;
	}
	
	public User findUser(int id){
		for(User user:users){
			if(user.getId()==id){
				return user;
			}
		}
		return null;
		
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> useRs) {
		users = useRs;
	}
	public boolean validteAccess(User user){
		for(User myuser:users){
			if(myuser.getUserName().equals(user.getUserName())&&myuser.getPassword().equals(user.getPassword())){
				System.out.println("OK");
				return true;
			}
		}
		System.out.println("NOK");
			return false;
		
	}
	
	public boolean validteUser(User user){
		for(User myuser:users){
			if(myuser.getUserName().equals(user.getUserName())){
				System.out.println("UOK");
				return true;
			}
		}
		System.out.println("UNOK");
			return false;
		
	}
	
	public String toString(){
		String s = null;
		for(User user:users){
			s+=user.toString();
		}
		return s;
	}

}
