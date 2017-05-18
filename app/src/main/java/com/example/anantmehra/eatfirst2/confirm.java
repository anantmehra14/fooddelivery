package com.example.anantmehra.eatfirst2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

public class confirm extends AppCompatActivity {


    String iii,phone,food,value,value1,value2,value3,value4,value5,value6,value7,value8,iiii,timl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        TextView vii=(TextView)findViewById(R.id.idd);
        /*final TextView text1=(TextView)findViewById(R.id.t1);
        final TextView text2=(TextView)findViewById(R.id.t2);
        final TextView text3=(TextView)findViewById(R.id.t3);
        final TextView text4=(TextView)findViewById(R.id.t4);
        final TextView text5=(TextView)findViewById(R.id.t5);
        final TextView text6=(TextView)findViewById(R.id.t6);
        final  TextView text7=(TextView)findViewById(R.id.t7);
        final  TextView text8=(TextView)findViewById(R.id.t8);
        final  TextView text9=(TextView)findViewById(R.id.t9); */

        Button submit=(Button)findViewById(R.id.button);



        Intent j=getIntent();
        {
        phone=j.getExtras().getString("ema");
        food=j.getExtras().getString("n");
        iii=j.getExtras().getString("oooooo");



        Intent lll=getIntent();
        iiii=lll.getExtras().getString("oooo");
            timl=lll.getExtras().getString("tims");
            vii.setText(iiii);}





        final RatingBar rate=(RatingBar)findViewById(R.id.ratingBar);
        rate.setMax(5);

       final FirebaseDatabase ds =FirebaseDatabase.getInstance();

        /*vieww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference myRef = ds.getReference("cart/"+food+"/"+phone+"/item1");
                myRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for (DataSnapshot childDatasnapshot : dataSnapshot.getChildren()) {

                            value = ""+dataSnapshot.getValue();
                        /*    value1 = dataSnapshot.child("item2").getValue(String.class);
                            value2 = dataSnapshot.child("item3").getValue(String.class);
                            value3 = dataSnapshot.child("item4").getValue(String.class);
                            value4 = dataSnapshot.child("item5").getValue(String.class);
                            value5 = dataSnapshot.child("item6").getValue(String.class);
                            value6 = dataSnapshot.child("item7").getValue(String.class);
                            value7 = dataSnapshot.child("item8").getValue(String.class);
                            value8 = childDatasnapshot.child("item9").getValue(String.class);
                            Toast.makeText(getApplicationContext(),""+value,Toast.LENGTH_SHORT).show();
                            text1.setText(value);
                            //childDatasnapshot
                        }

                        text2.setText(value1);
                        text3.setText(value2);
                        text4.setText(value3);
                        text5.setText(value4);
                        text6.setText(value5);
                        text7.setText(value6);
                        text8.setText(value7);
                        text9.setText(value8);


                    }

                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });

            }
        });*/






        rate.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            }
        });

       /* back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backk=new Intent(v.getContext(),Main2Activity.class);

                startActivity(backk);
            }
        });*/

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Thank you for giving :"+ rate.getRating()+" stars",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
