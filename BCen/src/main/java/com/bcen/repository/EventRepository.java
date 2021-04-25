package com.bcen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcen.models.Event;

@Repository(value = "eventRepository")
public interface EventRepository extends JpaRepository<Event, Integer>{

}
