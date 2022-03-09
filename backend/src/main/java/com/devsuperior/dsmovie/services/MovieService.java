package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;
/*Esta anotacao ira registrar como movie service seria um componente da classe*/
@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	/*transactional com propriedade metodo de somente de leitura para mais eficiencia no banco de dados*/
	@Transactional(readOnly = true)
	public Page<MovieDTO>findAll(Pageable pageable) {
		/*Converte a pagina de MOVIE para MOVIEDTO e RETORNA a PAGE*/
		Page<Movie> result = repository.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		/*Converte a pagina de MOVIE para MOVIEDTO e RETORNA a PAGE*/
		Movie result = repository.findById(id).get();
		MovieDTO dto = new MovieDTO(result);
		return dto;
	}
}
