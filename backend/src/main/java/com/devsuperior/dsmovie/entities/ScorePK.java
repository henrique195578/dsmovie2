package com.devsuperior.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ScorePK implements Serializable{
	private static final long serialVersionUID = 1L;

	/*@Manytoone faz com identifique o id do filme*/
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	
	/*@Manytoone faz com identifique o id do usuario igual o movie_id*/
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	/*Criar getter e setter aqui para sistema entenda quem sao as chaves primarias*/
	public ScorePK() {
		
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}	
}