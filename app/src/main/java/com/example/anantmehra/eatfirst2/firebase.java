package com.example.anantmehra.eatfirst2;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by anant mehra on 12-04-2017.
 */

public class firebase {


    FirebaseDatabase database = FirebaseDatabase.getInstance();


    void user(String name,String phone_no,String email_id,String password,String address,String house_no,String road_no,String street,String city,String pincode)
    //ADD USERS
    {
        DatabaseReference myRef = database.getReference("USER");
        myRef.push().setValue(phone_no);
        DatabaseReference m = database.getReference("USER/"+phone_no+"/NAME");
        m.setValue(name);
        DatabaseReference my = database.getReference("USER/"+phone_no+"/EMAIL");
        my.setValue(email_id);
        DatabaseReference myr = database.getReference("USER/"+phone_no+"/PASSWORD");
        myr.setValue(password);
        DatabaseReference myref = database.getReference("USER/"+phone_no+"/ADDRESS"+"/house_no");
        myref.setValue(house_no);
        DatabaseReference myref1 = database.getReference("USER/"+phone_no+"/ADDRESS"+"/road_no");
        myref1.setValue(road_no);
        DatabaseReference myref2 = database.getReference("USER/"+phone_no+"/ADDRESS"+"/street");
        myref2.setValue(street);
        DatabaseReference myref3 = database.getReference("USER/"+phone_no+"/ADDRESS"+"/city");
        myref3.setValue(city);
        DatabaseReference myref4 = database.getReference("USER/"+phone_no+"/ADDRESS"+"/pincode");
        myref4.setValue(pincode);}

        void cart(String order_id,String time,String name,String item1,String item2,String item3,String item4,String item5,String item6,String item7,String item8,String item9)

        {
            DatabaseReference order = database.getReference("cart");
            order.push().setValue(order_id);
            DatabaseReference mm = database.getReference("cart/"+order_id+"/DATE");
            mm.setValue(time);

            DatabaseReference nam = database.getReference("cart/"+order_id);
            nam.setValue(name);
            DatabaseReference my = database.getReference("cart/"+order_id+"/"+name+"/item1");
            my.setValue(item1);
            DatabaseReference myr = database.getReference("cart/"+order_id+"/"+name+"/item2");
            myr.setValue(item2);
            DatabaseReference myref = database.getReference("cart/"+order_id+"/"+name+"/item3");
            myref.setValue(item3);
            DatabaseReference myref1 = database.getReference("cart/"+order_id+"/"+name+"/item4");
            myref1.setValue(item4);
            DatabaseReference myref2 = database.getReference("cart/"+order_id+"/"+name+"/item5");
            myref2.setValue(item5);
            DatabaseReference myref3 = database.getReference("cart/"+order_id+"/"+name+"/item6");
            myref3.setValue(item6);
            DatabaseReference myref4 = database.getReference("cart/"+order_id+"/"+name+"/item7");
            myref4.setValue(item7);
            DatabaseReference myref5 = database.getReference("cart/"+order_id+"/"+name+"/item8");
            myref5.setValue(item8);
            DatabaseReference myref6 = database.getReference("cart/"+order_id+"/"+name+"/item9");
            myref6.setValue(item9);






    }

    void pay (String order_no,String amount,String phone_no,String name,String mode)
    {
        DatabaseReference myRef = database.getReference("pay");
        myRef.push().setValue(order_no);
        DatabaseReference m = database.getReference("pay/"+order_no+"/amount");
        m.setValue(amount);
        DatabaseReference my = database.getReference("pay/"+order_no+"/phone");
        my.setValue(phone_no);
        DatabaseReference myr = database.getReference("pay/"+order_no+"/name");
        myr.setValue(name);
        DatabaseReference myref = database.getReference("pay/"+order_no+"/mode");
        myref.setValue(mode);

    }

   /* public static String EncodeString(String string) {
        return string.replace(".", ",");
    }

    public static String DecodeString(String string) {
        return string.replace(",", ".");
    }*/


    }


