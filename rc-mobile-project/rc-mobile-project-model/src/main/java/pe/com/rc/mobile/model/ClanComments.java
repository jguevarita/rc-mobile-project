package pe.com.rc.mobile.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import pe.com.rc.mobile.model.clan.Clan;

@Entity
@Table(name = "clan_comments")
public class ClanComments extends Record implements Serializable {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clan_id")
	private Clan clan;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	@Column(name = "desciption")
	private String description;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "game_id")
	private Game game;
	@Column(name = "stars_num")
	private Integer starsNum;

	public Clan getClan() {
		return clan;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Integer getStarsNum() {
		return starsNum;
	}

	public void setStarsNum(Integer starsNum) {
		this.starsNum = starsNum;
	}

}
