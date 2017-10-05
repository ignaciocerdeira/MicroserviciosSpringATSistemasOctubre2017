package com.curso.microservicios.service;

import org.springframework.stereotype.Service;

import com.curso.microservicios.model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Override
	public void save(Usuario Usuario) {
		System.out.println("hemos creado el usuario");
	}

}
