package com.microsoft.tourgide.telangana.Adilabad.places.place;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.ImageView;
import android.widget.Toast;

import com.microsoft.tourgide.R;
import com.microsoft.tourgide.telangana.Adilabad.AdilabadActivity;
import com.microsoft.tourgide.telangana.Adilabad.places.HotelKunthal;
import com.microsoft.tourgide.telangana.Adilabad.places.Hotelskawal;

import java.util.Locale;

public class HotelRavi extends AppCompatActivity {

    ImageView back5;


    ImageView website;
    ImageView direction;
    AdapterViewFlipper adapterViewFlipper;
    int[] IMAGES={
            R.drawable.ravi1,
            R.drawable.ravi2,
            R.drawable.ravi4,
            R.drawable.ravi3,
            R.drawable.ravi5

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_ravi);
        direction=findViewById(R.id.direction);
        direction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri=String.format(Locale.ENGLISH,"http://maps.google.com/maps?q=loc:%f,%f",18.751127,79.505922);
                Intent location=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(location);
            }
        });
        website=findViewById(R.id.website);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trip.com/hotels/adilabad-hotel-detail-22798456/hotel-ravi-teja/?cityId=650167&checkIn=2021-07-22&checkOut=2021-07-23&adult=2&children=0&crn=1&ages=&travelpurpose=0&curr=INR&fgt=1&hasAidInUrl=true&mincurr=INR&minprice=1390.00&mproom=768443779&link=title&hoteluniquekey=H4sIAAAAAAAAAOPK5GKSYBJi4mCUiudo7t72jkmI08TQwMjYzMDAyOAVq0Wvn-OtnEDuU1viHDwTHs_fx2WU6BDAMYPxx4H3XCsYGTcyap0v6o-u0nXYwch0kZEBBHZMdXgIYYXMcHjB-OFwm3YXE6OTlEKSQaJJomGieVqakaGJYWqaoYFxapKZqYGFuWGigZFhqgKjxu3Na1rZPBiD2AydzU2cDKNkuJg9_YIE10z4NDlr_jZ7KRBPEcZLYk3Ni4-IyFjKXpEJADURB2_JAAAA"));
                startActivity(browser);
            }
        });
        back5=findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(HotelRavi.this, HotelKunthal.class);
                View sharedView= back5;
                String transitionNane=getString(R.string.pressed5);
                ActivityOptions transiction=ActivityOptions.makeSceneTransitionAnimation(HotelRavi.this,sharedView,transitionNane);
                startActivity(intent1,transiction.toBundle());

            }
        });


        adapterViewFlipper=findViewById(R.id.adpterview);
        CustomAdapter311 customAdapter=new CustomAdapter311(getApplicationContext(),IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);
    }
}