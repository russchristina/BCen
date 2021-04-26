package com.bcen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcen.models.Event;
import com.bcen.service.EventService;

@RestController(value = "eventController")
@RequestMapping(path = "/event")
/*
 * This will need to be modified in production.
 */
public class EventController {

	@Autowired
	private EventService eventService;
	
	@GetMapping(path = "/hosted-events")
	public List<Event> findAll(){
		return this.eventService.findAll();
	}
	
	@PostMapping(path = "/new-event")
	public Event save(@RequestBody Event event) {
		return this.eventService.save(event);
	}
	
}
