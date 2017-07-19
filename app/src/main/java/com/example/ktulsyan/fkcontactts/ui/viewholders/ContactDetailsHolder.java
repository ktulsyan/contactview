package com.example.ktulsyan.fkcontactts.ui.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ktulsyan.fkcontactts.R;
import com.example.ktulsyan.fkcontactts.model.Contact;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ktulsyan on 19/07/17.
 */

public class ContactDetailsHolder implements ViewHolder<Contact> {

    public ContactDetailsHolder() {}

    @BindView(R.id.contact_name) TextView contactName;
    @BindView(R.id.contact_name) TextView phoneNumber;



    @Override
    public void bindView(View view, Contact contact) {
        ButterKnife.bind(this, view);
        contactName.setText(contact.name);
        phoneNumber.setText(contact.phoneNumber);
    }
}
