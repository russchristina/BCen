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
	@JoinTable(name = "event_user", joinColumns = { @JoinColumn(name = "event_id") }, inverseJoinColumns = {
			@JoinColumn(name = "user_id") })
	private Set<User> creator;
	@Column
	private String description;
	@Column
	private String category;
	@Column
	private int minimum_participants;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(int id, Set<User> creator, String description, String category, int minimum_participants) {
		super();
		this.id = id;
		this.creator = creator;
		this.description = description;
		this.category = category;
		this.minimum_participants = minimum_participants;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", creator=" + creator + ", description=" + description + ", category=" + category
				+ ", minimum_participants=" + minimum_participants + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + minimum_participants;
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
		if (minimum_participants != other.minimum_participants)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<User> getCreator() {
		return creator;
	}

	public void setCreator(Set<User> creator) {
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

	public int getMinimum_participants() {
		return minimum_participants;
	}

	public void setMinimum_participants(int minimum_participants) {
		this.minimum_participants = minimum_participants;
	}

}
