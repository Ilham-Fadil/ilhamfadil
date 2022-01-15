package cigma.pfe.presentation;

import cigma.pfe.models.Client;
import cigma.pfe.services.*;

public class ClientController {
	IClientService iClientService;

	public IClientService getiClientService() {
		return iClientService;
	}

	public void setiClientService(IClientService iClientService) {
		this.iClientService = iClientService;
	}

	public ClientController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientController(IClientService iClientService) {
		this.iClientService = iClientService;
	}

	public Client save(Client c) {
		return iClientService.save(c);
	}

	public Client update(Client c) {
		return iClientService.update(c);
	}

	public IClientService getIClientService() {
		return iClientService;
	}
}
