package com.bcen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	//What was the reason for making this join table? Is it that panels can be co-hosted? Or are users signing up for events?
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User creator;
	@Column
	private String description;
	@Column
	private String category;
	@Column
	private int minimumparticipants;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(int id, User creator, String description, String category, int minimum_participants) {
		super();
		this.id = id;
		this.creator = creator;
		this.description = description;
		this.category = category;
		this.minimumparticipants = minimum_participants;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", creator=" + creator + ", description=" + description + ", category=" + category
				+ ", minimum_participants=" + minimumparticipants + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + minimumparticipants;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (minimumparticipants != other.minimumparticipants)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getMinimumparticipants() {
		return minimumparticipants;
	}

	public void setMinimumparticipants(int minimum_participants) {
		this.minimumparticipants = minimum_participants;
	}

}
