package com.curso.microservicios.model;

public class Usuario {
	
	private long idUsuario;
	private String nombre;
	private String apellidos;
	// long idDireccion (1-1)
	private long idDireccion;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(long idUsuario, String nombre, String apellidos, long idDireccion) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.setIdDireccion(idDireccion);
	}
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public long getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(long idDireccion) {
		this.idDireccion = idDireccion;
	}
	
	

}
