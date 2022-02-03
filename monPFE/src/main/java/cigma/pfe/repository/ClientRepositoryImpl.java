package cigma.pfe.repository;

import cigma.pfe.models.Client;


public class ClientRepositoryImpl implements ClientRepository {
	
	public ClientRepositoryImpl() {
		System.out.println("Call ClientRepositoryImpl ....");
	}

	@Override
	public Client save(Client c) {
		System.out.println("DAO Layer : ClientRepositoryImpl Level");
		return null;
	}

}
