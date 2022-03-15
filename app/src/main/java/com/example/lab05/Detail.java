package com.example.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
TextView ten, gia, chitiet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ten = findViewById(R.id.ten);
        ten.setText(getIntent().getStringExtra("name"));
    }
}