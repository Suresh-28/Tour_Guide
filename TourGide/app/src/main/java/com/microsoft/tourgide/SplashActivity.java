package com.microsoft.tourgide;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.microsoft.tourgide.telangana.Adilabad.AdilabadActivity;

public class SplashActivity extends AppCompatActivity {
    public static  int SPLASH_TIME_OUT=1000;
    TextView textView;
    ProgressBar progressBar;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        progressBar=findViewById(R.id.progress);
        progressBar.setVisibility(View.VISIBLE);


        textView=findViewById(R.id.textView);
        new Handler().postDelayed(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this, Switcher.class);


                overridePendingTransition(R.anim.slide_in_left,0);
                startActivity(intent);


                finish();
            }
        },SPLASH_TIME_OUT);
    }
}