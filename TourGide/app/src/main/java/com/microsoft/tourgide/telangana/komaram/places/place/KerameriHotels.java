package com.microsoft.tourgide.telangana.komaram.places.place;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.microsoft.tourgide.R;
import com.microsoft.tourgide.telangana.komaram.Komaram;
import com.microsoft.tourgide.telangana.komaram.places.place.CustomAdapterkeramerihotels;


public class KerameriHotels extends AppCompatActivity {

    LinearLayout relative1, relative2;
    ImageView back4;


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
        setContentView(R.layout.activity_kerameri_hotels);

        back4=findViewById(R.id.back4);
        back4.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(KerameriHotels.this, Komaram.class);
                View sharedView= back4;
                String transitionNane=getString(R.string.pressed4);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(KerameriHotels.this,sharedView,transitionNane);
                startActivity(intent1,transiction.toBundle());

            }
        });
        relative1=findViewById(R.id.relative1);
        relative1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KerameriHotels.this, Hkgn.class);
                View sharedView= relative1;
                String transitionNane=getString(R.string.kawaliflipper);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(KerameriHotels.this,sharedView,transitionNane);
                startActivity(intent,transiction.toBundle());

            }
        });
        relative2=findViewById(R.id.relative2);
        relative2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KerameriHotels.this, Varun.class);
                View sharedView= relative1;
                String transitionNane=getString(R.string.kawaliflipper);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(KerameriHotels.this,sharedView,transitionNane);
                startActivity(intent,transiction.toBundle());

            }
        });




        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapterkeramerihotels customAdapter=new CustomAdapterkeramerihotels(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);
    }
}