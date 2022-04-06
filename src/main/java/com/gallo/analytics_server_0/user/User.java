package com.gallo.analytics_server_0.user;

import com.gallo.analytics_server_0.domain.Domain;

import java.util.ArrayList;

public class User {
    Long id;
    String emailAddress;
    Domain domain;
    String password;

    public User() {
    }

    public User(String emailAddress, String password){
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public User(String emailAddress, Domain domain, String password) {
        this.emailAddress = emailAddress;
        this.domain = domain;
        this.password = password;
    }

    public User(Long id, String emailAddress, Domain domain, String password) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.domain = domain;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", emailAddress='" + emailAddress + '\'' +
                ", domain=" + domain +
                ", password='" + password + '\'' +
                '}';
    }
}
