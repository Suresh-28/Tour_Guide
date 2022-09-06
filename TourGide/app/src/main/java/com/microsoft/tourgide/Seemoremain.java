package com.microsoft.tourgide;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Seemoremain extends AppCompatActivity implements View.OnClickListener {
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seemoremain);
        back=findViewById(R.id.back);
        back.setOnClickListener(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back:
                Intent intent=new Intent(Seemoremain.this,MainActivity.class);
                View sharedView= back ;
                String transitionNane=getString(R.string.slide2);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(Seemoremain.this,sharedView,transitionNane);
                startActivity(intent,transiction.toBundle());


        }

    }
}