package ma.rest.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.rest.demo.Models.Client;
import ma.rest.demo.Service.IService;

@RestController
@RequestMapping("/clients")
public class ClientController {
	@Autowired
	IService service;

	@GetMapping("/all")
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Optional<Client> getOne(@PathVariable("id") long id) {
		return service.getOne(id);
	}
	
	@PostMapping("/add")
	public void save(@RequestBody Client client) {
		service.save(client);
	}

	@PutMapping("/update")
	public void update(@RequestBody Client client) {
		service.update(client);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		service.delete(id);
	}
}
