package com.bcen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcen.models.User;
import com.bcen.service.UserService;

@RestController(value = "userController")
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/registered-users")
	public List<User> findAll(){
		return this.userService.findAll();
	}
	
	@PostMapping(path = "/registration")
	public User save(@RequestBody User user) {
		return this.userService.save(user);
	}
	
	@PostMapping(path = "/login")
	public User login(@RequestBody User user) {
		return this.userService.findByNick_nameAndPassword(user);
	}
}
