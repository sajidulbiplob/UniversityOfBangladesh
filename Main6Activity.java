package com.example.sabittahsin.informationofuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity {
    Button a1,a2,a3,a4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        a1=(Button)findViewById(R.id.button34);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main6Activity.this, Main28Activity.class);
                startActivity(i);


            }
        });

        a2=(Button)findViewById(R.id.button29);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main6Activity.this, Main29Activity.class);
                startActivity(i);


            }
        });

        a3=(Button)findViewById(R.id.button30);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main6Activity.this, Main30Activity.class);
                startActivity(i);


            }
        });


        a4=(Button)findViewById(R.id.button31);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main6Activity.this, Main31Activity.class);
                startActivity(i);


            }
        });

    }

}
