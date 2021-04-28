package com.bcen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcen.models.Responsibility;

@Repository(value = "responsibilityRepository")
public interface ResponsibilityRepository extends JpaRepository<Responsibility, Integer>{

	List<Responsibility> findAll();
	<S extends Responsibility> S save(S entity);
	<S extends Responsibility> List<S> saveAll(Iterable<S> entities);
}
