package com.example.seabin_sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class setCoordinates extends AppCompatActivity {

    Button setButton;
    EditText latitudeText;
    EditText longitudeText;
    TextView latitudeView;
    TextView longitudeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_coordinates);

        setButton = findViewById(R.id.setButton);

        latitudeText = findViewById(R.id.latitude_text);
        longitudeText = findViewById(R.id.longitude_text);

        latitudeView = findViewById(R.id.latitudeView);
        longitudeView = findViewById(R.id.longitudeView);

        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                latitudeView.setText( latitudeText.getText().toString() );
                longitudeView.setText( longitudeText.getText().toString() );
            }
        });
    }
}
