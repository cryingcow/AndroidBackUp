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

public class FastFoodListAdapter extends ArrayAdapter<FastFood> {

    ImageView imageView;
    TextView Name, Price, Material, Method, Location;

    public FastFoodListAdapter(Context context, ArrayList<FastFood> fastfoodArrayList){
        super(context, R.layout.fast_foods_list_item, fastfoodArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        FastFood fastfood = getItem(position);

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fast_foods_list_item, parent, false);

        }

        ImageView imageView = convertView.findViewById(R.id.fast_foods_img);
        TextView Name = convertView.findViewById(R.id.fast_foods_name);
        TextView Price = convertView.findViewById(R.id.fast_foods_price);


        imageView.setImageResource(fastfood.imageId);
        Name.setText(fastfood.ff_name);
        Price.setText(fastfood.ff_price);


        return convertView;
    }
}
