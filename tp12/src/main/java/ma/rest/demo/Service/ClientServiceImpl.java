package ma.rest.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.rest.demo.DAO.IClientDAO;
import ma.rest.demo.Models.Client;

@Service
public class ClientServiceImpl implements IService{

	@Autowired
	IClientDAO clientDAO;
	
	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return clientDAO.findAll();
	}

	@Override
	public Optional<Client> getOne(long id) {
		Optional<Client> c = clientDAO.findById(id);
		return c;
	}

	@Override
	public void save(Client client) {
		clientDAO.save(client);
	}

	@Override
	public void update(Client client) {
		Optional<Client> c = clientDAO.findById(client.getId());
		if(c != null) {
			c.get().setName(client.getName());
		}
	}

	@Override
	public void delete(long id) {
		clientDAO.deleteById(id);;
	}


}
