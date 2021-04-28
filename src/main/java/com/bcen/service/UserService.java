package com.bcen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bcen.models.User;
import com.bcen.repository.UserRepository;

@Service(value = "userService")
public class UserService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return this.userRepository.findAll();
	}
	
	public User save(User user) {
		String encodedPassword = this.passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		User retrievedUser = this.userRepository.save(user);
		retrievedUser.setPassword(null);
		return retrievedUser;
	}
	
	public User findByNick_nameAndPassword(User user) {		
		User returnedUser = this.userRepository.findByNickname(user.getNick_name());
		
		if(returnedUser != null) {
			if(this.passwordEncoder.matches(user.getPassword(), returnedUser.getPassword())) {
				returnedUser.setPassword(null);
				return returnedUser;
			}
		}
		return null;
	}
	
}
