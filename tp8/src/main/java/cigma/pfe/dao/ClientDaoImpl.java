package cigma.pfe.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cigma.pfe.models.Client;

@Repository
public class ClientDaoImpl implements IClientDao{

    @PersistenceContext
    EntityManager em;



    @Override
    public Client save(Client c) {
        em.persist(c);
        return null;
    }

    public ClientDaoImpl(){}

	@Override
	public Client update() {
		Client c = em.find(Client.class, 1);
		c.setName("ilham");
		return null;
	}
}
