package com.microsoft.tourgide;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterViewFlipper;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.microsoft.tourgide.telangana.Adilabad.AdilabadActivity;
import com.microsoft.tourgide.telangana.CustomAdapter;
import com.microsoft.tourgide.telangana.SeemoreActivity;
import com.microsoft.tourgide.telangana.komaram.Komaram;
import com.microsoft.tourgide.telangana.mahabubabad.Mahabubabad;
import com.microsoft.tourgide.telangana.mahabubnagar.Mahabubnagar;
import com.microsoft.tourgide.telangana.mancherial.Mancherial;
import com.microsoft.tourgide.telangana.peddapalli.Peddapalli;
import com.microsoft.tourgide.telangana.rajanna.Rajanna;
import com.microsoft.tourgide.telangana.rangareddy.Rangareddy;
import com.microsoft.tourgide.telangana.sangareddy.Sangareddy;
import com.microsoft.tourgide.telangana.siddipet.Siddipet;
import com.microsoft.tourgide.telangana.suryapet.Suryapet;
import com.microsoft.tourgide.telangana.vikarabad.Vikarabad;
import com.microsoft.tourgide.telangana.wanaparthy.Wanaparthy;
import com.microsoft.tourgide.telangana.warangal.Warangal;
import com.microsoft.tourgide.telangana.yadadri.Yadadri;

public class Telangana extends AppCompatActivity implements View.OnClickListener {

    AdapterViewFlipper adapterViewFlipper;

    ImageView back1;
    ImageView adilabad1,yadadri,mahabubabad,mahabubnagar,mancherial,
            peddapalli,rajanna,rangareddy,sangareddy,siddipet,suryapet,
             vikarabad,waanaparthy,warangal,komaram;

    int[] IMAGES = {
            R.drawable.telangana1,
            R.drawable.telangan4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telangana);
        adilabad1=findViewById(R.id.adilabad);
        yadadri=findViewById(R.id.yadadri);
        yadadri.setOnClickListener(this);
        back1 = findViewById(R.id.back1);
        back1.setOnClickListener(this);
        adilabad1.setOnClickListener(this);
        mahabubabad=findViewById(R.id.mahabubabad);
        mahabubabad.setOnClickListener(this);
        mahabubnagar=findViewById(R.id.mahabubnagar);
        mahabubnagar.setOnClickListener(this);
        mancherial=findViewById(R.id.mancherial);
        mancherial.setOnClickListener(this);
        peddapalli=findViewById(R.id.peddapalli);
        peddapalli.setOnClickListener(this);
        rajanna=findViewById(R.id.rajanna);
        rajanna.setOnClickListener(this);
        rangareddy=findViewById(R.id.rangareddy);
        rangareddy.setOnClickListener(this);
        sangareddy=findViewById(R.id.sangareddy);
        sangareddy.setOnClickListener(this);
        siddipet=findViewById(R.id.siddipet);
        siddipet.setOnClickListener(this);
        suryapet=findViewById(R.id.suryapet);
        suryapet.setOnClickListener(this);
        vikarabad=findViewById(R.id.vikarabad);
        vikarabad.setOnClickListener(this);
        waanaparthy=findViewById(R.id.wanaparthy);
        waanaparthy.setOnClickListener(this);
        warangal=findViewById(R.id.warangal);
        warangal.setOnClickListener(this);
        komaram=findViewById(R.id.kommaram);
        komaram.setOnClickListener(this);









