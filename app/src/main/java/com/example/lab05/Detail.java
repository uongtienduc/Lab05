package com.example.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    TextView ten, gia, chitiet;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ten = findViewById(R.id.ten);
        ten.setText(getIntent().getStringExtra("name"));

        gia = findViewById(R.id.gia);
        gia.setText(getIntent().getStringExtra("price"));

        chitiet = findViewById(R.id.chitiet);
        chitiet.setText(getIntent().getStringExtra("about"));

        img = findViewById(R.id.img);
        img.setImageResource(getIntent().getIntExtra("img",0));
    }
}