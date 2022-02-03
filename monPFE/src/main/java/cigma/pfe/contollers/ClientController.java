package cigma.pfe.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import cigma.pfe.services.ClientServiceImpl;

@Component

public class ClientController {
	@Autowired
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
