package com.bankonet.metier;


import com.bankonet.model.Client;

import java.util.List;


public interface IBankonetMetier {
    public void addClient(Client c);
    public Client getClientById(int clientId);
    public List<Client> listClients();
    public List<Client> findClients(String keyword);
    public void updateClient(Client c);
    public void deleteClientById(int clientId);
}
