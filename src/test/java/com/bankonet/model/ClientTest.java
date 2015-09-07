package com.bankonet.model;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientTest {

    @Test
    public void autowireTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Client client = (Client) context.getBean("client");

        System.out.println(client);

        context.close();
    }

}