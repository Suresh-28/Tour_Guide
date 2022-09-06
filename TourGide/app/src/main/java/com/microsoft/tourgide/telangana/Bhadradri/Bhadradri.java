package com.microsoft.tourgide.telangana.Bhadradri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

import com.microsoft.tourgide.R;


public class Bhadradri extends AppCompatActivity {
    AdapterViewFlipper adapterViewFlipper;

    int[] IMAGES={
            R.drawable.badradri


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhadradri);


        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapter2 customAdapter=new CustomAdapter2(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);






    }
}