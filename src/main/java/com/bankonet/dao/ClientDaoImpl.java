package com.bankonet.dao;


import com.bankonet.model.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("dao")
public class ClientDaoImpl implements IClientDao {

    @Override
    public void addClient(Client c) {
        System.out.println("ClientDaoImpl.addClient --> Client ajouté");
    }

    @Override
    public Client getClientById(int clientId) {
        System.out.println("ClientDaoImpl.getClientById");
        return null;
    }

    @Override
    public List<Client> listClients() {
        System.out.println("ClientDaoImpl.listClients");
        return new ArrayList<>();
    }

    @Override
    public List<Client> findClients(String keyword) {
        System.out.println("ClientDaoImpl.findClients");
        return new ArrayList<>();
    }

    @Override
    public void updateClient(Client c) {
        System.out.println("ClientDaoImpl.updateClient --> Client modifié");
    }

    @Override
    public void deleteClientById(int clientId) {
        System.out.println("ClientDaoImpl.listClients --> Client supprimé");
    }
}
