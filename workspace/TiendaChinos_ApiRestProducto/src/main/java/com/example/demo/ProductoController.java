package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/producto")
@RestController
public class ProductoController {
	
	@Autowired
	ProductoService producto;
	
	@RequestMapping(path="/{id}", method=RequestMethod.GET)
	public Producto getProducto(@PathVariable long id) {
		return null;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void altaProducto(@RequestBody Producto p) {
		producto.save(p);
	}
//	@RequestMapping(method = RequestMethod.PUT)
//	public void reducirCantidadProducto(@RequestBody Producto p) {
//		
//		if (p.getCantidad() < 0){
//			System.out.println("reducir cantidad");
//		}else {
//			System.out.println("recibidas unidades");
//		}
//		
//	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void modificarProducto(@RequestBody Producto p) {
		//El valor que haya en la cantidad del producto es el valor final de dicha cantidad
		//por lo que deberia existir otro microservicio que realice el calculo de la cantidad
	}
}
