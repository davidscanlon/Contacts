package com.example.david.contacts;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static String CONTACT_KEY;

    Button createNewButton;

    Button finishButton;

    Contact contact;

    //List for keeping track of Contacts
    ArrayList<Contact> contactList = new ArrayList<Contact>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //*************
        // Finish button closes the application

        finishButton = findViewById(R.id.button_Finish);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
        //****************************************************

        //*************
        // Create New button opens the CreateNewContact Activity
        createNewButton = (Button) findViewById(R.id.button_CreateNew);
        createNewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CreateNewContact.class);
                startActivity(i);
            }
        });
        //****************************************************

        if (getIntent() != null && getIntent().getExtras() != null) {
            contact = (Contact) getIntent().getExtras().getSerializable(CreateNewContact.CONTACT_KEY);
            contactList.add(contact);

            Log.d("test", "Array: " + contactList.toString());

        }



    } // end onCreate

} // end MainActivity class
