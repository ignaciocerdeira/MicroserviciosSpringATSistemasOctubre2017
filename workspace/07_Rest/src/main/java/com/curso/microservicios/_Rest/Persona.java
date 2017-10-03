package com.curso.microservicios._Rest;

import java.io.Serializable;

public class Persona implements Serializable{

	private long id;
	
	private String nombre;
	
	private Direccion direccion;

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

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
}
