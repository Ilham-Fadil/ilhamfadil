package ma.rest.demo.Service;

import java.util.List;
import java.util.Optional;

import ma.rest.demo.Models.Client;


public interface IService {
	 List<Client>  getAll();
		Optional<Client> getOne(long id);
		void save(Client client);
		void update(Client client);
		void delete(long id);
}
