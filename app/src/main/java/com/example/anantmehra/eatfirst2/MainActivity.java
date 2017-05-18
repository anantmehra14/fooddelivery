package com.example.anantmehra.eatfirst2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.q42.android.scrollingimageview.ScrollingImageView;

public class MainActivity extends AppCompatActivity {
String ll,m,sl,email,mm,hhh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(!isConnected(MainActivity.this))
            buildDialog(MainActivity.this).show();
        else {
            Toast.makeText(MainActivity.this,"Welcome", Toast.LENGTH_SHORT).show();
            setContentView(R.layout.activity_main);
        }


        Button login=(Button)findViewById(R.id.button3);
        Button sign=(Button)findViewById(R.id.button4);
        final EditText email=(EditText)findViewById(R.id.editText);
       final EditText pass=(EditText)findViewById(R.id.editText2);








        ScrollingImageView scrollingBackground = (ScrollingImageView)findViewById(R.id.scrolling_background);

        scrollingBackground.start();




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll=email.getText().toString();
                sl=pass.getText().toString();


               final Intent i=new Intent (v.getContext(),Main2Activity.class);
                i.putExtra("a",ll);



                FirebaseDatabase database = FirebaseDatabase.getInstance();

                DatabaseReference myRef = database.getReference("USER");
                Query q= myRef.orderByChild("EMAIL").equalTo(ll).limitToFirst(1);
                q.addValueEventListener(new ValueEventListener() {

                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for (DataSnapshot childDataSnapshot : dataSnapshot.getChildren()) {
                            m = "" + childDataSnapshot.child("PASSWORD").getValue();
                            mm = "" + childDataSnapshot.getKey();
                            if (m.equals(sl)) {
                                i.putExtra("aaa",mm);
                                startActivity(i);
                            } else
                                Toast.makeText(getApplicationContext(), "Please ENTER CORRECT PASSWORD", Toast.LENGTH_LONG).show();
                        }
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Toast.makeText(getApplicationContext(), "Please REGISTER FIRST", Toast.LENGTH_LONG).show();
                    }
                });
            }});






        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s=new Intent(v.getContext(),Main11Activity.class);
                startActivity(s);

            }
        });




        }




    public boolean isConnected(Context context){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if (netinfo != null && netinfo.isConnectedOrConnecting()) {
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting())) return true;
            else return false;
        } else
            return false;
    }

    public AlertDialog.Builder buildDialog(Context c) {

        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("No Internet Connection");
        builder.setMessage("You need to have Mobile Data or wifi to continue. Press ok to Exit");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });

        return builder;
    }




}
