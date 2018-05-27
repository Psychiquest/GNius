package com.example.dell.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
        {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout messmenubutton = (LinearLayout) findViewById(R.id.mess);
        LinearLayout shuttlebutton = (LinearLayout) findViewById(R.id.shuttle);
        LinearLayout lost_foundbutton = (LinearLayout) findViewById(R.id.lost_found);
        LinearLayout welfarebutton = (LinearLayout) findViewById(R.id.welfare);
        LinearLayout terasharebutton = (LinearLayout) findViewById(R.id.terashare);

        /*messmenubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,
                        MessActivity.class);
                startActivity(myIntent);

            }
        });*/

        shuttlebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,
                        Main2Activity.class);
                startActivity(myIntent);

            }
        });

        /*lost_foundbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,
                        MainActivitylost.class);
                startActivity(myIntent);

            }
        });*/

        welfarebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,
                        MainActivityW.class);
                startActivity(myIntent);

            }
        });

        terasharebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,
                        MainActivity3.class);
                startActivity(myIntent);

            }
        });


    }


}







