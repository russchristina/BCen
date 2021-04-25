package com.bcen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table(name = "responsibility")
public class Responsibility {

	@Id
	@Column
	@GeneratedValue(generator = "responsibility_id_generator", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "responsibility_id_generator")
	private int id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private int upper_limit;
	public Responsibility() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Responsibility(int id, String name, String description, int upper_limit) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.upper_limit = upper_limit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUpper_limit() {
		return upper_limit;
	}
	public void setUpper_limit(int upper_limit) {
		this.upper_limit = upper_limit;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + upper_limit;
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
		Responsibility other = (Responsibility) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (upper_limit != other.upper_limit)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Responsibility [id=" + id + ", name=" + name + ", description=" + description + ", upper_limit="
				+ upper_limit + "]";
	}
	
	
}
