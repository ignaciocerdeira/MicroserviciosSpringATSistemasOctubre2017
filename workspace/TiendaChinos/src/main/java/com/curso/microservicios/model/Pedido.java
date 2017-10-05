package com.curso.microservicios.model;

public class Pedido {
	
	private long idPedido;
	
	// long idUsuario (1-n)
	private long idUsuario;
	
	//long idProducto (1-n)
	private long idProducto;
	
	//long idTransporte (1-1)
	private long idTransporte;
	
	private String estado;
	
	public Pedido(long idPedido, long idUsuario, long idProducto, long idTransporte, String estado) {
		super();
		this.idPedido = idPedido;
		this.setIdUsuario(idUsuario);
		this.setIdProducto(idProducto);
		this.setIdTransporte(idTransporte);
		this.estado = estado;
	}
	public long getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public long getIdTransporte() {
		return idTransporte;
	}
	public void setIdTransporte(long idTransporte) {
		this.idTransporte = idTransporte;
	}
	public long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
