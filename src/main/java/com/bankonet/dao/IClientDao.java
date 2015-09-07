package com.bankonet.dao;


import com.bankonet.model.Client;

import java.util.List;

public interface IClientDao {

    // Create
    public void addClient(Client c);

    // Retreive
    public Client getClientById(int clientId);
    public List<Client> listClients();
    public List<Client> findClients(String keyword);

    // Update
    public void updateClient(Client c);

    //Delete
    public void deleteClientById(int clientId);

}
