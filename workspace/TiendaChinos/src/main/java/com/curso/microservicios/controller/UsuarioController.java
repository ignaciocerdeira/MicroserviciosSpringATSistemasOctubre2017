package com.curso.microservicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curso.microservicios.service.UsuarioService;
import com.curso.microservicios.model.Usuario;

@RestController
@RequestMapping(value="/user")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuario;
	
	@RequestMapping(method = RequestMethod.POST)
	public void crearUsuario(@RequestBody Usuario u) {
		usuario.save(u);
	}

}
