package ma.gov.tp8.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.tp8.DAO.DAO;
import ma.gov.tp8.models.Facture;


@Service
public class FactureService implements IService<Facture> {
	
	@Autowired
	DAO<Facture> dao;
	
	
	public FactureService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Transactional
	@Override
	public Facture save(Facture t) {
		return dao.save(t);
	}

	@Transactional
	@Override
	public List<Facture> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Transactional
	@Override
	public void update(Facture t) {
		dao.update(t);
	}

	@Transactional
	@Override
	public Facture findById(Long id) {
		return dao.findById(id);
	}

	@Transactional
	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

}
