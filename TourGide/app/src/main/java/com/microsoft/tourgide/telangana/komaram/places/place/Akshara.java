package com.microsoft.tourgide.telangana.komaram.places.place;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.microsoft.tourgide.R;
import com.microsoft.tourgide.telangana.Adilabad.places.Hotelskawal;


import java.util.Locale;

public class Akshara extends AppCompatActivity {

    ImageView back5;


    ImageView website;
    ImageView direction;
    AdapterViewFlipper adapterViewFlipper;
    int[] IMAGES={
            R.drawable.aks1,
            R.drawable.aks2,
            R.drawable.aks3,
            R.drawable.aks4


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akshara);
        direction=findViewById(R.id.direction);
        direction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri=String.format(Locale.ENGLISH,"http://maps.google.com/maps?q=loc:%f,%f",19.36479559050024, 79.2946089377499);
                Intent location=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(location);
            }
        });
        website=findViewById(R.id.website);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser= new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "https://nicelocal.in/telangana/restaurants/akshara_family_restaurant_a_c/"));
                startActivity(browser);
            }
        });
        back5=findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Akshara.this, GanagpurHotels.class);
                View sharedView= back5;
                String transitionNane=getString(R.string.pressed5);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(Akshara.this,sharedView,transitionNane);
                startActivity(intent1,transiction.toBundle());

            }
        });


        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapterkom1 customAdapter=new CustomAdapterkom1(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);
    }
}