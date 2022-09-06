package com.microsoft.tourgide.telangana.yadadri.places;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.ImageView;

import com.microsoft.tourgide.R;
import com.microsoft.tourgide.telangana.Adilabad.AdilabadActivity;
import com.microsoft.tourgide.telangana.Adilabad.places.Hotelskawal;
import com.microsoft.tourgide.telangana.yadadri.Yadadri;
import com.microsoft.tourgide.telangana.yadadri.places.place.SurendraHotels;
import com.microsoft.tourgide.telangana.yadadri.places.place.YadadriHotels;


import java.util.Locale;


public class Surendrapuri extends AppCompatActivity {
    ViewPager vp;

    ImageView hotels;
    ImageView back3;
    ImageView direction;
    ImageView shared;

    AdapterViewFlipper adapterViewFlipper;
    int[] IMAGES={
            R.drawable.surendrapuri1,
            R.drawable.surendrapuri2,
            R.drawable.surendrapuri3,
            R.drawable.surendrapuri4


    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surendrapuri);
        direction=findViewById(R.id.direction);
        shared=findViewById(R.id.share);
        shared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text="Hey look at this place";
                Uri uri=Uri.parse("C:\\Users\\sreerama\\AndroidStudioProjects\\TourGide\\app\\src\\main\\res\\drawable\\kawali1.jpeg");
                final  Intent shareintent=new Intent();
                shareintent.setType("image/*");
                shareintent.setAction(Intent.ACTION_SEND);
                shareintent.putExtra(Intent.EXTRA_TEXT,text);
                shareintent.putExtra(Intent.EXTRA_STREAM,uri);
                shareintent.addFlags(Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION);
                startActivity(Intent.createChooser(shareintent,"share with..."));



            }
        });
        direction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri=String.format(Locale.ENGLISH,"http://maps.google.com/maps?q=loc:%f,%f",17.564999015438115, 78.94526684362297);
                Intent location=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(location);
            }
        });
        back3=findViewById(R.id.back3);
        back3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Surendrapuri.this, Yadadri.class);
                View sharedView= back3;
                String transitionNane=getString(R.string.kawaliflipper);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(Surendrapuri.this,sharedView,transitionNane);
                startActivity(intent1,transiction.toBundle());

            }
        });

        hotels=findViewById(R.id.hotels);
        hotels.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Surendrapuri.this, SurendraHotels.class);
                View sharedView= hotels;
                String transitionNane=getString(R.string.kawaliflipper);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(Surendrapuri.this,sharedView,transitionNane);
                startActivity(intent,transiction.toBundle());

            }
        });



        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapteryadadri1 customAdapter=new CustomAdapteryadadri1(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);


        vp=findViewById(R.id.viewpager);







    }





}