package com.microsoft.tourgide;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.microsoft.tourgide.telangana.Adilabad.AdilabadActivity;
import com.microsoft.tourgide.telangana.Adilabad.places.Kawaliwildlife;

import java.sql.BatchUpdateException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    ImageView imageView4;
    TextView seemore;

    final Context context = this;

    Button jammu;
    Button himachal;
    Button punjab;
    Button uttarkhand;
    Button haryana;
    Button uttar;
    Button rajasthan;
    Button gujarat;
    Button maharsthra;
    Button karnataka;
    Button kerla;
    Button tamilnadu;
    Button ap;
    Button madhya;
    Button telangana;
    Button chattighar;
    Button orissa;
    Button jharkhand;
    Button bihar;
    Button westbengal;
    Button sikkim;
    Button meghalaya;
    Button assam;
    Button arunachal;
    Button tripura;
    Button mizoram;
    Button manipur;
    Button  nagaland;
    Button goa;



    @Override
    public void onBackPressed() {
        showAlertDialog();
    }

    private void showAlertDialog() {
        final AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Exit");
        builder.setMessage("Are you sure want to leave?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();


            }
        });

        builder.create().show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jammu=findViewById(R.id.jammu);
        himachal=findViewById(R.id.himachal);
        punjab=findViewById(R.id.punjab);
        uttarkhand=findViewById(R.id.uttarkhand);
        haryana=findViewById(R.id.haryana);
        uttar=findViewById(R.id.uttar);
        rajasthan=findViewById(R.id.rajesthan);
        gujarat=findViewById(R.id.gujarath);
        maharsthra=findViewById(R.id.maharastre);
        karnataka=findViewById(R.id.karnaaka);
        kerla=findViewById(R.id.kerala);
        tamilnadu=findViewById(R.id.tamil);
        ap=findViewById(R.id.ap);
        telangana=findViewById(R.id.telangana);
        chattighar=findViewById(R.id.chattisgarh);
        orissa=findViewById(R.id.orissa);
        jharkhand=findViewById(R.id.jarkhand);
        bihar=findViewById(R.id.bihar);
        westbengal=findViewById(R.id.westbengal);
        sikkim=findViewById(R.id.sikkim);
        meghalaya=findViewById(R.id.megalaya);
        assam=findViewById(R.id.assam);
        arunachal=findViewById(R.id.arunachal);
        tripura=findViewById(R.id.tripura);
        mizoram=findViewById(R.id.mizoram);
        manipur=findViewById(R.id.manipur);
        nagaland=findViewById(R.id.nagaland);
        goa=findViewById(R.id.goa);
        madhya=findViewById(R.id.madhya);
        seemore=findViewById(R.id.seemore);



        seemore.setOnClickListener(this);
        madhya.setOnClickListener(this);
        jammu.setOnClickListener(this);
        himachal.setOnClickListener(this);
        punjab.setOnClickListener(this);
        uttarkhand.setOnClickListener(this);
        haryana.setOnClickListener(this);
        uttar.setOnClickListener(this);
        rajasthan.setOnClickListener(this);
        gujarat.setOnClickListener(this);
        maharsthra.setOnClickListener(this);
        karnataka.setOnClickListener(this);
        kerla.setOnClickListener(this);
        tamilnadu.setOnClickListener(this);
        ap.setOnClickListener(this);
        telangana.setOnClickListener(this);
        chattighar.setOnClickListener(this);
        orissa.setOnClickListener(this);
        jharkhand.setOnClickListener(this);
        bihar.setOnClickListener(this);
        westbengal.setOnClickListener(this);
        sikkim.setOnClickListener(this);
        meghalaya.setOnClickListener(this);
        assam.setOnClickListener(this);
        arunachal.setOnClickListener(this);
        tripura.setOnClickListener(this);
        mizoram.setOnClickListener(this);
        manipur.setOnClickListener(this);
        nagaland.setOnClickListener(this);
        goa.setOnClickListener(this);


    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.jammu:
                Toast toast1=Toast.makeText(MainActivity.this,"Jammu Kashmir",Toast.LENGTH_SHORT);
                toast1.show();
                break;

            case R.id.ap:
                Toast toast2=Toast.makeText(MainActivity.this,"Andhra pradesh", Toast.LENGTH_SHORT);
                toast2.show();
                break;

            case R.id.arunachal:
                Toast toast3=Toast.makeText(MainActivity.this,"Arunachal pradesh",Toast.LENGTH_SHORT);
                toast3.show();
                break;
            case R.id.assam:
                Toast toast4=Toast.makeText(MainActivity.this,"Assam",Toast.LENGTH_SHORT);
                toast4.show();
                break;
            case R.id.bihar:
                Toast toast5=Toast.makeText(MainActivity.this,"Bihar",Toast.LENGTH_SHORT);
                toast5.show();
                break;
            case R.id.chattisgarh:
                Toast toast6=Toast.makeText(MainActivity.this,"Chattisharh",Toast.LENGTH_SHORT);
                toast6.show();
                break;
            case R.id.gujarath:
                Toast toast7=Toast.makeText(MainActivity.this,"Gujjarath",Toast.LENGTH_SHORT);
                toast7.show();
                break;
            case R.id.haryana:
                Toast toast8=Toast.makeText(MainActivity.this,"Haryana",Toast.LENGTH_SHORT);
                toast8.show();
                break;
            case R.id.himachal:
                Toast toast9=Toast.makeText(MainActivity.this,"Himachal pradesh",Toast.LENGTH_SHORT);
                toast9.show();
                break;
            case R.id.jarkhand:
                Toast toast10=Toast.makeText(MainActivity.this,"Jarkhand",Toast.LENGTH_SHORT);
                toast10.show();
                break;
            case R.id.karnaaka:
                Toast toast11=Toast.makeText(MainActivity.this,"Karnataka",Toast.LENGTH_SHORT);
                toast11.show();
                break;
            case R.id.kerala:
                Toast toast12=Toast.makeText(MainActivity.this,"Kerala",Toast.LENGTH_SHORT);
                toast12.show();
                break;
            case R.id.madhya:
                Toast toast13=Toast.makeText(MainActivity.this,"Madhya pradesh",Toast.LENGTH_SHORT);
                toast13.show();
                break;
            case R.id.maharastre:
                Toast toast14=Toast.makeText(MainActivity.this,"Maharastra",Toast.LENGTH_SHORT);
                toast14.show();
                break;
            case R.id.manipur:
                Toast toast15=Toast.makeText(MainActivity.this,"Manipur",Toast.LENGTH_SHORT);
                toast15.show();
                break;
            case R.id.megalaya:
                Toast toast16=Toast.makeText(MainActivity.this,"Meghalaya",Toast.LENGTH_SHORT);
                toast16.show();
                break;
            case R.id.mizoram:
                Toast toast17=Toast.makeText(MainActivity.this,"Mizoram",Toast.LENGTH_SHORT);
                toast17.show();
                break;
            case R.id.nagaland:
                Toast toast18=Toast.makeText(MainActivity.this,"Nagaland",Toast.LENGTH_SHORT);
                toast18.show();
                break;
            case R.id.orissa:
                Toast toast19=Toast.makeText(MainActivity.this,"Orissa",Toast.LENGTH_SHORT);
                toast19.show();
                break;
            case R.id.punjab:
                Toast toast20=Toast.makeText(MainActivity.this,"Punjab",Toast.LENGTH_SHORT);
                toast20.show();
                break;
            case R.id.rajesthan:
                Toast toast21=Toast.makeText(MainActivity.this,"Ragesthan",Toast.LENGTH_SHORT);
                toast21.show();
                break;
            case R.id.sikkim:
                Toast toast22=Toast.makeText(MainActivity.this,"Sikkim",Toast.LENGTH_SHORT);
                toast22.show();
                break;
            case R.id.tamil:
                Toast toast23=Toast.makeText(MainActivity.this,"TamilNadu",Toast.LENGTH_SHORT);
                toast23.show();
                break;
            case R.id.telangana:
                Intent intent=new Intent(MainActivity.this, Telangana.class);
                View sharedView= telangana;
                String transitionNane=getString(R.string.kawaliflipper);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,sharedView,transitionNane);
                startActivity(intent,transiction.toBundle());
                Toast toast=Toast.makeText(MainActivity.this,"Welcome TO Telangana",Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.tripura:
                Toast toast25=Toast.makeText(MainActivity.this,"Tripura",Toast.LENGTH_SHORT);
                toast25.show();
                break;
            case R.id.uttar:
                Toast toast26=Toast.makeText(MainActivity.this,"Uttarpradesh",Toast.LENGTH_SHORT);
                toast26.show();
                break;
            case R.id.uttarkhand:
                Toast toast27=Toast.makeText(MainActivity.this,"Uttarkhand",Toast.LENGTH_SHORT);
                toast27.show();
                break;
            case R.id.westbengal:
                Toast toast28=Toast.makeText(MainActivity.this,"West Bengal",Toast.LENGTH_SHORT);
                toast28.show();
                break;
            case R.id.goa:
                Toast toast29=Toast.makeText(MainActivity.this,"Goa",Toast.LENGTH_SHORT);
                toast29.show();
                break;
            case R.id.seemore:
                Intent intent1=new Intent(MainActivity.this,Seemoremain.class);
                View sharedView1= seemore;
                String transitionNane1=getString(R.string.slide1);
                ActivityOptions transiction1=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,sharedView1,transitionNane1);
                startActivity(intent1,transiction1.toBundle());


        }



    }
}