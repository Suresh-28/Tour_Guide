package com.microsoft.tourgide.telangana.rajanna;

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
import android.widget.Toast;

import com.microsoft.tourgide.MainActivity;
import com.microsoft.tourgide.R;

import com.microsoft.tourgide.Telangana;
import com.microsoft.tourgide.telangana.Adilabad.places.Kawaliwildlife;
import com.microsoft.tourgide.telangana.Adilabad.places.KunthalaWaterfall;
import com.microsoft.tourgide.telangana.SeemoreActivity;
import com.microsoft.tourgide.telangana.komaram.places.Ganagapur;
import com.microsoft.tourgide.telangana.komaram.places.Kerameri;
import com.microsoft.tourgide.telangana.rajanna.places.NampallyGutta;
import com.microsoft.tourgide.telangana.rajanna.places.Vemulawada;

public class Rajanna extends AppCompatActivity implements View.OnClickListener{

    AdapterViewFlipper adapterViewFlipper;
    ImageView back2;

    ImageView yadadri1;
    ImageView surendrapuri1;







    int[] IMAGES={
            R.drawable.rajanna


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajanna);



        back2=findViewById(R.id.back2);
        back2.setOnClickListener(this);





        yadadri1=findViewById(R.id.yadadri);
        yadadri1.setOnClickListener(this);
        surendrapuri1=findViewById(R.id.surendrapuri);
        surendrapuri1.setOnClickListener(this);





        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapter21 customAdapter=new CustomAdapter21(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);








    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){


            case R.id.yadadri:
                Intent intent1=new Intent(Rajanna.this, Vemulawada.class);
                View sharedView= yadadri1;
                String transitionNane=getString(R.string.kawaliflipper);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(Rajanna.this,sharedView,transitionNane);
                startActivity(intent1,transiction.toBundle());
                break;
            case R.id.surendrapuri:
                Intent intent2=new Intent(Rajanna.this, NampallyGutta.class);
                View sharedView0= surendrapuri1;
                String transitionNane0=getString(R.string.kawaliflipper);
                ActivityOptions transiction0=ActivityOptions.makeSceneTransitionAnimation(Rajanna.this,sharedView0,transitionNane0);
                startActivity(intent2,transiction0.toBundle());
                break;

            case R.id.back2:
                Intent intent3=new Intent(Rajanna.this, Telangana.class);

                View sharedView1= back2;
                String transitionNane1=getString(R.string.pressed2);
                ActivityOptions transiction1=ActivityOptions.makeSceneTransitionAnimation(Rajanna.this,sharedView1,transitionNane1);
                startActivity(intent3,transiction1.toBundle());


                break;


        }

    }
}

