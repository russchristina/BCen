package com.bcen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcen.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
