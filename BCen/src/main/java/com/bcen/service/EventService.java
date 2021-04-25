package com.bcen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcen.models.Event;
import com.bcen.repository.EventRepository;

@Service(value = "eventService")
public class EventService {

	@Autowired
	private EventRepository eventRepository;
	
	public List<Event> findAll(){
		return this.eventRepository.findAll();
	}
	
	public Event save(Event event) {
		return this.eventRepository.save(event);
	}
	
}
