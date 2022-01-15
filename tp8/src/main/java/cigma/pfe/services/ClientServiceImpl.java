package cigma.pfe.services;

import cigma.pfe.dao.IClientDao;
import cigma.pfe.models.Client;

public class ClientServiceImpl implements IClientService{
	IClientDao iClientDao;
	
	public ClientServiceImpl(IClientDao iClientDao){
        this.iClientDao = iClientDao;
    }

	public IClientDao getiClientDao() {
        return iClientDao;
    }
	@Override
	public Client save(Client c) {
		return iClientDao.save(c);
	}

	@Override
	public Client update() {
		return iClientDao.update();
	}

}
