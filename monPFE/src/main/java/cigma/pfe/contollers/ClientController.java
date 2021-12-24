package cigma.pfe.contollers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import cigma.pfe.services.ClientServiceImpl;

public class ClientController {
	ClientService clientService;
	

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
		System.out.println("Call ClientServiceImpl ....");
	}

	public Client save(Client c) {
		System.out.println("ClientController level...");
		return clientService.save(c);
	}
}
