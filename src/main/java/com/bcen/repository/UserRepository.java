package com.bcen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcen.models.User;

@Repository(value = "userRepository")
public interface UserRepository extends JpaRepository<User, Integer>{
	
	List<User> findAll();
	<S extends User> S save(S entity);
	User findByNickname(String nickname);
}
