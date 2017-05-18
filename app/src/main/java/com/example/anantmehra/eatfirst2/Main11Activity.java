package com.example.anantmehra.eatfirst2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main11Activity extends AppCompatActivity {
    String g;
firebase fire=new firebase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        final Button start=(Button)findViewById(R.id.start);
        final EditText name=(EditText) findViewById(R.id.name);
        final EditText number=(EditText)findViewById(R.id.number);
        final EditText email=(EditText)findViewById(R.id.email);
        final EditText password=(EditText)findViewById(R.id.pass);
        final EditText house=(EditText)findViewById(R.id.house);
        final EditText road=(EditText)findViewById(R.id.road);
        final EditText street=(EditText)findViewById(R.id.street);
        final EditText city=(EditText)findViewById(R.id.city);
        final EditText pincode =(EditText)findViewById(R.id.pincode);



        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign=new Intent(v.getContext(),MainActivity.class);
                //g=number.getText().toString();
                //sign.putExtra("gg",g);


                fire.user(name.getText().toString(),number.getText().toString(),email.getText().toString(),password.getText().toString(),house.getText().toString(),road.getText().toString(),street.getText().toString(),city.getText().toString(),pincode.getText().toString(),name.getText().toString());
                startActivity(sign);
            }
        });
    }

}
