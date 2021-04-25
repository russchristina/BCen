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
}
