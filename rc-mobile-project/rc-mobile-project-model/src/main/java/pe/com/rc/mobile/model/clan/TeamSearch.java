package pe.com.rc.mobile.model.clan;

import java.util.List;

public class TeamSearch {

	public static class TeamSearchResponse {
		private Long clanId;
		private Long gameId;
		private String clanName;
		private String gameName;
		List<TeamMembers> members;

		public Long getClanId() {
			return clanId;
		}

		public void setClanId(Long clanId) {
			this.clanId = clanId;
		}

		public Long getGameId() {
			return gameId;
		}

		public void setGameId(Long gameId) {
			this.gameId = gameId;
		}

		public String getClanName() {
			return clanName;
		}

		public void setClanName(String clanName) {
			this.clanName = clanName;
		}

		public String getGameName() {
			return gameName;
		}

		public void setGameName(String gameName) {
			this.gameName = gameName;
		}

		public List<TeamMembers> getMembers() {
			return members;
		}

		public void setMembers(List<TeamMembers> members) {
			this.members = members;
		}

	}

	public static class TeamMembers {
		private Long userId;
		private String name;
		private String type;

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

	}

	public static class TeamSearchRequest {
		private Integer gameId;
		private String criteria;

		public Integer getGameId() {
			return gameId;
		}

		public void setGameId(Integer gameId) {
			this.gameId = gameId;
		}

		public String getCriteria() {
			return criteria;
		}

		public void setCriteria(String criteria) {
			this.criteria = criteria;
		}
	}

	public static class TeamBuildRequest {
		private Long gameId;
		private Long userId;
		private String nombre;
		private String abreviatura;
		private String descripcion;
		private String imgUrl;
		private String pais;

		public Long getGameId() {
			return gameId;
		}

		public void setGameId(Long gameId) {
			this.gameId = gameId;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getAbreviatura() {
			return abreviatura;
		}

		public void setAbreviatura(String abreviatura) {
			this.abreviatura = abreviatura;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getImgUrl() {
			return imgUrl;
		}

		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}

		public String getPais() {
			return pais;
		}

		public void setPais(String pais) {
			this.pais = pais;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

	}
}
