package com.curso.microservicios._Jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Reciver {
	@JmsListener(destination = "mailbox")
	public void receiveMessage(Persona persona) {
		System.out.println("Received <" + persona + ">");
	}
}
