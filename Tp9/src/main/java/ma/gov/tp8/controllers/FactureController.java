package ma.gov.tp8.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ma.gov.tp8.Services.IService;
import ma.gov.tp8.models.Facture;


@Controller("ctrl1")
public class FactureController {
	
	@Autowired
	IService<Facture> service;

	public FactureController() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Facture> findAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}
	public Facture save(Facture f) {
		return service.save(f);
	}
	
	public void update(Facture t) {
		service.update(t);
	}

	public Facture findById(Long id) {
		return service.findById(id);
	}

	public void remove(Long id) {
		service.remove(id);
	}
}
