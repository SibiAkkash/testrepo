package com.shell.rest.works.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shell.rest.works.beans.User;

@Service
public class UserService {
	static List<User> users; 
	static{
		users = new ArrayList<User>(); 
		
		users.add(new User(101, "Srinivas", "srinivas@srinivas.com"));
		users.add(new User(102, "Tushar", "Tushar@Tushar.com"));
		users.add(new User(103, "anil", "anil@anil.com"));
		users.add(new User(104, "maho", "maho@maho.com"));
		
	}
	
	
	public User save(User user) {
		users.add(user); 
		return user; 
	}
	
	public User update(User user) {
		users.remove(user); 
		users.add(user);
		
		return user; 
		
	}
	
	public User getUser(int userId) {
		return users.get(userId); 
	} 
	
	public List<User> getUsers() {
		return users; 
	}
	
	public void delete(int userId) {
		users.remove(userId); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
