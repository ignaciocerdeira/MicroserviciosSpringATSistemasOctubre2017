package com.curso.microservicios._Rest;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Persona")
public class PersonaRestController {

	//Alta
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void post(@RequestBody Persona persona){
		
	}
	
	//Consulta por Id
	@RequestMapping(path="/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Persona get(@PathVariable long id){
		return null;
	}
	
	//Consulta de todos
	//y
	//Consulta por nombre
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Persona> get(@RequestParam(required=false) String nombre){
		
		if(nombre != null){
			//Consulta por nombre
		} else {
			//Consulta de todos
		}
		return null;
	}
	
	//Consulta de la relacion entre Direccion y Persona
	@RequestMapping(path="/{id}/Direcciones", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Direccion> getDirecciones(@PathVariable long id){
		return null;
	}
	
	//Modificacion
	@RequestMapping(method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void put(@RequestBody Persona persona){
		
	}
	
	//Borrado
	@RequestMapping(path="/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable long id){
		
	}
}
