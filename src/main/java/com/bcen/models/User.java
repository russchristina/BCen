package com.bcen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(unique = true)
	private String nickname;
	/*
	 * Do not send passwords to the frontend.
	 */
	@Column
	private String password;
	@Column
	private String favoritecolor;
	@Column
	private String favoritecandy;
	/*
	 * Ideally, you would want to keep data atomic as you are not in first normal
	 * formal form if you do not. That said, for simplicity's sake, we will store
	 * all collections' data as comma separated lists in our DB.
	 */
	@Column
	private String foodallergies;
	@Column
	private boolean paidinfull;
	@Column
	private boolean candonate;
	@Column
	private String panels;
	@Column
	private String cosplays;
	@Column
	private String topfiveanime;
	@Column
	private String toptwoanimecharacters;
	@Column
	private String topfivekpopgroups;
	@Column
	private String toptwoultimatebiases;
	@Column
	private String additionalinfo;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String nick_name, String password, String favorite_color, String favorite_candy,
			String food_allergies, boolean paid_in_full, boolean can_donate, String panels, String cosplays,
			String top_five_anime, String top_two_anime_characters, String top_five_kpop_groups,
			String top_two_ultimate_biases, String additional_info) {
		super();
		this.id = id;
		this.name = name;
		this.nickname = nick_name;
		this.password = password;
		this.favoritecolor = favorite_color;
		this.favoritecandy = favorite_candy;
		this.foodallergies = food_allergies;
		this.paidinfull = paid_in_full;
		this.candonate = can_donate;
		this.panels = panels;
		this.cosplays = cosplays;
		this.topfiveanime = top_five_anime;
		this.toptwoanimecharacters = top_two_anime_characters;
		this.topfivekpopgroups = top_five_kpop_groups;
		this.toptwoultimatebiases = top_two_ultimate_biases;
		this.additionalinfo = additional_info;
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

	public String getNick_name() {
		return nickname;
	}

	public void setNickname(String nick_name) {
		this.nickname = nick_name;
	}

	public String getFavoritecolor() {
		return favoritecolor;
	}

	public void setFavoritecolor(String favorite_color) {
		this.favoritecolor = favorite_color;
	}

	public String getFavoritecandy() {
		return favoritecandy;
	}

	public void setFavoritecandy(String favorite_candy) {
		this.favoritecandy = favorite_candy;
	}

	public String getFoodallergies() {
		return foodallergies;
	}

	public void setFoodallergies(String food_allergies) {
		this.foodallergies = food_allergies;
	}

	public boolean isPaidinfull() {
		return paidinfull;
	}

	public void setPaidinfull(boolean paid_in_full) {
		this.paidinfull = paid_in_full;
	}

	public boolean isCandonate() {
		return candonate;
	}

	public void setCandonate(boolean can_donate) {
		this.candonate = can_donate;
	}

	public String getPanels() {
		return panels;
	}

	public void setPanels(String panels) {
		this.panels = panels;
	}

	public String getCosplays() {
		return cosplays;
	}

	public void setCosplays(String cosplays) {
		this.cosplays = cosplays;
	}

	public String getTopfiveanime() {
		return topfiveanime;
	}

	public void setTopfiveanime(String top_five_anime) {
		this.topfiveanime = top_five_anime;
	}

	public String getToptwoanime_characters() {
		return toptwoanimecharacters;
	}

	public void setToptwoanimecharacters(String top_two_anime_characters) {
		this.toptwoanimecharacters = top_two_anime_characters;
	}

	public String getTopfivekpopgroups() {
		return topfivekpopgroups;
	}

	public void setTopfivekpopgroups(String top_five_kpop_groups) {
		this.topfivekpopgroups = top_five_kpop_groups;
	}

	public String getToptwoultimatebiases() {
		return toptwoultimatebiases;
	}

	public void setToptwoultimatebiases(String top_two_ultimate_biases) {
		this.toptwoultimatebiases = top_two_ultimate_biases;
	}

	public String getAdditionalinfo() {
		return additionalinfo;
	}

	public void setAdditionalinfo(String additional_info) {
		this.additionalinfo = additional_info;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalinfo == null) ? 0 : additionalinfo.hashCode());
		result = prime * result + (candonate ? 1231 : 1237);
		result = prime * result + ((cosplays == null) ? 0 : cosplays.hashCode());
		result = prime * result + ((favoritecandy == null) ? 0 : favoritecandy.hashCode());
		result = prime * result + ((favoritecolor == null) ? 0 : favoritecolor.hashCode());
		result = prime * result + ((foodallergies == null) ? 0 : foodallergies.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + (paidinfull ? 1231 : 1237);
		result = prime * result + ((panels == null) ? 0 : panels.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((topfiveanime == null) ? 0 : topfiveanime.hashCode());
		result = prime * result + ((topfivekpopgroups == null) ? 0 : topfivekpopgroups.hashCode());
		result = prime * result + ((toptwoanimecharacters == null) ? 0 : toptwoanimecharacters.hashCode());
		result = prime * result + ((toptwoultimatebiases == null) ? 0 : toptwoultimatebiases.hashCode());
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
		User other = (User) obj;
		if (additionalinfo == null) {
			if (other.additionalinfo != null)
				return false;
		} else if (!additionalinfo.equals(other.additionalinfo))
			return false;
		if (candonate != other.candonate)
			return false;
		if (cosplays == null) {
			if (other.cosplays != null)
				return false;
		} else if (!cosplays.equals(other.cosplays))
			return false;
		if (favoritecandy == null) {
			if (other.favoritecandy != null)
				return false;
		} else if (!favoritecandy.equals(other.favoritecandy))
			return false;
		if (favoritecolor == null) {
			if (other.favoritecolor != null)
				return false;
		} else if (!favoritecolor.equals(other.favoritecolor))
			return false;
		if (foodallergies == null) {
			if (other.foodallergies != null)
				return false;
		} else if (!foodallergies.equals(other.foodallergies))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		if (paidinfull != other.paidinfull)
			return false;
		if (panels == null) {
			if (other.panels != null)
				return false;
		} else if (!panels.equals(other.panels))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (topfiveanime == null) {
			if (other.topfiveanime != null)
				return false;
		} else if (!topfiveanime.equals(other.topfiveanime))
			return false;
		if (topfivekpopgroups == null) {
			if (other.topfivekpopgroups != null)
				return false;
		} else if (!topfivekpopgroups.equals(other.topfivekpopgroups))
			return false;
		if (toptwoanimecharacters == null) {
			if (other.toptwoanimecharacters != null)
				return false;
		} else if (!toptwoanimecharacters.equals(other.toptwoanimecharacters))
			return false;
		if (toptwoultimatebiases == null) {
			if (other.toptwoultimatebiases != null)
				return false;
		} else if (!toptwoultimatebiases.equals(other.toptwoultimatebiases))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", nick_name=" + nickname + ", password=" + password
				+ ", favorite_color=" + favoritecolor + ", favorite_candy=" + favoritecandy + ", food_allergies="
				+ foodallergies + ", paid_in_full=" + paidinfull + ", can_donate=" + candonate + ", panels="
				+ panels + ", cosplays=" + cosplays + ", top_five_anime=" + topfiveanime
				+ ", top_two_anime_characters=" + toptwoanimecharacters + ", top_five_kpop_groups="
				+ topfivekpopgroups + ", top_two_ultimate_biases=" + toptwoultimatebiases + ", additional_info="
				+ additionalinfo + "]";
	}

}
