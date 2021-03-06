package pe.com.rc.mobile.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "solicitude_type")
public class SolicitudeType extends Record implements Serializable {

	@Column(name = "description")
	private String description;

	public SolicitudeType() {

	}

	public SolicitudeType(Long id) {
		this.setId(id);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
