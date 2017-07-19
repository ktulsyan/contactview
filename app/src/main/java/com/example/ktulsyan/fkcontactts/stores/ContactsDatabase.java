package com.example.ktulsyan.fkcontactts.stores;


import com.example.ktulsyan.fkcontactts.model.Contact;

import java.util.List;

/**
 * Created by ktulsyan on 19/07/17.
 */

public interface ContactsDatabase {
    long insert(String name, String number);

    void update(long id, String name, String number);

    void delete(long id);

    Contact get(long contactId);

    List<Contact> getAll();
}
