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

import org.w3c.dom.Text;

import java.util.ArrayList;

public class FoodsListAdapter extends ArrayAdapter<Foods> {

    public FoodsListAdapter(Context context, ArrayList<Foods> foodsArrayList){
        super(context, R.layout.foods_list_item, foodsArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Foods foods = getItem(position);

        if(convertView == null ){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.foods_list_item,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.foods_img);
        TextView Name =  convertView.findViewById(R.id.foods_name);
        TextView Price = convertView.findViewById(R.id.foods_price);
//        TextView Material = convertView.findViewById(R.id.foods_details_material);
//        TextView Method = convertView.findViewById(R.id.foods_details_method);
//        TextView Location = convertView.findViewById(R.id.foods_details_location);


        imageView.setImageResource(foods.imageId);
        Name.setText(foods.foods_name);
        Price.setText(foods.foods_price);
//        Material.setText(foods.foods_material);
//        Method.setText(foods.foods_method);
//        Location.setText(foods.foods_location);


        return convertView;
    }
}
