package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRespository repository;
	
	@Override
	public void save(Producto producto) {
		System.out.println("dado de alta producto");
		repository.save(producto);
	}

}
