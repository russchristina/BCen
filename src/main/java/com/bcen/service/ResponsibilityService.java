package com.bcen.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcen.models.Responsibility;
import com.bcen.repository.ResponsibilityRepository;

@Service(value = "responsibilityService")
public class ResponsibilityService {

	@Autowired
	private ResponsibilityRepository responsibilityRepository;
	
	public void pseudoSanitizePasswords(List<Responsibility> responsibilities) {
		for(Responsibility r : responsibilities) {
			r.getUsers().forEach(user -> user.setPassword(null));
		}
	}
	
	//Check to see if the user has signed up for 3 responsibilities already
	public boolean isRegisteredForLessThanThree(List<Responsibility> responsibilities, HttpSession httpSession) {
		int numberOfResponsibilities = 0;
		
		for(Responsibility r : responsibilities) {
			
		}
		
		return false;
	}
	
	public List<Responsibility> findAll(){
		List<Responsibility> retrievedResponsibilities = this.responsibilityRepository.findAll();
		pseudoSanitizePasswords(retrievedResponsibilities);
		return retrievedResponsibilities;
	}
	
	public List<Responsibility> update(List<Responsibility> responsibilities, HttpSession httpSession) {

		List<Responsibility> retrievedResponsibilities = this.responsibilityRepository.saveAll(responsibilities);
		System.out.println(httpSession.getAttribute("user"));
		pseudoSanitizePasswords(retrievedResponsibilities);
		return retrievedResponsibilities;
	}
}
