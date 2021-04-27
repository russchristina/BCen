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
	private int upperlimit;
	/**
	 * This will be a many-to-many to responsibilities with a max of two.
	 * 
	 * The available jobs are:
	 * 
	 * Associate Consuite - rations and plans food menu for the party - upper limit 2
	 * Chief Consuite - prepares food based on the proposed menu - upper limit - 2
	 * Driver - drives people everywhere lolz - upper limit 2
	 * Website - exclusive position that no one can sign up for (and no one can actually click it)
	 * Founder - exclusive position that no one can sign up for
	 * Medic - gives first aid to party goers - upper limit 2
	 * Panelist - provides party fun
	 * DJ - provides the bops - upper limit 2
	 * Vendor - sells swag to party goers
	 * Costume Repair - mends threads - upper limit 1
	 * Program Coordinator - someone who manages scheduling and creates propaganda - upper limit 3
	 */
	@ManyToMany
	@JoinTable(name = "user_responsibility", joinColumns = {
			@JoinColumn(name = "responsibility_id") }, inverseJoinColumns = { @JoinColumn(name = "user_id") })
	private Set<User> users;

	public Responsibility() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Responsibility(int id, String name, String description, int upper_limit, Set<User> users) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.upperlimit = upper_limit;
		this.users = users;
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

	public int getUpperlimit() {
		return upperlimit;
	}

	public void setUpperlimit(int upper_limit) {
		this.upperlimit = upper_limit;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + upperlimit;
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		if (upperlimit != other.upperlimit)
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Responsibility [id=" + id + ", name=" + name + ", description=" + description + ", upper_limit="
				+ upperlimit + ", users=" + users + "]";
	}

}
