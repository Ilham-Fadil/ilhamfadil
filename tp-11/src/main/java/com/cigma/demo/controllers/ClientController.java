package com.cigma.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cigma.demo.Models.Client;
import com.cigma.demo.Services.IClientService;

@Controller("ctrl")
public class ClientController {
	@Autowired
	IClientService clientService;

	public ClientController() {
		System.out.println("Call ClientRepositoryImpl ....");
	}

	public ClientController(IClientService clientService) {
		this.clientService = clientService;
	}

	public Client save(Client c) {
		return clientService.save(c);
	}

	public void update(Client clt) {
		clientService.update(clt);
	}

	public void remove(long id) {
		clientService.remove(id);
	}

	public Client getOne(long idClt) {
		return clientService.getOne(idClt);
	}

	public List<Client> getAll() {
		return clientService.getAll();
	}
}
