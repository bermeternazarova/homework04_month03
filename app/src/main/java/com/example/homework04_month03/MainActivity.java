package com.example.homework04_month03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CarClickListener{

    RecyclerView recyclerView;
    private ArrayList<String>car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        car=new ArrayList<>();
        recyclerView=findViewById(R.id.car_rc);
        carSetName();
        recyclerView.setAdapter(new CarAdapter(car,this));
    }
    public void carSetName(){
        car.add("BMW");
        car.add("TOYOTA");
        car.add("HONDA");
        car.add("FORD");
        car.add("SUZUKI");
        car.add("LEXUS");
        car.add("NISSAN");
        car.add("TESLA");
        car.add("IMPREZA_WRX");
        car.add("RENAULT");
        car.add("FERRARI");
        car.add("MERCEDES");
        car.add("AUDI");
    }

    @Override
    public void carClickListener(String car) {
        //Toast.makeText(MainActivity.this, "work", Toast.LENGTH_SHORT).show();
        //Toast.makeText(getApplicationContext(),car, Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(MainActivity.this,SecondActivity.class);
        String word= car;
        intent.putExtra("word",word);
        startActivity(intent);
    }}