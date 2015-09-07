package com.bankonet.metier;

import com.bankonet.dao.IClientDao;
import com.bankonet.model.Client;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("bankonetMetier")
public class BankonetMetier implements IBankonetMetier {

    @Resource(name="dao")
    private IClientDao dao;

    public BankonetMetier() {
    }

    @Override
    public void addClient(Client c) {
        dao.addClient(c);
    }

    @Override
    public Client getClient(int clientId) {
        return dao.getClientById(clientId);
    }

    @Override
    public List<Client> listClients() {
        return dao.listClients();
    }

    @Override
    public List<Client> findClients(String keyword) {
        return dao.findClients(keyword);
    }

    @Override
    public void updateClient(Client c) {
        dao.updateClient(c);
    }

    @Override
    public void deleteClient(int clientId) {
        dao.deleteClientById(clientId);
    }

    @Override
    public List<Client> deleteClientsWithNameContaining(String keyword) {
        for (Client client : dao.findClients(keyword)) {
            dao.deleteClientById(client.getId());
        }

        return dao.listClients();
    }


    public IClientDao getDao() {
        return dao;
    }

    public void setDao(IClientDao dao) {
        this.dao = dao;
    }

}
