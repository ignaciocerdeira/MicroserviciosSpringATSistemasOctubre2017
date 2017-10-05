package com.curso.microservicios.model;

public class Direccion {

	private long idDireccion;
	private String calle;
	private String numero;
	private int piso;
	private String letra;
	private String ciudad;
	private String provincia;
	
	public Direccion(long idDireccion, String calle, String numero, int piso, String letra, String ciudad,
			String provincia) {
		super();
		this.idDireccion = idDireccion;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.letra = letra;
		this.ciudad = ciudad;
		this.provincia = provincia;
	}
	public long getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(long idDireccion) {
		this.idDireccion = idDireccion;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
}
