package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repository.ClientRepository;
import cigma.pfe.repository.ClientRepositoryImpl;

public class ClientServiceImpl implements ClientService {

	ClientRepository clientRepository;

	
	public ClientServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientServiceImpl(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
		System.out.println("Call ClientServiceImpl ....");
	}

	@Override
	public Client save(Client c) {
		System.out.println("Service Layer : ClientServiceImpl Level... ");
		return clientRepository.save(c);
	}
}
