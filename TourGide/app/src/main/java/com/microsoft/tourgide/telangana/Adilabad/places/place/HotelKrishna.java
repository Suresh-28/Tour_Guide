package com.microsoft.tourgide.telangana.Adilabad.places.place;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.ImageView;
import android.widget.Toast;

import com.microsoft.tourgide.R;
import com.microsoft.tourgide.telangana.Adilabad.AdilabadActivity;
import com.microsoft.tourgide.telangana.Adilabad.places.HotelKunthal;
import com.microsoft.tourgide.telangana.Adilabad.places.Hotelskawal;

import java.util.Locale;

public class HotelKrishna extends AppCompatActivity {

    ImageView back5;


    ImageView website;
    ImageView direction;
    AdapterViewFlipper adapterViewFlipper;
    int[] IMAGES={
            R.drawable.krishna1,
            R.drawable.krishna2,
            R.drawable.krishna3,
            R.drawable.krishna4,
            R.drawable.krishna5

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_krishna);
        direction=findViewById(R.id.direction);
        direction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri=String.format(Locale.ENGLISH,"http://maps.google.com/maps?q=loc:%f,%f",19.671251715125923,78.52782856181341);
                Intent location=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(location);
            }
        });
        website=findViewById(R.id.website);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.goibibo.com/hotels/new-krishna-lodge-hotel-in-adilabad-4246967392928943214/"));
            }
        });
        back5=findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(HotelKrishna.this, HotelKunthal.class);
                View sharedView= back5;
                String transitionNane=getString(R.string.pressed5);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(HotelKrishna.this,sharedView,transitionNane);
                startActivity(intent1,transiction.toBundle());

            }
        });


        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapter322 customAdapter=new CustomAdapter322(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);
    }
}