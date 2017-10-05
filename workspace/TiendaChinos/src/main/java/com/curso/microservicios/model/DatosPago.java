package com.curso.microservicios.model;

public class DatosPago {
	
	private long numTarjeta;
	private String cvc;
	private int mes;
	private int anyo;
	private String nombreApellidos;
	
	public DatosPago(long numTarjeta, String cvc, int mes, int anyo, String nombreApellidos) {
		super();
		this.numTarjeta = numTarjeta;
		this.cvc = cvc;
		this.mes = mes;
		this.anyo = anyo;
		this.nombreApellidos = nombreApellidos;
	}
	public long getNumTarjeta() {
		return numTarjeta;
	}
	public void setNumTarjeta(long numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
	public String getCvc() {
		return cvc;
	}
	public void setCvc(String cvc) {
		this.cvc = cvc;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public String getNombreApellidos() {
		return nombreApellidos;
	}
	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}
	
	
}
