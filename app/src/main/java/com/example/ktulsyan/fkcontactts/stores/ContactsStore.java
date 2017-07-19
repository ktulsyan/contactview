package com.example.ktulsyan.fkcontactts.stores;

import com.example.ktulsyan.fkcontactts.model.Contact;

import java.util.List;

public class ContactsStore {
    ContactsDatabase contactsDb;

    public Contact update(long id, String newName, String phoneNumber) {
        contactsDb.update(id, newName, phoneNumber);
        return new Contact(id, newName, phoneNumber);
    }

    public Contact insert(String newName, String phoneNumber) {
        long id = contactsDb.insert(newName, phoneNumber);
        return new Contact(id, newName, phoneNumber);
    }

    public void remove(long contactId) {
        contactsDb.delete(contactId);
    }

    public Contact get(long contactId) {
        return contactsDb.get(contactId);
    }

    public List<Contact> getAll() {
        return contactsDb.getAll();
    }
}
