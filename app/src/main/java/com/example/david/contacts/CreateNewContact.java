package com.example.david.contacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateNewContact extends AppCompatActivity {

    static String CONTACT_KEY = "contact";

    Button saveButton;
    EditText firstName;
    EditText lastName;
    EditText company;
    EditText phone, email, url, address, birthday, nickname, facebook, twitter, skype, youtube;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_contact);


        firstName = findViewById(R.id.editText_First);
        lastName = findViewById(R.id.editText_Last);
        company = findViewById(R.id.editText_Company);
        phone = findViewById(R.id.editText_Phone);
        email = findViewById(R.id.editText_Email);
        url = findViewById(R.id.editText_Url);
        address = findViewById(R.id.editText_Address);
        birthday = findViewById(R.id.editText_Birthday);
        nickname = findViewById(R.id.editText_Nickname);
        facebook = findViewById(R.id.editText_Facebook);
        twitter = findViewById(R.id.editText_Twitter);
        skype = findViewById(R.id.editText_Skype);
        youtube = findViewById(R.id.editText_Youtube);


        //****************
        // Save button functionality
        saveButton = findViewById(R.id.button_Save);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // first name, last name, phone are mandatory
                if (firstName.getText().toString().isEmpty() == true || lastName.getText().toString().isEmpty() == true || phone.getText().toString().isEmpty() == true) {
                    Toast.makeText(CreateNewContact.this, "First Name, Last Name, and Phone Number Required", Toast.LENGTH_SHORT).show();
                }
                else {
                    Contact contact = new Contact();
                    contact.setFirst(firstName.getText().toString());
                    contact.setLast(lastName.getText().toString());
                    contact.setCompany(company.getText().toString());
                    contact.setPhoneNumber(phone.getText().toString());
                    contact.setEmail(email.getText().toString());
                    contact.setUrl(url.getText().toString());
                    contact.setAddress(address.getText().toString());
                    contact.setBirthday(birthday.getText().toString());
                    contact.setNickname(nickname.getText().toString());
                    contact.setFacebook(facebook.getText().toString());
                    contact.setTwitter(twitter.getText().toString());
                    contact.setSkype(skype.getText().toString());
                    contact.setYoutube(youtube.getText().toString());

                    Intent intent = new Intent(CreateNewContact.this, MainActivity.class);
                    intent.putExtra(CONTACT_KEY, contact);
                    startActivity(intent);

                }

            } // end saveButton onClick
        });
        //****************

    }
}
