package com.example.sabittahsin.informationofuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main43Activity extends AppCompatActivity {
    Button a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main43);


        a=(Button)findViewById(R.id.button101);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main43Activity.this, Main44Activity.class);
                startActivity(i);
            }
        });


        b=(Button)findViewById(R.id.button102);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main43Activity.this, Main45Activity.class);
                startActivity(i);
            }
        });

        c=(Button)findViewById(R.id.button103);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main43Activity.this, Main46Activity.class);
                startActivity(i);
            }
        });


    }

}
