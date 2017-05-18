package com.example.anantmehra.eatfirst2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalPayment;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentActivity;
import com.paypal.android.sdk.payments.PaymentConfirmation;

import org.json.JSONException;

import java.math.BigDecimal;


public class paymentt extends AppCompatActivity {
    String ppp,iii,em,namee,iiiii,timm;
    Float zz;


    firebase fire=new firebase();
    /*PayPalConfiguration m_configuration;
    // the id is the link to the paypal account, we have to create an app and get its id
    String m_paypalClientId = "ASbSfj8PG-PPJb01yeJVJB_HKAcBMdZx2rqZ5emVwvpKCNongd8Mu9kgpnn_erQonCcdAseqxtzjUuGp";
    Intent m_service;
    int m_paypalRequestCode = 999; //*/
    private static PayPalConfiguration config = new PayPalConfiguration()

            // Start with mock environment.  When ready, switch to sandbox (ENVIRONMENT_SANDBOX)
            // or live (ENVIRONMENT_PRODUCTION)
            .environment(PayPalConfiguration.ENVIRONMENT_NO_NETWORK)

            .clientId("ASbSfj8PG-PPJb01yeJVJB_HKAcBMdZx2rqZ5emVwvpKCNongd8Mu9kgpnn_erQonCcdAseqxtzjUuGp");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentt);
        TextView n=(TextView)findViewById(R.id.or);
       final TextView cart=(TextView)findViewById(R.id.rr);
        final TextView orderr=(TextView)findViewById(R.id.orderr);
        final TextView time=(TextView)findViewById(R.id.timee);
        Button y= (Button)findViewById(R.id.one);
       // Button proceed=(Button)findViewById(R.id.cont);
        Button cash=(Button)findViewById(R.id.cash);
        Intent j=getIntent();
        {
            ppp = j.getStringExtra("qqq");
            cart.setText(ppp);
        }


        /*Intent pp=getIntent();
        iii=pp.getExtras().getString("ttttt");*/

        Intent kk=getIntent();

        em=kk.getExtras().getString("eee");
        namee=kk.getExtras().getString("ttt");
        timm=kk.getExtras().getString("timaa");
        time.setText(timm);

        Intent button=getIntent();
        iiiii=button.getExtras().getString("aaaaa");
        orderr.setText(iiiii);











        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pp=new Intent(v.getContext(),confirm.class);
                pp.putExtra("ema",em);
                pp.putExtra("n",namee);
                pp.putExtra("oooo",iiiii);

                fire.pay (orderr.getText().toString(),cart.getText().toString(),em,namee,"COD");
                startActivity(pp);
            }
        });










       /* proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ooaa=new Intent(v.getContext(),confirm.class);
                startActivity(ooaa);

            }
        });*/



        Intent intent = new Intent(this, PayPalService.class);

        intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, config);

        startService(intent);






        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zz=Float.parseFloat(ppp);
                zz=zz/68;
                PayPalPayment payment = new PayPalPayment(new BigDecimal(zz), "USD", "Total cart value",
                        PayPalPayment.PAYMENT_INTENT_SALE);

                Intent intent = new Intent(v.getContext(), PaymentActivity.class);
                intent.putExtra("ema",em);
                intent.putExtra("n",namee);
                intent.putExtra("oooooo",iiiii);

                // send the same configuration for restart resiliency
                intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, config);

                intent.putExtra(PaymentActivity.EXTRA_PAYMENT, payment);

                fire.pay (orderr.getText().toString(),cart.getText().toString(),em,namee,"PayPal");

                startActivityForResult(intent, 0);
            }
        });
    }



    @Override
    public void onDestroy() {
        stopService(new Intent(this, PayPalService.class));
        super.onDestroy();
    }





    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_OK) {
            PaymentConfirmation confirm = data.getParcelableExtra(PaymentActivity.EXTRA_RESULT_CONFIRMATION);
            if (confirm != null) {
                try {
                    Log.i("paymentExample", confirm.toJSONObject().toString(4));

                    // TODO: send 'confirm' to your server for verification.
                    // see https://developer.paypal.com/webapps/developer/docs/integration/mobile/verify-mobile-payment/
                    // for more details.

                } catch (JSONException e) {
                    Log.e("paymentExample", "an extremely unlikely failure occurred: ", e);
                }
            }
        }
        else if (resultCode == Activity.RESULT_CANCELED) {
            Log.i("paymentExample", "The user canceled.");
        }
        else if (resultCode == PaymentActivity.RESULT_EXTRAS_INVALID) {
            Log.i("paymentExample", "An invalid Payment or PayPalConfiguration was submitted. Please see the docs.");
        }
    }
}



