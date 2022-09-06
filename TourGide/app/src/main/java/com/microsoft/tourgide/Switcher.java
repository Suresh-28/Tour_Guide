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
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.microsoft.tourgide.telangana.Adilabad.AdilabadActivity;

import java.util.ArrayList;
import java.util.List;

public class Switcher extends AppCompatActivity {

    Button continues;
    ViewPager viewPager;
    RadioGroup radioGroup;
    RadioButton r1,r2,r3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switcher);


        viewPager=findViewById(R.id.viewpager);
        radioGroup=findViewById(R.id.radigp);
        r1=findViewById(R.id.radio1);
        r2=findViewById(R.id.radio2);
        r3=findViewById(R.id.radio3);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                radioGroup.check(radioGroup.getChildAt(position).getId());


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });





        continues=findViewById(R.id.continues);
        continues.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Switcher.this,MainActivity.class);

                overridePendingTransition(R.anim.slide_in_left,0);
                startActivity(intent);

                finish();
            }
        });


        setupViewPager();


    }



    private void setupViewPager() {
        SectionPagerAdapter adapter=new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragementOne());
        adapter.addFragment(new FragmentTwo());
        adapter.addFragment(new FragementThree());

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