package com.microsoft.tourgide.telangana.vikarabad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

import com.microsoft.tourgide.R;



public class Vikarabad extends AppCompatActivity {
    AdapterViewFlipper adapterViewFlipper;

    int[] IMAGES={
            R.drawable.vikarabad

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vikarabad);


        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapter26 customAdapter=new CustomAdapter26(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);






    }
}