package com.bcen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcen.models.Responsibility;
import com.bcen.repository.ResponsibilityRepository;

import net.bytebuddy.asm.Advice.Return;

@Service(value = "responsibilityService")
public class ResponsibilityService {

	@Autowired
	private ResponsibilityRepository responsibilityRepository;
	
	public void pseudoSanitizePasswords(List<Responsibility> responsibilities) {
		for(Responsibility r : responsibilities) {
			r.getUsers().forEach(user -> user.setPassword(null));
		}
	}
	
	public List<Responsibility> findAll(){
		List<Responsibility> retrievedResponsibilities = this.responsibilityRepository.findAll();
		pseudoSanitizePasswords(retrievedResponsibilities);
		return retrievedResponsibilities;
	}
	
	public List<Responsibility> update(List<Responsibility> responsibilities) {

		List<Responsibility> retrievedResponsibilities = this.responsibilityRepository.saveAll(responsibilities);
		pseudoSanitizePasswords(retrievedResponsibilities);
		return retrievedResponsibilities;
	}
}
