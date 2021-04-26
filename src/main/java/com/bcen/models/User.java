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
	private String nick_name;
	/*
	 * Do not send passwords to the frontend.
	 */
	@Column
	private String password;
	@Column
	private String favorite_color;
	@Column
	private String favorite_candy;
	/*
	 * Ideally, you would want to keep data atomic as you are not in first normal
	 * formal form if you do not. That said, for simplicity's sake, we will store
	 * all collections' data as comma separated lists in our DB.
	 */
	@Column
	private String food_allergies;
	@Column
	private boolean paid_in_full;
	@Column
	private boolean can_donate;
	@Column
	private String panels;
	@Column
	private String cosplays;
	@Column
	private String top_five_anime;
	@Column
	private String top_two_anime_characters;
	@Column
	private String top_five_kpop_groups;
	@Column
	private String top_two_ultimate_biases;
	@Column
	private String additional_info;

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
		this.nick_name = nick_name;
		this.password = password;
		this.favorite_color = favorite_color;
		this.favorite_candy = favorite_candy;
		this.food_allergies = food_allergies;
		this.paid_in_full = paid_in_full;
		this.can_donate = can_donate;
		this.panels = panels;
		this.cosplays = cosplays;
		this.top_five_anime = top_five_anime;
		this.top_two_anime_characters = top_two_anime_characters;
		this.top_five_kpop_groups = top_five_kpop_groups;
		this.top_two_ultimate_biases = top_two_ultimate_biases;
		this.additional_info = additional_info;
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
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getFavorite_color() {
		return favorite_color;
	}

	public void setFavorite_color(String favorite_color) {
		this.favorite_color = favorite_color;
	}

	public String getFavorite_candy() {
		return favorite_candy;
	}

	public void setFavorite_candy(String favorite_candy) {
		this.favorite_candy = favorite_candy;
	}

	public String getFood_allergies() {
		return food_allergies;
	}

	public void setFood_allergies(String food_allergies) {
		this.food_allergies = food_allergies;
	}

	public boolean isPaid_in_full() {
		return paid_in_full;
	}

	public void setPaid_in_full(boolean paid_in_full) {
		this.paid_in_full = paid_in_full;
	}

	public boolean isCan_donate() {
		return can_donate;
	}

	public void setCan_donate(boolean can_donate) {
		this.can_donate = can_donate;
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

	public String getTop_five_anime() {
		return top_five_anime;
	}

	public void setTop_five_anime(String top_five_anime) {
		this.top_five_anime = top_five_anime;
	}

	public String getTop_two_anime_characters() {
		return top_two_anime_characters;
	}

	public void setTop_two_anime_characters(String top_two_anime_characters) {
		this.top_two_anime_characters = top_two_anime_characters;
	}

	public String getTop_five_kpop_groups() {
		return top_five_kpop_groups;
	}

	public void setTop_five_kpop_groups(String top_five_kpop_groups) {
		this.top_five_kpop_groups = top_five_kpop_groups;
	}

	public String getTop_two_ultimate_biases() {
		return top_two_ultimate_biases;
	}

	public void setTop_two_ultimate_biases(String top_two_ultimate_biases) {
		this.top_two_ultimate_biases = top_two_ultimate_biases;
	}

	public String getAdditional_info() {
		return additional_info;
	}

	public void setAdditional_info(String additional_info) {
		this.additional_info = additional_info;
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
		result = prime * result + ((additional_info == null) ? 0 : additional_info.hashCode());
		result = prime * result + (can_donate ? 1231 : 1237);
		result = prime * result + ((cosplays == null) ? 0 : cosplays.hashCode());
		result = prime * result + ((favorite_candy == null) ? 0 : favorite_candy.hashCode());
		result = prime * result + ((favorite_color == null) ? 0 : favorite_color.hashCode());
		result = prime * result + ((food_allergies == null) ? 0 : food_allergies.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nick_name == null) ? 0 : nick_name.hashCode());
		result = prime * result + (paid_in_full ? 1231 : 1237);
		result = prime * result + ((panels == null) ? 0 : panels.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((top_five_anime == null) ? 0 : top_five_anime.hashCode());
		result = prime * result + ((top_five_kpop_groups == null) ? 0 : top_five_kpop_groups.hashCode());
		result = prime * result + ((top_two_anime_characters == null) ? 0 : top_two_anime_characters.hashCode());
		result = prime * result + ((top_two_ultimate_biases == null) ? 0 : top_two_ultimate_biases.hashCode());
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
		if (additional_info == null) {
			if (other.additional_info != null)
				return false;
		} else if (!additional_info.equals(other.additional_info))
			return false;
		if (can_donate != other.can_donate)
			return false;
		if (cosplays == null) {
			if (other.cosplays != null)
				return false;
		} else if (!cosplays.equals(other.cosplays))
			return false;
		if (favorite_candy == null) {
			if (other.favorite_candy != null)
				return false;
		} else if (!favorite_candy.equals(other.favorite_candy))
			return false;
		if (favorite_color == null) {
			if (other.favorite_color != null)
				return false;
		} else if (!favorite_color.equals(other.favorite_color))
			return false;
		if (food_allergies == null) {
			if (other.food_allergies != null)
				return false;
		} else if (!food_allergies.equals(other.food_allergies))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nick_name == null) {
			if (other.nick_name != null)
				return false;
		} else if (!nick_name.equals(other.nick_name))
			return false;
		if (paid_in_full != other.paid_in_full)
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
		if (top_five_anime == null) {
			if (other.top_five_anime != null)
				return false;
		} else if (!top_five_anime.equals(other.top_five_anime))
			return false;
		if (top_five_kpop_groups == null) {
			if (other.top_five_kpop_groups != null)
				return false;
		} else if (!top_five_kpop_groups.equals(other.top_five_kpop_groups))
			return false;
		if (top_two_anime_characters == null) {
			if (other.top_two_anime_characters != null)
				return false;
		} else if (!top_two_anime_characters.equals(other.top_two_anime_characters))
			return false;
		if (top_two_ultimate_biases == null) {
			if (other.top_two_ultimate_biases != null)
				return false;
		} else if (!top_two_ultimate_biases.equals(other.top_two_ultimate_biases))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", nick_name=" + nick_name + ", password=" + password
				+ ", favorite_color=" + favorite_color + ", favorite_candy=" + favorite_candy + ", food_allergies="
				+ food_allergies + ", paid_in_full=" + paid_in_full + ", can_donate=" + can_donate + ", panels="
				+ panels + ", cosplays=" + cosplays + ", top_five_anime=" + top_five_anime
				+ ", top_two_anime_characters=" + top_two_anime_characters + ", top_five_kpop_groups="
				+ top_five_kpop_groups + ", top_two_ultimate_biases=" + top_two_ultimate_biases + ", additional_info="
				+ additional_info + "]";
	}

}
