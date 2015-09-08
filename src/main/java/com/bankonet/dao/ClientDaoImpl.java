package com.bankonet.dao;


import com.bankonet.model.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository("dao")
public class ClientDaoImpl implements IClientDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addClient(Client c) {
        entityManager.persist(c);
    }

    @Override
    public Client getClientById(int clientId) {
        return entityManager.find(Client.class, clientId);
    }

    @Override
    public List<Client> listClients() {
        return entityManager.createQuery("SELECT c FROM Client c").getResultList();
    }

    @Override
    public List<Client> findClients(String keyword) {
        Query query = entityManager.createQuery(
                "SELECT c " +
                        "FROM Client c " +
                        "WHERE UPPER(c.firstname) LIKE UPPER(:filter) " +
                        "   OR UPPER(c.lastname) LIKE UPPER(:filter)"
        );
        query.setParameter("filter", "%"+keyword+"%");

        return query.getResultList();
    }

    @Override
    public void updateClient(Client c) {
        entityManager.merge(c);
    }

    @Override
    public void deleteClientById(int clientId) {
        Client c = entityManager.find(Client.class, clientId);
        entityManager.remove(c);
    }
}
