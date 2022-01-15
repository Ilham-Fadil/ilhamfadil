package cigma.pfe.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import cigma.pfe.models.Client;

public class ClientDaoImpl implements IClientDao{

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em =emf.createEntityManager();



    @Override
    public Client save(Client c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return null;
    }

    public ClientDaoImpl(){}

	@Override
	public Client update() {
		Client c = em.find(Client.class, 1);
		em.getTransaction().begin();
		c.setName("ilham");
        em.getTransaction().commit();

		return null;
	}
}
