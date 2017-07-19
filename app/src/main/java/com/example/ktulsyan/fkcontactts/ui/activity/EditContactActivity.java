package com.example.ktulsyan.fkcontactts.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ktulsyan.fkcontactts.R;
import com.example.ktulsyan.fkcontactts.model.Contact;
import com.example.ktulsyan.fkcontactts.service.ContactsService;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class EditContactActivity extends BaseActivity {
    public static final int EDIT_REQUEST_CODE = 1001;
    public static final int CREATE_REQUEST_CODE = 1002;

    @BindView(R.id.editcontact_image)
    ImageView contactImageView;
    @BindView(R.id.eca_name)
    TextView name;
    @BindView(R.id.eca_number)
    TextView phonenumber;

    private int requestCode;
    private Contact contact;
    private ListenableFuture<Contact> taskFuture;

    @Inject
    ContactsService contactsService;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact);

    }

    @OnClick(R.id.eca_btn_save)
    void saveDetails() {
        switch (requestCode) {
            case EDIT_REQUEST_CODE:
                taskFuture = contactsService.updateContact(contact, name.getText().toString(), phonenumber.getText().toString());
                break;
            case CREATE_REQUEST_CODE:
                taskFuture = contactsService.createContact(name.getText().toString(), phonenumber.getText().toString());
                break;
        }

        Futures.addCallback(taskFuture, new FutureCallback<Contact>() {
            @Override
            public void onSuccess(Contact result) {
                //show short success toast
                finish();
            }

            @Override
            public void onFailure(Throwable t) {
                //show long error toast
                finish();
            }
        });
    }
}
