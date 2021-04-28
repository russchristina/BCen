package com.bcen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcen.models.Responsibility;
import com.bcen.service.ResponsibilityService;

@RestController(value = "responsibilityController")
@RequestMapping(path = "/responsibility")
public class ResponsibilityController {

	@Autowired
	private ResponsibilityService responsibilityService;
	
	@GetMapping(path = "/existing-responsibilities")
	public List<Responsibility> findAll(){
		return this.responsibilityService.findAll();
	}
	
	@PostMapping(path = "/modified-responsibility")
	public Responsibility update(@RequestBody Responsibility responsibility) {
		return this.responsibilityService.update(responsibility);
	}
}
