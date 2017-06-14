package com.example.sabittahsin.informationofuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
  Button a1,a2,a3,a4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        a1=(Button)findViewById(R.id.button4);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main2Activity.this, Main7Activity.class);
                startActivity(i);
            }
        });

        a2=(Button)findViewById(R.id.button5);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main2Activity.this, Main8Activity.class);
                startActivity(i);
            }
        });

        a3=(Button)findViewById(R.id.button6);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main2Activity.this, Main9Activity.class);
                startActivity(i);
            }
        });

        a4=(Button)findViewById(R.id.button7);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main2Activity.this, Main10Activity.class);
                startActivity(i);
            }
        });



    }

}
