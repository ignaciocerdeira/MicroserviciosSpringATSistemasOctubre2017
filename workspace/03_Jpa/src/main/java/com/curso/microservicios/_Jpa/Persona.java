package com.curso.microservicios._Jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona implements Serializable{

	@Id
	private long id;
	
	private String nombre;

	public Persona(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
