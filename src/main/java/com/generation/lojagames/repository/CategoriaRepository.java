package com.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojagames.modal.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List <Categoria> findAllByTipoContainingIgnoreCase(String tipo);
	
	/*select * from tb_postagens where tipo like "%%"
	select -> find
	* -> All
	where -> By
	Like -> Containing
	IgnoreCase - ignora o maiusculo e minusculo */
}
