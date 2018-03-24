package com.pets.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class User extends BaseEntity {
    @OneToOne
    private Client client;
    @OneToOne
    private Carer carer;
    private String username;
    private String password;
    private String email;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Carer getCarer() {
        return carer;
    }

    public void setCarer(Carer carer) {
        this.carer = carer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
