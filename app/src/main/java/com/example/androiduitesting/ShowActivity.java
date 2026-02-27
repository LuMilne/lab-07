package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    TextView showCity;
    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Select content view
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);
        // Get views within
        showCity = findViewById(R.id.show_city);
        backButton = findViewById(R.id.show_back);
        // Assign city name to showCity

        // Allow backButton to return to activity_main

    }
}
