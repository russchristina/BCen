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
	
	public List<Responsibility> findAll(){
		List<Responsibility> retrievedResponsibilities = this.responsibilityRepository.findAll();
		
		for(Responsibility r : retrievedResponsibilities) {
			r.getUsers().forEach(user -> user.setPassword(null));
		}
		
		return retrievedResponsibilities;
	}
	
	public Responsibility update(Responsibility responsibility) {
		return this.responsibilityRepository.save(responsibility);
	}
}
