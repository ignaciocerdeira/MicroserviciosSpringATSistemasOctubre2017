package com.curso.microservicios._Jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="Personas")
public class PersonasController {

	@Autowired
	private PersonaRepository repository;
	
	//Consumes responde a la header content-type
	//POST locahost:8080/Personas
	@RequestMapping(method=RequestMethod.POST, consumes="application/json")
	public void insertarPersona(@RequestBody Persona persona){
		repository.save(persona);
	}
	
	//produces responde a la header a Accept
	//GET locahost:8080/Personas?nombre=Victor
	@RequestMapping(method=RequestMethod.GET, produces="application/json")
	public List<Persona> buscarPorNombre(@RequestParam String nombre){
		return repository.busquedaPorNombre(nombre);
	}
	
	//GET locahost:8080/Personas/1
	@RequestMapping(path="/{id}", method=RequestMethod.GET, produces="application/json")
	public Persona buscarPorId(@PathVariable long id){
		return repository.findById(id);
	}
}
