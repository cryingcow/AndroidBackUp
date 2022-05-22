package com.example.foodreviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.foodreviewproject.databinding.ActivityFoodsDetailsBinding;

public class FoodsDetailsActivity extends AppCompatActivity {

    ActivityFoodsDetailsBinding binding;
    Button btnLocation;
    double locateX, locateY;
    String location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFoodsDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btnLocation = findViewById(R.id.foods_details_location);
        Intent intent = this.getIntent();

        if( intent != null ){

            String name = intent.getStringExtra("name");
            String price = intent.getStringExtra("price");
            String material = intent.getStringExtra("material");
            int imageId = intent.getIntExtra("imageId", R.drawable.bunbo);
            String location = intent.getStringExtra("location");
            String method = intent.getStringExtra("method");
            locateX = intent.getDoubleExtra("locateX", 10.776209144278162);
            locateY = intent.getDoubleExtra("locateY", 106.66736823202744);

            binding.foodsDetailsName.setText(name);
            binding.foodsDetailsPrice.setText(price);
            binding.foodsDetailsMaterial.setText(material);
            binding.foodsDetailsImg.setImageResource(imageId);
            binding.foodsDetailsLocation.setText(location);
            binding.foodsDetailsMethod.setText(method);

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