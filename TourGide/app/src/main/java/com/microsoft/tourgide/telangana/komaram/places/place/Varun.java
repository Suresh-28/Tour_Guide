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

public class Varun extends AppCompatActivity {

    ImageView back5;


    ImageView website;
    ImageView direction;
    AdapterViewFlipper adapterViewFlipper;
    int[] IMAGES={
            R.drawable.varunrestro1,
            R.drawable.varunrestro2

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varun);
        direction=findViewById(R.id.direction);
        direction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri=String.format(Locale.ENGLISH,"http://maps.google.com/maps?q=loc:%f,%f",19.45323879794358, 78.9072718080258);
                Intent location=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(location);
            }
        });
        website=findViewById(R.id.website);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser= new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "https://www.spicemoney.com/"));
                startActivity(browser);
            }
        });
        back5=findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Varun.this, KerameriHotels.class);
                View sharedView= back5;
                String transitionNane=getString(R.string.pressed5);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(Varun.this,sharedView,transitionNane);
                startActivity(intent1,transiction.toBundle());

            }
        });


        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapterkom4 customAdapter=new CustomAdapterkom4(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);
    }
}