package com.microsoft.tourgide.telangana.Adilabad.places;


import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.microsoft.tourgide.FragementOne;
import com.microsoft.tourgide.FragementThree;
import com.microsoft.tourgide.FragmentTwo;
import com.microsoft.tourgide.R;
import com.microsoft.tourgide.Switcher;
import com.microsoft.tourgide.telangana.Adilabad.AdilabadActivity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class KunthalaWaterfall extends AppCompatActivity {
    ViewPager vp;

    ImageView hotels;
    ImageView back3;
    ImageView direction;
    ImageView shared;

    AdapterViewFlipper adapterViewFlipper;
    int[] IMAGES={
            R.drawable.kunthala1,
            R.drawable.kunthala2,
            R.drawable.kunthala3,
            R.drawable.kunthala4,
            R.drawable.kunthala5,
            R.drawable.kunthala6

    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kunthala_waterfall);
        direction=findViewById(R.id.direction);
        shared=findViewById(R.id.share);
        shared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text="Hey look at this place";
                Uri uri=Uri.parse("C:\\Users\\sreerama\\AndroidStudioProjects\\TourGide\\app\\src\\main\\res\\drawable\\kunthala1.jpeg");
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
                String uri=String.format(Locale.ENGLISH,"http://maps.google.com/maps?q=loc:%f,%f",19.28466281380903,78.50323543971986);
                Intent location=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(location);
            }
        });
        back3=findViewById(R.id.back3);
        back3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(KunthalaWaterfall.this, AdilabadActivity.class);
                View sharedView= back3;
                String transitionNane=getString(R.string.kawaliflipper);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(KunthalaWaterfall.this,sharedView,transitionNane);
                startActivity(intent1,transiction.toBundle());

            }
        });

        hotels=findViewById(R.id.hotels);
        hotels.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KunthalaWaterfall.this,HotelKunthal.class);
                View sharedView= hotels;
                String transitionNane=getString(R.string.kawaliflipper);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(KunthalaWaterfall.this,sharedView,transitionNane);
                startActivity(intent,transiction.toBundle());

            }
        });



        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapter30 customAdapter=new CustomAdapter30(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);


        vp=findViewById(R.id.viewpager);
        setupViewPager();







    }

    private void setupViewPager() {
        SectionPagerAdapter adapter=new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragementkawali1());
        adapter.addFragment(new Fragmentkawali2());
        adapter.addFragment(new Fragementkawali3());

        ViewPager vp=findViewById(R.id.viewpager);
        vp.setAdapter(adapter);




    }

    private class SectionPagerAdapter extends FragmentPagerAdapter {

        private  final List<Fragment> fragmentList=new ArrayList<>();
        public SectionPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        public void addFragment(Fragment fragment){
            fragmentList.add(fragment);
        }
    }


}