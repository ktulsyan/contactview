package com.example.ktulsyan.fkcontactts.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ktulsyan.fkcontactts.R;
import com.example.ktulsyan.fkcontactts.ui.adapters.ContactsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class ContactsListFragment extends Fragment {

    @BindView(R.id.contacts_list) ListView contactsList;

    private ContactsAdapter contactsAdapter;

    public ContactsListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ButterKnife.bind(this, view);

        initList();
        return view;
    }

    private void initList() {
        contactsAdapter = new ContactsAdapter(getActivity());
        contactsList.setAdapter(contactsAdapter);
    }
}
