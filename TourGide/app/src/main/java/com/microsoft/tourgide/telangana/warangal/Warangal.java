package com.microsoft.tourgide.telangana.warangal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

import com.microsoft.tourgide.R;



public class Warangal extends AppCompatActivity {
    AdapterViewFlipper adapterViewFlipper;

    int[] IMAGES={
            R.drawable.warangal

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warangal);


        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapter28 customAdapter=new CustomAdapter28(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);






    }
}