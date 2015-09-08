package com.bankonet.model;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@DiscriminatorValue("Client")
public class Client extends Person {

    @NotNull
    @Size(min = 2, max = 16)
    private String login;

    @NotNull
    @Size(min = 6, max = 50)
    private String password;

    @Embedded
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
