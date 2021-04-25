package com.bcen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcen.models.Responsibility;
import com.bcen.repository.ResponsibilityRepository;

@Service(value = "responsibilityService")
public class ResponsibilityService {

	@Autowired
	private ResponsibilityRepository responsibilityRepository;
	
	public List<Responsibility> findAll(){
		return this.responsibilityRepository.findAll();
	}
}
