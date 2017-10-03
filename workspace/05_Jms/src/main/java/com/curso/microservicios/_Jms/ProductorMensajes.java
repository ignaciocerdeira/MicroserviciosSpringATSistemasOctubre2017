package com.curso.microservicios._Jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductorMensajes {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@RequestMapping(path="/Enviar", method=RequestMethod.POST)
	public void enviarMensaje(@RequestBody Persona persona){
		jmsTemplate.convertAndSend("mailbox", persona);
	}
	
}
