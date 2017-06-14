package com.example.sabittahsin.informationofuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    Button a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        a1=(Button)findViewById(R.id.button9);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main3Activity.this, Main11Activity.class);
                startActivity(i);


            }
        });

        a2=(Button)findViewById(R.id.button10);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main3Activity.this,Main12Activity.class);
                startActivity(i);



            }
        });

        a3=(Button)findViewById(R.id.button11);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main3Activity.this,Main13Activity.class);
                startActivity(i);



            }
        });

        a4=(Button)findViewById(R.id.button12);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main3Activity.this,Main14Activity.class);
                startActivity(i);



            }
        });

        a5=(Button)findViewById(R.id.button13);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main3Activity.this,Main15Activity.class);
                startActivity(i);



            }
        });


        a6=(Button)findViewById(R.id.button14);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main3Activity.this,Main16Activity.class);
                startActivity(i);



            }
        });

        a7=(Button)findViewById(R.id.button15);
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main3Activity.this,Main17Activity.class);
                startActivity(i);



            }
        });

        a8=(Button)findViewById(R.id.button16);
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main3Activity.this,Main18Activity.class);
                startActivity(i);



            }
        });

        a9=(Button)findViewById(R.id.button17);
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main3Activity.this,Main19Activity.class);
                startActivity(i);



            }
        });

        a10=(Button)findViewById(R.id.button18);
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main3Activity.this,Main32Activity.class);
                startActivity(i);



            }
        });

        a11=(Button)findViewById(R.id.button19);
        a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main3Activity.this,Main33Activity.class);
                startActivity(i);



            }
        });

        a12=(Button)findViewById(R.id.button36);
        a12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main3Activity.this,Main34Activity.class);
                startActivity(i);



            }
        });

    }

}
