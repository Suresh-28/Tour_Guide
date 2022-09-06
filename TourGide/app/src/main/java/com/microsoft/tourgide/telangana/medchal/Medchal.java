package com.microsoft.tourgide.telangana.medchal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

import com.microsoft.tourgide.R;



public class Medchal extends AppCompatActivity {
    AdapterViewFlipper adapterViewFlipper;

    int[] IMAGES={
            R.drawable.ic_home_fish,
            R.drawable.ic_home_fruits,
            R.drawable.ic_home_meats,
            R.drawable.ic_home_veggies

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medchal);


        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapter30 customAdapter=new CustomAdapter30(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);






    }
}