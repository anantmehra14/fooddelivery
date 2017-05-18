package com.example.anantmehra.eatfirst2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Random;

/**
 * Created by anant mehra on 15-04-2017.
 */


public class barb1  extends AppCompatActivity {

    String zz,xx,ww,mm,aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,nn,oo,pp,qq,rr,ss,tt,uu,vv,tttt,em;
    firebase fire=new firebase();
    String mystring;
    Calendar c=Calendar.getInstance();

    final String sdate="" + c.get(Calendar.DAY_OF_MONTH) + "/"+ c.get(Calendar.MONTH) + "/"+ c.get(Calendar.YEAR);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barb1);

        Button payment=(Button)findViewById(R.id.payment);
        final TextView order = (TextView) findViewById(R.id.textView2);
        final TextView name = (TextView) findViewById(R.id.textt);
        final TextView email = (TextView) findViewById(R.id.email);

        final TextView text = (TextView) findViewById(R.id.text);
        final TextView total = (TextView) findViewById(R.id.total);
        final TextView rs = (TextView) findViewById(R.id.r);


        final TextView text1 = (TextView) findViewById(R.id.item1);
        final TextView text2 = (TextView) findViewById(R.id.price1);
        final TextView text3 = (TextView) findViewById(R.id.q1);

        final TextView text4 = (TextView) findViewById(R.id.item2);
        TextView text5 = (TextView) findViewById(R.id.price2);
        final TextView text6 = (TextView) findViewById(R.id.q2);

        final TextView text7 = (TextView) findViewById(R.id.item3);
        final TextView text8 = (TextView) findViewById(R.id.price3);
        final TextView text9 = (TextView) findViewById(R.id.q3);

        final TextView text10 = (TextView) findViewById(R.id.item4);
        final TextView text11 = (TextView) findViewById(R.id.price4);
        final TextView text12 = (TextView) findViewById(R.id.q4);

        final TextView text13 = (TextView) findViewById(R.id.item5);
        final TextView text14 = (TextView) findViewById(R.id.price5);
        final TextView text15 = (TextView) findViewById(R.id.q5);

        final TextView text16 = (TextView) findViewById(R.id.item6);
        final TextView text17 = (TextView) findViewById(R.id.price6);
        final TextView text18 = (TextView) findViewById(R.id.q6);

        final TextView text19 = (TextView) findViewById(R.id.item7);
        final TextView text20 = (TextView) findViewById(R.id.price7);
        final TextView text21 = (TextView) findViewById(R.id.q7);

        final TextView text22 = (TextView) findViewById(R.id.item8);
        final TextView text23 = (TextView) findViewById(R.id.price8);
        final TextView text24 = (TextView) findViewById(R.id.q8);
        final TextView text25 = (TextView) findViewById(R.id.item9);
        final TextView text26 = (TextView) findViewById(R.id.price9);
        final TextView text27 = (TextView) findViewById(R.id.q9);

        final TextView text28 = (TextView) findViewById(R.id.item10);
        final TextView text29 = (TextView) findViewById(R.id.price10);
        final TextView text30 = (TextView) findViewById(R.id.q10);


        Button pay=(Button)findViewById(R.id.payment);

        Intent qqq = getIntent();
        em = qqq.getExtras().getString("ttta");



        Intent cart=getIntent();



            zz = cart.getExtras().getString("a1");
            text.setText(zz);



        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pay=new Intent(v.getContext(),paymentt.class);


                Random ran = new Random();
                int number = ran.nextInt(10000000) + 1;
                //TextView textt=(TextView)findViewById(R.id.orderr);
                mystring = String.valueOf(number);
                //textt.setText(mystring);

                tttt = name.getText().toString();
                //orderr=order.getText().toString();
                pay.putExtra("qqq", zz);
                pay.putExtra("aaaaa", mystring);
                pay.putExtra("ttttt", tttt);
                pay.putExtra("eee", em);
                pay.putExtra("timaa",sdate);

                fire.cart(mystring,sdate,name.getText().toString(), text4.getText().toString() + "  " + text6.getText().toString(), text7.getText().toString() + "  " + text9.getText().toString(), text10.getText().toString() + "  " + text12.getText().toString(), text13.getText().toString() + "  " + text15.getText().toString(), text16.getText().toString() + "  " + text18.getText().toString(), text19.getText().toString() + "  " + text21.getText().toString(), text22.getText().toString() + "  " + text24.getText().toString(), text25.getText().toString() + "  " + text27.getText().toString(), text28.getText().toString() + "  " + text30.getText().toString());

                startActivity(pay);
            }
        });






        Intent button=getIntent();

        xx=button.getExtras().getString("a");
        text4.setText(xx);

        ww=button.getExtras().getString("b");
        text5.setText(ww);
        mm=button.getExtras().getString("c");
        text6.setText(mm);

        Intent button2=getIntent();

        aa=button2.getExtras().getString("d");
        text7.setText(aa);

        bb=button2.getExtras().getString("e");
        text8.setText(bb);

        cc=button2.getExtras().getString("f");
        text9.setText(cc);

        Intent button3=getIntent();

        dd=button.getExtras().getString("g");
        text10.setText(dd);

        ee=button.getExtras().getString("h");
        text11.setText(ee);

        ff=button.getExtras().getString("i");
        text12.setText(ff);

        Intent button4=getIntent();

        gg=button.getExtras().getString("j");
        text13.setText(gg);

        hh=button.getExtras().getString("k");
        text14.setText(hh);

        ii=button.getExtras().getString("l");
        text15.setText(ii);

        Intent button5=getIntent();

        jj=button.getExtras().getString("m");
        text16.setText(jj);

        kk=button.getExtras().getString("n");
        text17.setText(kk);

        ll=button.getExtras().getString("o");
        text18.setText(ll);

        Intent button6=getIntent();

        mm=button.getExtras().getString("p");
        text19.setText(mm);

        nn=button.getExtras().getString("q");
        text20.setText(nn);

        oo=button.getExtras().getString("r");
        text21.setText(oo);

        Intent button7=getIntent();

        pp=button.getExtras().getString("s");
        text22.setText(pp);

        qq=button.getExtras().getString("t");
        text23.setText(qq);

        rr=button.getExtras().getString("u");
        text24.setText(rr);

        Intent button8=getIntent();

        ss=button.getExtras().getString("v");
        text25.setText(ss);

        tt=button.getExtras().getString("w");
        text26.setText(tt);

        uu =button.getExtras().getString("x");
        text27.setText(uu);

        Intent button9=getIntent();

        vv=button.getExtras().getString("y");
        text28.setText(vv);

        ww=button.getExtras().getString("z");
        text29.setText(ww);

        xx=button.getExtras().getString("aa");
        text30.setText(xx);

    }}

