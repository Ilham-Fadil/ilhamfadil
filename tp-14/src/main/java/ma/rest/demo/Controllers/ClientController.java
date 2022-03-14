package ma.rest.demo.Controllers;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import ma.rest.demo.Models.Client;

@Controller
public class ClientController {

	@Value("${api.url}")
	private String apiUrl;
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = { "/", "/all" })
	public String getAll(Model model) {
		model.addAttribute("client", new Client());
		List<Client> clients = restTemplate.getForObject(apiUrl + "/clients/all", List.class);
		model.addAttribute("clients", clients);
		return "NewFile";
	}

	@PostMapping(value = "/add-client")
	public String addClient(Model model, @ModelAttribute("client") Client client) {
		restTemplate.postForObject(apiUrl + "/clients/add", client, Client.class);
		return "redirect:/all";
	}
	@GetMapping(value = "/show-client/{id}")
	public String updateClient(Model model, @PathVariable long id, @ModelAttribute("client") Client client) {
		try {
			client.setId(id);
			restTemplate.postForObject(apiUrl + "/clients/update", client, Client.class);
			return "redirect:/all";
		} catch (Exception e) {
			String errString = e.getMessage();
			model.addAttribute(errString);
			return "update";
		}
		//restTemplate.postForObject(apiUrl + "/clients/update", client, Client.class);
		
	}
	@GetMapping(value = { "/delete-client/{id}" })
	public String deleteClientById(Model model, @PathVariable long id) {
		restTemplate.delete(apiUrl + "/clients/" + id);
		return "redirect:/all";
	}
}
