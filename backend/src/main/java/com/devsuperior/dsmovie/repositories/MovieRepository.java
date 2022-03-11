package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;
/* muda para interface nome da classe e extends para jparepository entre chavess <informa o MOVIE e tipo LONG 
 * somente importar a classe CTRl+Shift+ O>*/
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
