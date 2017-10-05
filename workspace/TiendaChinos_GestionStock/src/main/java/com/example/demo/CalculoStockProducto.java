package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculoStockProducto {
	
	@Autowired
	private ServicioGestionStock servicio;
	
	//Libertad absoluta, no tenemos porque seguir el estandar REST
	@RequestMapping(path="reducirCantidadProducto/idProducto/{idProducto}/cantidad/{cantidad}")
	public void reducirCantidadProducto(long idProducto, int cantidad) {
		servicio.reducirCantidadProducto(idProducto, cantidad);
	}

}
