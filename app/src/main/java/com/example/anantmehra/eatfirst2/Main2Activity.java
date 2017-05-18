package com.example.anantmehra.eatfirst2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
String phonee,kkk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button itc=(Button)findViewById(R.id.itc);
        Button hut=(Button)findViewById(R.id.hut);
        Button barb=(Button)findViewById(R.id.barb);
        Button king=(Button)findViewById(R.id.king);
        Button junk=(Button)findViewById(R.id.junk);
        Button chai=(Button)findViewById(R.id.chai);
        Button taco=(Button)findViewById(R.id.taco);
        Button star=(Button)findViewById(R.id.star);


        Intent j=getIntent();
        phonee=j.getExtras().getString("aaa");







        itc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Main3Activity.class);
                i.putExtra("b",phonee);
                startActivity(i);
            }
        });

        hut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Main4Activity.class);
                i.putExtra("b",phonee);
                startActivity(i);
            }
        });

        barb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Main5Activity.class);
                i.putExtra("b",phonee);
                startActivity(i);
            }
        });

        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Main6Activity.class);
                i.putExtra("b",phonee);
                startActivity(i);
            }
        });

        junk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Main7Activity.class);
                i.putExtra("b",phonee);
                startActivity(i);
            }
        });

        chai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Main8Activity.class);
                i.putExtra("b",phonee);
                startActivity(i);
            }
        });

        taco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Main9Activity.class);
                i.putExtra("b",phonee);
                startActivity(i);
            }
        });

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Main10Activity.class);
                i.putExtra("b",phonee);
                startActivity(i);
            }
        });

    }
}
