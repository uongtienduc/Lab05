package com.example.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Donut> listDonut;
    private DonutApdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        listDonut = new ArrayList<>();
        listDonut.add(new Donut("Tasty Donut","Spicy tasty donut family",R.drawable.donut_yellow_1,"$10.00"));
        listDonut.add(new Donut("Pink Donut","Spicy tasty donut family",R.drawable.tasty_donut_1,"$20.00"));
        listDonut.add(new Donut("Floating Donut","Spicy tasty donut family",R.drawable.green_donut_1,"$30.00"));
        listDonut.add(new Donut("Tasty Donut","Spicy tasty donut family",R.drawable.donut_red_1,"$40.00"));
        listDonut.add(new Donut("Tasty Donut","Spicy tasty donut family",R.drawable.donut_red_1,"$40.00"));
        listDonut.add(new Donut("Tasty Donut","Spicy tasty donut family",R.drawable.donut_red_1,"$40.00"));
        adapter = new DonutApdapter(this,R.layout.custom_list_view_donut,listDonut);
        listView.setAdapter(adapter);
    }
}