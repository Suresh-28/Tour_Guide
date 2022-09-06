package com.microsoft.tourgide.telangana.Adilabad.places.place;

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

public class BudgetHotel extends AppCompatActivity {

    ImageView back5;


    ImageView website;
    ImageView direction;
    AdapterViewFlipper adapterViewFlipper;
    int[] IMAGES={
            R.drawable.budget1,
            R.drawable.budget2,
            R.drawable.budget3,
            R.drawable.budget4,
            R.drawable.budget5,
            R.drawable.budget6,
            R.drawable.budget7,
            R.drawable.budget8,
            R.drawable.budget9

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.budgethotel);
        direction=findViewById(R.id.direction);
        direction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri=String.format(Locale.ENGLISH,"http://maps.google.com/maps?q=loc:%f,%f",18.432303695920893,79.13193924953043);
                Intent location=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(location);
            }
        });
        website=findViewById(R.id.website);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser= new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "https://www.trip.com/hotels/karimnagar-hotel-detail-19561008/budget-hotel/"));
                startActivity(browser);
            }
        });
        back5=findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(BudgetHotel.this, Hotelskawal.class);
                View sharedView= back5;
                String transitionNane=getString(R.string.pressed5);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(BudgetHotel.this,sharedView,transitionNane);
                startActivity(intent1,transiction.toBundle());

            }
        });


        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapter32 customAdapter=new CustomAdapter32(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);
    }
}