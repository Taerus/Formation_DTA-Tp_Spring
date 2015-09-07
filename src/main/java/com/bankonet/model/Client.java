package com.bankonet.model;


import org.springframework.beans.factory.annotation.Autowired;

public class Client extends Person {

    private String login;
    private String password;

    @Autowired
    private Address address;

    public Client() {
        super();
    }

    public Client(int id, String login, String password, String firstname, String lastname) {
        super(id, firstname, lastname);
        this.login = login;
        this.password = password;
    }

    public Client(int id, String login, String password, String firstname, String lastname, Address address) {
        this(id, login, password, firstname, lastname);
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + getId() +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + getFirstname() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", address=" + address +
                '}';
    }

}
