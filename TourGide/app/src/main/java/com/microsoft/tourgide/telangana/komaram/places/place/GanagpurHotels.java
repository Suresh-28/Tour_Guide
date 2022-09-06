package com.microsoft.tourgide.telangana.komaram.places.place;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.microsoft.tourgide.R;
import com.microsoft.tourgide.telangana.Adilabad.AdilabadActivity;
import com.microsoft.tourgide.telangana.Adilabad.places.KunthalaWaterfall;
import com.microsoft.tourgide.telangana.Adilabad.places.place.HotelKrishna;
import com.microsoft.tourgide.telangana.Adilabad.places.place.HotelRavi;
import com.microsoft.tourgide.telangana.Adilabad.places.place.Hotelsitara;
import com.microsoft.tourgide.telangana.komaram.Komaram;


public class GanagpurHotels extends AppCompatActivity {

    LinearLayout relative1, relative2;
    ImageView back4;


    AdapterViewFlipper adapterViewFlipper;
    int[] IMAGES={
            R.drawable.gangapur1,
            R.drawable.gangapur2,
            R.drawable.gangapur3



    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganagpur_hotels);

        back4=findViewById(R.id.back4);
        back4.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(GanagpurHotels.this, Komaram.class);
                View sharedView= back4;
                String transitionNane=getString(R.string.pressed4);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(GanagpurHotels.this,sharedView,transitionNane);
                startActivity(intent1,transiction.toBundle());

            }
        });
        relative1=findViewById(R.id.relative1);
        relative1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GanagpurHotels.this, Akshara.class);
                View sharedView= relative1;
                String transitionNane=getString(R.string.kawaliflipper);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(GanagpurHotels.this,sharedView,transitionNane);
                startActivity(intent,transiction.toBundle());

            }
        });
        relative2=findViewById(R.id.relative2);
        relative1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GanagpurHotels.this, Haaris.class);
                View sharedView= relative1;
                String transitionNane=getString(R.string.kawaliflipper);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(GanagpurHotels.this,sharedView,transitionNane);
                startActivity(intent,transiction.toBundle());

            }
        });




        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdaptergangahotels customAdapter=new CustomAdaptergangahotels(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);
    }
}