package com.bcen.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

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
	
	@PostMapping(path = "/modified-responsibilities")
	public List<Responsibility> update(@RequestBody List<Responsibility> responsibilities, HttpSession httpSession) {
		System.out.println(httpSession.getAttribute("user"));
		return this.responsibilityService.update(responsibilities, httpSession);
	}
}
