package com.microsoft.tourgide.telangana.Adilabad;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.microsoft.tourgide.MainActivity;
import com.microsoft.tourgide.R;

public class Seemoreadilabad extends AppCompatActivity implements View.OnClickListener {
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seemoreadilabad);
        back=findViewById(R.id.back);
        back.setOnClickListener(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back:
                Intent intent=new Intent(Seemoreadilabad.this,AdilabadActivity.class);
                View sharedView= back;
                String transitionNane=getString(R.string.slide1);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(Seemoreadilabad.this,sharedView,transitionNane);
                startActivity(intent,transiction.toBundle());

        }

    }
}