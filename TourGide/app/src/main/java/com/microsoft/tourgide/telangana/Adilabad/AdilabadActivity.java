package com.microsoft.tourgide.telangana.Adilabad;

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

public class AdilabadActivity extends AppCompatActivity implements View.OnClickListener{

    AdapterViewFlipper adapterViewFlipper;
    TextView seemore;
    ImageView back2;

    ImageView kawalwildlife;
    ImageView kunthalawaterfall;







    int[] IMAGES={
            R.drawable.adilabad,
            R.drawable.adilabad2


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adilabad);



        back2=findViewById(R.id.back2);
        back2.setOnClickListener(this);





        kawalwildlife=findViewById(R.id.kawaliwildlife);
        kawalwildlife.setOnClickListener(this);
        kunthalawaterfall=findViewById(R.id.kunthalawaterfall);
        kunthalawaterfall.setOnClickListener(this);





        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapter1 customAdapter=new CustomAdapter1(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);








    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.kawaliwildlife:
                Intent intent1=new Intent(AdilabadActivity.this, Kawaliwildlife.class);
                View sharedView= kawalwildlife;
                String transitionNane=getString(R.string.kawaliflipper);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(AdilabadActivity.this,sharedView,transitionNane);
                startActivity(intent1,transiction.toBundle());
                break;
            case R.id.kunthalawaterfall:
                Intent intent2=new Intent(AdilabadActivity.this, KunthalaWaterfall.class);
                View sharedView0= kawalwildlife;
                String transitionNane0=getString(R.string.kawaliflipper);
                ActivityOptions transiction0=ActivityOptions.makeSceneTransitionAnimation(AdilabadActivity.this,sharedView0,transitionNane0);
                startActivity(intent2,transiction0.toBundle());
                break;

            case R.id.back2:
                Intent intent3=new Intent(AdilabadActivity.this, Telangana.class);

                View sharedView1= back2;
                String transitionNane1=getString(R.string.pressed2);
                ActivityOptions transiction1=ActivityOptions.makeSceneTransitionAnimation(AdilabadActivity.this,sharedView1,transitionNane1);
                startActivity(intent3,transiction1.toBundle());


                break;


        }

    }
}

