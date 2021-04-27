package com.bcen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcen.models.User;
import com.bcen.repository.UserRepository;

@Service(value = "userService")
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return this.userRepository.findAll();
	}
	
	public User save(User user) {
		return this.userRepository.save(user);
	}
	
	public User findByNick_nameAndPassword(User user) {		
		User returnedUser = this.userRepository.
				findByNicknameAndPassword(user.getNick_name(), user.getPassword());
			
		return returnedUser;
	}
	
}
