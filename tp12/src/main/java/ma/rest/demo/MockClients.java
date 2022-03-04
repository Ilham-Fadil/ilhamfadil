package ma.rest.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ma.rest.demo.DAO.IClientDAO;
import ma.rest.demo.Models.Client;

@Component
public class MockClients implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(MockClients.class);
	@Autowired
	private IClientDAO clientRepository;


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
				Client c1 = new Client("Omar");
				Client c2 = new Client("Said");
				Client c3 = new Client("Ahmed");
				Client c4 = new Client("Farah");
				clientRepository.save(c1);
				clientRepository.save(c2);
				clientRepository.save(c3);
				clientRepository.save(c4);
				clientRepository.findAll().forEach(c ->
				System.out.println
				(c)
				);
	}

}
