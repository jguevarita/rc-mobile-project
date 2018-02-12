package pe.com.rc.mobile.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import pe.com.rc.mobile.model.clan.Clan;

@Entity
@Table(name = "solicitude")
public class Solicitude extends Record implements Serializable {

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clan_id")
	private Clan clan;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id")
	private State state;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "solicitude_type_id")
	private SolicitudeType solicitudeType;

	public Solicitude() {
		
	}
	
	public Solicitude(Long id) {
		this.setId(id);
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Clan getClan() {
		return clan;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public SolicitudeType getSolicitudeType() {
		return solicitudeType;
	}

	public void setSolicitudeType(SolicitudeType solicitudeType) {
		this.solicitudeType = solicitudeType;
	}

}
