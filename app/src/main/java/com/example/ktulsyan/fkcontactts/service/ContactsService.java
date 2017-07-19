package com.example.ktulsyan.fkcontactts.service;

import android.content.ContentProvider;

import com.example.ktulsyan.fkcontactts.model.Contact;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

import javax.inject.Inject;

public class ContactsService {

    public ListenableFuture<Contact> updateContact(Contact old,
                                            String newName,
                                            String newNumber) {

        return Futures.immediateFuture(contact);
    }

    public ListenableFuture<Contact> createContact(String newName,
                                            String newNumber) {
        Contact contact = new Contact()
        return Futures.immediateFuture(contact);
    }


}