        adapterViewFlipper = findViewById(R.id.adpterview);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.adilabad:
                Intent intent1=new Intent(Telangana.this, AdilabadActivity.class);
                View sharedView2= adilabad1;
                String transitionNane2=getString(R.string.pressed2);
                ActivityOptions transiction2=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView2,transitionNane2);
                startActivity(intent1,transiction2.toBundle());
                break;

            case R.id.yadadri:
                Intent intent2=new Intent(Telangana.this, Yadadri.class);
                View sharedView4= yadadri;
                String transitionNane4=getString(R.string.pressed2);
                ActivityOptions transiction4=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView4,transitionNane4);
                startActivity(intent2,transiction4.toBundle());
                break;

            case R.id.mahabubabad:
                Intent intent5=new Intent(Telangana.this, Mahabubabad.class);
                View sharedView5= mahabubabad;
                String transitionNane5=getString(R.string.pressed2);
                ActivityOptions transiction5=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView5,transitionNane5);
                startActivity(intent5,transiction5.toBundle());
                break;


            case R.id.mahabubnagar:
                Intent intent6=new Intent(Telangana.this, Mahabubnagar.class);
                View sharedView6= mahabubnagar;
                String transitionNane6=getString(R.string.pressed2);
                ActivityOptions transiction6=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView6,transitionNane6);
                startActivity(intent6,transiction6.toBundle());
                break;

            case R.id.mancherial:
                Intent intent7=new Intent(Telangana.this, Mancherial.class);
                View sharedView7= mancherial;
                String transitionNane7=getString(R.string.pressed2);
                ActivityOptions transiction7=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView7,transitionNane7);
                startActivity(intent7,transiction7.toBundle());
                break;

            case R.id.peddapalli:
                Intent intent8=new Intent(Telangana.this, Peddapalli.class);
                View sharedView8= peddapalli;
                String transitionNane8=getString(R.string.pressed2);
                ActivityOptions transiction8=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView8,transitionNane8);
                startActivity(intent8,transiction8.toBundle());
                break;

            case R.id.rajanna:
                Intent intent9=new Intent(Telangana.this, Rajanna.class);
                View sharedView9= rajanna;
                String transitionNane9=getString(R.string.pressed2);
                ActivityOptions transiction9=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView9,transitionNane9);
                startActivity(intent9,transiction9.toBundle());
                break;

            case R.id.rangareddy:
                Intent intent10=new Intent(Telangana.this, Rangareddy.class);
                View sharedView10= rangareddy;
                String transitionNane10=getString(R.string.pressed2);
                ActivityOptions transiction10=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView10,transitionNane10);
                startActivity(intent10,transiction10.toBundle());
                break;

            case R.id.sangareddy:
                Intent intent11=new Intent(Telangana.this, Sangareddy.class);
                View sharedView11= sangareddy;
                String transitionNane11=getString(R.string.pressed2);
                ActivityOptions transiction11=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView11,transitionNane11);
                startActivity(intent11,transiction11.toBundle());
                break;

            case R.id.siddipet:
                Intent intent12=new Intent(Telangana.this, Siddipet.class);
                View sharedView12= siddipet;
                String transitionNane12=getString(R.string.pressed2);
                ActivityOptions transiction12=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView12,transitionNane12);
                startActivity(intent12,transiction12.toBundle());
                break;

            case R.id.suryapet:
                Intent intent13=new Intent(Telangana.this, Suryapet.class);
                View sharedView13= suryapet;
                String transitionNane13=getString(R.string.pressed2);
                ActivityOptions transiction13=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView13,transitionNane13);
                startActivity(intent13,transiction13.toBundle());
                break;

            case R.id.vikarabad:
                Intent intent14=new Intent(Telangana.this, Vikarabad.class);
                View sharedView14= vikarabad;
                String transitionNane14=getString(R.string.pressed2);
                ActivityOptions transiction14=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView14,transitionNane14);
                startActivity(intent14,transiction14.toBundle());
                break;

            case R.id.wanaparthy:
                Intent intent15=new Intent(Telangana.this, Wanaparthy.class);
                View sharedView15= waanaparthy;
                String transitionNane15=getString(R.string.pressed2);
                ActivityOptions transiction15=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView15,transitionNane15);
                startActivity(intent15,transiction15.toBundle());
                break;

            case R.id.warangal:
                Intent intent16=new Intent(Telangana.this, Warangal.class);
                View sharedView16= warangal;
                String transitionNane16=getString(R.string.pressed2);
                ActivityOptions transiction16=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView16,transitionNane16);
                startActivity(intent16,transiction16.toBundle());
                break;

            case R.id.kommaram:
                Intent intent17=new Intent(Telangana.this, Komaram.class);
                View sharedView17= komaram;
                String transitionNane17=getString(R.string.pressed2);
                ActivityOptions transiction17=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView17,transitionNane17);
                startActivity(intent17,transiction17.toBundle());
                break;
            case R.id.back1:
                Intent intent22 = new Intent(Telangana.this, MainActivity.class);
                View sharedView1= back1;
                String transitionNane1=getString(R.string.pressed1);
                ActivityOptions transiction1=ActivityOptions.makeSceneTransitionAnimation(Telangana.this,sharedView1,transitionNane1);
                startActivity(intent22,transiction1.toBundle());
                break;

        }
    }
}