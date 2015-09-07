package com.bankonet.metier;

import com.bankonet.dao.IClientDao;
import com.bankonet.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("bankonetMetier")
@Scope("singleton")
public class BankonetMetier implements IBankonetMetier {

    @Autowired @Qualifier("clientDao")
    private IClientDao clientDao;

    public BankonetMetier() {
    }

    @Override
    public void addClient(Client c) {
        clientDao.addClient(c);
    }

    @Override
    public Client getClientById(int clientId) {
        return clientDao.getClientById(clientId);
    }

    @Override
    public List<Client> listClients() {
        return clientDao.listClients();
    }

    @Override
    public List<Client> findClients(String keyword) {
        return clientDao.findClients(keyword);
    }

    @Override
    public void updateClient(Client c) {
        clientDao.updateClient(c);
    }

    @Override
    public void deleteClientById(int clientId) {
        clientDao.deleteClientById(clientId);
    }


    public IClientDao getClientDao() {
        return clientDao;
    }

    public void setClientDao(IClientDao clientDao) {
        this.clientDao = clientDao;
    }

}
