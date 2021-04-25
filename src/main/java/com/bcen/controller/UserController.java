package com.bcen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcen.models.User;
import com.bcen.service.UserService;

@RestController(value = "userController")
@RequestMapping(path = "/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/registered-users")
	public List<User> findAll(){
		return this.userService.findAll();
	}
	
	@PostMapping(path = "/registration")
	public void save(@RequestBody User user) {
		this.userService.save(user);
	}
}