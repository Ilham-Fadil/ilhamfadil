package ma.gov.tp8.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ma.gov.tp8.models.Client;
import ma.gov.tp8.models.Facture;

@Repository
public class FactureDao implements DAO<Facture> {

	@PersistenceContext
	EntityManager em;

	public FactureDao() {

	}

	@Override
	public Facture save(Facture t) {
		em.persist(t);
		return null;
	}

	@Override
	public List<Facture> findAll() {
		Query query = em.createQuery("select f.id from facture f");
		ArrayList<Facture> factures = (ArrayList<Facture>) query.getResultList();
		return factures;
	}

	@Override
	public Facture findById(Long id) {
		Facture fac = em.find(Facture.class, id);
		return fac;
	}

	@Override
	public void update(Facture t) {
		Facture f = findById(t.getId());
		f.setDescription(t.getDescription());
	}

	@Override
	public void remove(Long id) {
		Facture f = findById(id);
		em.remove(f);
	}

}
