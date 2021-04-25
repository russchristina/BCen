package com.bcen.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table(name = "bcen_user")
public class User {

	@Id
	@Column
	@GeneratedValue(generator = "bcen_user_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "bcen_user_id_seq")
	private int id;
	@Column
	private String name;
	@Column
	private String nick_name;
	@Column
	private String favorite_color;
	@Column
	private String favorite_candy;
	/*
	 * Ideally, you would want to keep data atomic as you are not in first
	 * normal formal form if you do not. That said, for simplicity's sake,
	 * we will store all collections' data as comma separated lists in our
	 * DB.
	 */
	@Column
	private List<String> food_allergies;
	@Column
	private boolean paid_in_full;
	@Column
	private boolean can_donate;
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
	@JoinColumn
	@ManyToMany
	private List<String> responsibilities;
	@Column
	private List<String> panels;
	@Column
	private List<String> cosplays;
	@Column
	private List<String> top_five_anime;
	@Column
	private List<String> top_two_anime_characters;
	@Column
	private List<String> top_five_kpop_groups;
	@Column
	private List<String> top_two_ultimate_biases;
	@Column
	private List<String> additional_info;
}
