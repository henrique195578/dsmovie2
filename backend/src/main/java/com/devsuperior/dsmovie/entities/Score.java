package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

	/*CHAVE COMPOSTA Criar classe auxiliar de MOVIE E USER para que seja identificado como chave primaria*/
	/*@embedidid devido ser uma chave primaria com outras informacoes dentro da classa*/
	@EmbeddedId
	private ScorePK id = new ScorePK();
	
	private Double value;
	
	public Score() {
		
	}
	
	/*Metodo set para associar o feedback com filme especifico entao ira chamar o Movie para salvar a referencia*/
	public void setMovie(Movie movie) {
		id.setMovie(movie);
		}
	/*Informa o ID do usuario e passa para ScorePK qual usuario votou no filme */
	public void setUser(User user) {
		id.setUser(user);
		
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
