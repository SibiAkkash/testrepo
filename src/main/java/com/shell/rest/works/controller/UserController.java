package com.shell.rest.works.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shell.rest.works.beans.User;
import com.shell.rest.works.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService service; 
	
	@PostMapping("/user")
	public User save( @RequestBody User user) {
		return service.save(user); 
	}
	@PutMapping("/user")
	public User update(@RequestBody User user) {
		return service.update(user); 
	}
	@GetMapping("/user")
	public List<User> getUsers() {
		return service.getUsers(); 
	}
	@GetMapping("/user/{userId}")
	public User getUser( @PathVariable int userId) {
		return service.getUser(userId); 
	}
	
	
}
