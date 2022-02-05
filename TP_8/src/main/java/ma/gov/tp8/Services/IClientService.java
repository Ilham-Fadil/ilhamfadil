package ma.gov.tp8.Services;

import ma.gov.tp8.models.Client;

public interface IClientService {
	Client save(Client clt);
	void update();
	Client findById();
	void remove();
}
