package com.bankonet.metier;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BankonetMetierTest {

    @Test
    public void testBankonetMetier() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        IBankonetMetier bankonetMetier = (IBankonetMetier) context.getBean("bankonetMetier");

        bankonetMetier.listClients();

        context.close();
    }
}