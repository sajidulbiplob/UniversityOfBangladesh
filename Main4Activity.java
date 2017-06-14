package com.example.sabittahsin.informationofuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    Button a1,a2,a3,a4,a5,a6,a7,a8,a9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        a1=(Button)findViewById(R.id.button21);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main4Activity.this, Main20Activity.class);
                startActivity(i);


            }
        });

        a2=(Button)findViewById(R.id.button22);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main4Activity.this, Main21Activity.class);
                startActivity(i);


            }
        });

        a3=(Button)findViewById(R.id.button23);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main4Activity.this, Main22Activity.class);
                startActivity(i);


            }
        });


        a4=(Button)findViewById(R.id.button24);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main4Activity.this, Main23Activity.class);
                startActivity(i);


            }
        });

        a5=(Button)findViewById(R.id.button25);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main4Activity.this, Main24Activity.class);
                startActivity(i);


            }
        });

        a6=(Button)findViewById(R.id.button26);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main4Activity.this, Main25Activity.class);
                startActivity(i);


            }
        });

        a7=(Button)findViewById(R.id.button27);
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main4Activity.this, Main26Activity.class);
                startActivity(i);


            }
        });

        a8=(Button)findViewById(R.id.button28);
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main4Activity.this, Main27Activity.class);
                startActivity(i);


            }
        });

        a8=(Button)findViewById(R.id.button37);
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main4Activity.this, Main35Activity.class);
                startActivity(i);


            }
        });

    }

}
