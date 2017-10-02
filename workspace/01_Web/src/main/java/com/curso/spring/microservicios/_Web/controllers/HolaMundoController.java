package com.curso.spring.microservicios._Web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

	@RequestMapping(path="/")
	public String holaMundo() {
		return "Hola Mundo!!!!!";
	}
}
