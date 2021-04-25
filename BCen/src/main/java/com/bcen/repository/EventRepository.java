package com.bcen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcen.models.Event;

public interface EventRepository extends JpaRepository<Event, Integer>{

}
