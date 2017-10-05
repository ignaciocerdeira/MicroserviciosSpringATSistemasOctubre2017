package com.curso.microservicios.model;

public class Cliente {
	
	private long idCliente;
	private String tarifa;
	private String cuentaCorriente;
	
	
	
	public Cliente(long idCliente, String tarifa, String cuentaCorriente) {
		super();
		this.idCliente = idCliente;
		this.tarifa = tarifa;
		this.cuentaCorriente = cuentaCorriente;
	}
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getTarifa() {
		return tarifa;
	}
	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}
	public String getCuentaCorriente() {
		return cuentaCorriente;
	}
	public void setCuentaCorriente(String cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}
	
	
}
