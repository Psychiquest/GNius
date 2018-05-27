package com.example.dell.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainw);
        Button complaint = (Button) findViewById(R.id.complaint);


// Set a click listener on that View
        /*complaint.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivityW.this, Complaints.class);
                startActivity(numbersIntent);
            }
        });*/
        Button check = (Button) findViewById(R.id.check);


// Set a click listener on that View
        /*check.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivityW.this, checkstatus.class);
                startActivity(numbersIntent);
            }
        });*/


    }
}







