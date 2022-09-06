package com.microsoft.tourgide.telangana.nagarkurnool.places.place;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.microsoft.tourgide.R;

class CustomAdaptergaya extends BaseAdapter {

    Context context;
    int[] images;
    LayoutInflater layoutInflater;

    public CustomAdaptergaya(Context applicationContext, int[] images) {
        this.context = applicationContext;
        this.images = images;
        layoutInflater = (LayoutInflater.from(applicationContext));

    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.telanganalistitem, null);
        ImageView imageView = convertView.findViewById(R.id.imageview1);
        imageView.setImageResource(images[position]);
        return convertView;
    }
}
