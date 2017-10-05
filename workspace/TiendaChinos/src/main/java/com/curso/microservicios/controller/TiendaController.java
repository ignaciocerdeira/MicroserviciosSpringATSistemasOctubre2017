package com.curso.microservicios.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.microservicios.model.DatosPago;
import com.curso.microservicios.model.Producto;
import com.curso.microservicios.model.Usuario;

@RestController
@RequestMapping(value="/tienda")
public class TiendaController {

	public List<Producto> buscarPorTexto(String texto){
		return null;
		
	}
	public List<Producto> buscarPorPopularidad(int popularidad){
		return null;
		
	}
	public List<Producto> buscarDiezMasPopulares(){
		return null;
		
	}
	
	public long compra(Usuario usuario, Producto producto, int Cantidad, DatosPago datosPago) {
		return Cantidad;
		
	}
	
}
