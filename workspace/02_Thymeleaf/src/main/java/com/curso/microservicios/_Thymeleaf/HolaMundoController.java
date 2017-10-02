package com.curso.microservicios._Thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaMundoController {

	@RequestMapping(path="/")
	public String holaMundo() {
		return "index";
	}
}
