package ma.gov.tp8.controllers;


import ma.gov.tp8.Services.IClientService;
import ma.gov.tp8.models.Client;

public class ClientController {
	IClientService clientService;
	


	public ClientController() {
		
	}

	public ClientController(IClientService clientService) {
		this.clientService = clientService;
		}

	public Client save(Client c) {
		return clientService.save(c);
	}
	
	public void update() {
		clientService.update();
	}
	
	public Client findById() {
		return clientService.findById();
	}
	public void remove() {
		clientService.remove();
	}
}
