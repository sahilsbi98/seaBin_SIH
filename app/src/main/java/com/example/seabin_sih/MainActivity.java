package com.example.seabin_sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView setCoordinates;
    ImageView liveLocation, bulkySpot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCoordinates = findViewById(R.id.setCoordinates);
        liveLocation = findViewById(R.id.liveLocation);
        bulkySpot = findViewById(R.id.bulkyWaste);

        setCoordinates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, setCoordinates.class);
                startActivity(intent);
            }
        });

        liveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, liveLocation.class);
                startActivity(intent);
            }
        });

        bulkySpot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, bulkySpots.class);
                startActivity(intent);
            }
        });
    }

}
