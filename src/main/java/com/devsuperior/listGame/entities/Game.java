package com.devsuperior.listGame.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private Integer ano;
	private String genero;
	private String plataforma;
	private Double preco;
	private String imgUrl;
	@Column(columnDefinition = "TEXT")
	private String descrisaoCurta;
	@Column(columnDefinition = "TEXT")
	private String descrisaoLonga;
	
	public Game() {	
	}

	public Game(Long id, String titulo, Integer ano, String genero, String plataforma, Double preco, String imgUrl,
			String descrisaoCurta, String descrisaoLonga) {
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.plataforma = plataforma;
		this.preco = preco;
		this.imgUrl = imgUrl;
		this.descrisaoCurta = descrisaoCurta;
		this.descrisaoLonga = descrisaoLonga;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDescrisaoCurta() {
		return descrisaoCurta;
	}

	public void setDescrisaoCurta(String descrisaoCurta) {
		this.descrisaoCurta = descrisaoCurta;
	}

	public String getDescrisaoLonga() {
		return descrisaoLonga;
	}

	public void setDescrisaoLonga(String descrisaoLonga) {
		this.descrisaoLonga = descrisaoLonga;
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
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}	
}
