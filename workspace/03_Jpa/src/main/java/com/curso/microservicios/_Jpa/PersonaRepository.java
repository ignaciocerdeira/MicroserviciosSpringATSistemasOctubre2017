package com.curso.microservicios._Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

	Persona findById(long id);
	
	List<Persona> findByNombre(String nombre);
	
	@Query("select p from Persona p where p.nombre = :name")
	List<Persona> busquedaPorNombre(@Param("name") String name);
	
}
