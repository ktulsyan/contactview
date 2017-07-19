package com.example.ktulsyan.fkcontactts.model;

public class Contact {
    public final long id;
    public final String name;
    public final String phoneNumber;

    public Contact(long id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String phoneNumber) {
        this.id = -1;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
