package com.example.david.contacts;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button createNewButton;

    Button finishButton;

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
                finish();
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



    } // end onCreate

} // end MainActivity class
