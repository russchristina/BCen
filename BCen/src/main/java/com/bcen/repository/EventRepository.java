package com.bcen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcen.models.Event;

@Repository(value = "eventRepository")
public interface EventRepository extends JpaRepository<Event, Integer>{

	List<Event> findAll();
	<S extends Event> S save(S entity);
}
