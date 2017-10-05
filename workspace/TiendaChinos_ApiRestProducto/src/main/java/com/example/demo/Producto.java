package com.example.demo;

public class Producto {

	// long idUsuario
	private long idUsuario;
	private String nombre;
	private String descripcion;
	private int popularidad;
	private int cantidad; //CantidadDeProducto
	private double precio;
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(long idUsuario, String nombre, String descripcion, int popularidad, int cantidad, double precio) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.popularidad = popularidad;
		this.cantidad = cantidad;
		this.precio = precio;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPopularidad() {
		return popularidad;
	}
	public void setPopularidad(int popularidad) {
		this.popularidad = popularidad;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
