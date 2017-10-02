package com.curso.microservicios._Thymeleaf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

@Component
public class ListEndPoints extends AbstractEndpoint<List<Endpoint>> {
	private List<Endpoint> endpoints;

	@Autowired
	public ListEndPoints(List<Endpoint> endpoints) {
		super("listEndpoints");
		this.endpoints = endpoints;
	}

	public List<Endpoint> invoke() {
		return this.endpoints;
	}
}
