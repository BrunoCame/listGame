package com.devsuperior.listGame.dto;

import java.util.Objects;

import com.devsuperior.listGame.entities.Game;

public class GameDTO {
	
	private Long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;
	private String descrisaoCurta;
	
	public GameDTO() {
		
	}

	public GameDTO(Game entity) {
		id = entity.getId();
		titulo = entity.getTitulo();
		ano = entity.getAno();
		imgUrl = entity.getImgUrl();
		descrisaoCurta = entity.getDescrisaoCurta();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getDescrisaoCurta() {
		return descrisaoCurta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameDTO other = (GameDTO) obj;
		return Objects.equals(id, other.id);
	}
}
