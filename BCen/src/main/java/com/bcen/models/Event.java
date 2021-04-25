package com.bcen.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table(name = "event")
public class Event {

	@Id
	@Column
	@GeneratedValue(generator = "event_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "event_id_seq")
	private int id;
	@ManyToMany
	@JoinTable(name = "event_user",
	joinColumns = {@JoinColumn(name = "event_id")},
	inverseJoinColumns = {@JoinColumn(name = "user_id")})
	private Set<User> creator;
	@Column
	private String description;
	@Column
	private String category;
	@Column
	private int minimum_participants;
}
