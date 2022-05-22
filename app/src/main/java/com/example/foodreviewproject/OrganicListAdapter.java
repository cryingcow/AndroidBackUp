package com.example.foodreviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class OrganicListAdapter extends ArrayAdapter<Organic> {
    ImageView imageView;
    TextView Name, Price, Material, Method, Location;
    public OrganicListAdapter(Context context, ArrayList<Organic> organicArrayList){

        super(context, R.layout.organic_list_item, organicArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Organic organic = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.organic_list_item, parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.organic_img);
        TextView name = convertView.findViewById(R.id.organic_name);
        TextView price = convertView.findViewById(R.id.organic_price);
        imageView.setImageResource(organic.imageId);
        name.setText(organic.organic_name);
        price.setText(organic.organic_price);

        return convertView;
    }

}
