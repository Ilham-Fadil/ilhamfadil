package com.cigma.demo.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cigma.demo.DAO.ClientDAO;
import com.cigma.demo.Models.Client;

@Service
@Transactional
public class ClientService implements IClientService {
	
	@Autowired
	ClientDAO clientDAO;
	


	public ClientService() {
		System.out.println("Call ClientServiceImpl ....");
	}

	@Transactional
	@Override
	public Client save(Client clt) {
		return clientDAO.save(clt);
	}

	@Transactional
	@Override
	public Client update(Client newClt) {
			Client oldClt = clientDAO.findById(newClt.getId()).get();
			oldClt.setName(newClt.getName());
			return clientDAO.save(oldClt);

	}

	@Transactional
	@Override
	public void remove(long idClt) {
		clientDAO.deleteById(idClt);
		}

	@Override
	public Client getOne(long idClt) {
		return clientDAO.findById(idClt).get();

	}

	@Override
	public List<Client> getAll() {
		return (List<Client>) clientDAO.findAll();
	}

}
