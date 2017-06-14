package com.example.sabittahsin.informationofuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(Button)findViewById(R.id.button);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });

        b=(Button)findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(j);
            }
        });

        c=(Button)findViewById(R.id.button3);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent k=new Intent(MainActivity.this,Main4Activity.class);
                startActivity(k);
            }
        });

        d=(Button)findViewById(R.id.button8);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent l=new Intent(MainActivity.this,Main5Activity.class);
                startActivity(l);
            }
        });

        e=(Button)findViewById(R.id.button20);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent l=new Intent(MainActivity.this,Main6Activity.class);
                startActivity(l);
            }
        });


        f=(Button)findViewById(R.id.button100);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Main43Activity.class);
                startActivity(i);
            }
        });







    }
}
