package com.microsoft.tourgide.telangana.yadadri;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.ImageView;
import android.widget.TextView;

import com.microsoft.tourgide.R;

import com.microsoft.tourgide.Telangana;
import com.microsoft.tourgide.telangana.SeemoreActivity;
import com.microsoft.tourgide.telangana.yadadri.places.Surendrapuri;
import com.microsoft.tourgide.telangana.yadadri.places.Yadagirigutta;

public class Yadadri extends AppCompatActivity implements View.OnClickListener{

    AdapterViewFlipper adapterViewFlipper;

    ImageView back2;

    ImageView yadagiri;
    ImageView surendrapuri;






    int[] IMAGES={
            R.drawable.yadadri,
            R.drawable.yadadri1,
            R.drawable.yadadri2,
            R.drawable.yadadri3,



    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yadadri);


        back2=findViewById(R.id.back2);
        back2.setOnClickListener(this);






        yadagiri=findViewById(R.id.yadagiri);
        yadagiri.setOnClickListener(this);
        surendrapuri=findViewById(R.id.surendrapuri);
        surendrapuri.setOnClickListener(this);





        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapter29 customAdapter=new CustomAdapter29(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);








    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.yadagiri:
                Intent intent1=new Intent(Yadadri.this, Yadagirigutta.class);
                View sharedView= yadagiri;
                String transitionNane=getString(R.string.kawaliflipper);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(Yadadri.this,sharedView,transitionNane);
                startActivity(intent1,transiction.toBundle());
                break;
            case R.id.surendrapuri:
                Intent intent2=new Intent(Yadadri.this, Surendrapuri.class);
                View sharedView0= yadagiri;
                String transitionNane0=getString(R.string.kawaliflipper);
                ActivityOptions transiction0=ActivityOptions.makeSceneTransitionAnimation(Yadadri.this,sharedView0,transitionNane0);
                startActivity(intent2,transiction0.toBundle());
                break;

            case R.id.back2:
                Intent intent3=new Intent(Yadadri.this, Telangana.class);

                View sharedView1= back2;
                String transitionNane1=getString(R.string.pressed2);
                ActivityOptions transiction1=ActivityOptions.makeSceneTransitionAnimation(Yadadri.this,sharedView1,transitionNane1);
                startActivity(intent3,transiction1.toBundle());


                break;


        }

    }
}

