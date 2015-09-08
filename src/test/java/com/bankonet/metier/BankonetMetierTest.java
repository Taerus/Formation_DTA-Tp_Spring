package com.bankonet.metier;

import com.bankonet.model.Client;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class BankonetMetierTest {

    @Test
    public void testBankonetMetier() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        IBankonetMetier bankonetMetier = (IBankonetMetier) context.getBean("bankonetMetier");

        List<Client> clients = bankonetMetier.listClients();
        System.out.println(clients.size());
        for(Client client : clients) {
            System.out.println(client);
        }

        clients = bankonetMetier.findClients("oyer");
        System.out.println(clients.size());
        for(Client client : clients) {
            System.out.println(client);
        }

        //bankonetMetier.deleteClientsWithNameContaining("john");

        context.close();
    }
}