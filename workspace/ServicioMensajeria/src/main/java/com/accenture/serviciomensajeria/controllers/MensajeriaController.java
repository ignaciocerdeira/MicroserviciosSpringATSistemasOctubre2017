package com.accenture.serviciomensajeria.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.serviciomensajeria.dto.TransporteDto;
import com.accenture.serviciomensajeria.services.MensajeriaServicioInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(path = "/Transporte")
public class MensajeriaController {

	@Autowired
	private MensajeriaServicioInterface servicio;

	/*
	{
		idCliente: 1,
		contacto: {
			persona: Victor,
			direccion: calle mayor, 1
		},
		idPedido: 12345
	}
	*/
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Long> altaTransporte(@RequestBody TransporteDto transporte) {
		//return new ResponseEntity<Long>(servicio.altaTransporte(transporte), HttpStatus.OK);
		return null;
	}
}
