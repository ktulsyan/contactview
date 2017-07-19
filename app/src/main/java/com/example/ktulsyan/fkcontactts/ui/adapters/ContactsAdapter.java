package com.example.ktulsyan.fkcontactts.ui.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.ktulsyan.fkcontactts.R;
import com.example.ktulsyan.fkcontactts.model.Contact;
import com.example.ktulsyan.fkcontactts.stores.ContactsStore;
import com.example.ktulsyan.fkcontactts.ui.viewholders.ContactDetailsHolder;

import java.util.ArrayList;
import java.util.List;

public class ContactsAdapter extends ArrayAdapter<Contact> {

    private Context context;
    List<Contact> contacts = new ArrayList<Contact>();

    public ContactsAdapter(Context context) {
        super(context, 0);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null) {
            convertView = inf.inflate(R.layout.contact_item, parent, false);
        }
        Contact contact = contacts.get(position);
        ContactDetailsHolder viewHolder = new ContactDetailsHolder();
        viewHolder.bindView(convertView, contact);
        return convertView;
    }

}
