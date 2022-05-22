package com.example.foodreviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.foodreviewproject.databinding.ActivityFastFoodDetailsBinding;
import com.example.foodreviewproject.databinding.ActivityFoodsDetailsBinding;

public class FastFoodDetailsActivity extends AppCompatActivity {

    ActivityFastFoodDetailsBinding binding;
    Button btnLocation;
    double locateX, locateY;
    String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFastFoodDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnLocation = findViewById(R.id.ff_details_location);

        Intent intent = this.getIntent();

        if( intent != null ){

            String name = intent.getStringExtra("name");
            String price = intent.getStringExtra("price");
            String material = intent.getStringExtra("material");
            int imageId = intent.getIntExtra("imageId", R.drawable.spagetti);
            location = intent.getStringExtra("location");
            String method = intent.getStringExtra("method");
            locateX = intent.getDoubleExtra("locateX", 10.776209144278162);
            locateY = intent.getDoubleExtra("locateY", 106.66736823202744);

            binding.ffDetailsName.setText(name);
            binding.ffDetailsPrice.setText(price);
            binding.ffDetailsMaterial.setText(material);
            binding.ffDetailsImg.setImageResource(imageId);
            binding.ffDetailsLocation.setText(location);
            binding.ffDetailsMethod.setText(method);

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