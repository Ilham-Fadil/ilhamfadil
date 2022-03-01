package com.cigma.demo.Services;

import java.util.List;

import com.cigma.demo.Models.Client;

public interface IClientService {
	Client save(Client clt);
	Client update(Client client);
	void remove(long idClt);
	Client getOne(long idClt);
	List<Client> getAll();

}
