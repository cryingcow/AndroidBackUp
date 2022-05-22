package com.example.foodreviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.foodreviewproject.databinding.ActivityDrinksDetailsBinding;

public class DrinksDetailsActivity extends AppCompatActivity {

    ActivityDrinksDetailsBinding binding;
    Button btnLocation;
    double locateX, locateY;
    String location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDrinksDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnLocation = findViewById(R.id.drinks_details_location);
        Intent intent = this.getIntent();

        if( intent != null ){

            String name = intent.getStringExtra("name");
            String price = intent.getStringExtra("price");
            String material = intent.getStringExtra("material");
            int imageId = intent.getIntExtra("imageId", R.drawable.cfcapuchino);
            location = intent.getStringExtra("location");
            String method = intent.getStringExtra("method");
            locateX = intent.getDoubleExtra("locateX", 10.776209144278162);
            locateY = intent.getDoubleExtra("locateY", 106.66736823202744);

            binding.drinksDetailsName.setText(name);
            binding.drinksDetailsPrice.setText(price);
            binding.drinksDetailsMaterial.setText(material);
            binding.drinksDetailsImg.setImageResource(imageId);
            binding.drinksDetailsLocation.setText(location);
            binding.drinksDetailsMethod.setText(method);
        }
        btnLocation.setOnClickListener(view -> {
            Intent intent1 = new Intent(getApplicationContext(), MapsActivity.class);
            intent1.putExtra("locateX", locateX);
            intent1.putExtra("locateY", locateY);
            intent1.putExtra("location", location);

            startActivity(intent1);
        });

    }
}