package com.microsoft.tourgide.telangana.peddapalli;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.microsoft.tourgide.R;

class CustomAdapter20 extends BaseAdapter {

    Context context;
    int[] images;
    LayoutInflater layoutInflater;

    public CustomAdapter20(Context applicationContext, int[] images) {
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
