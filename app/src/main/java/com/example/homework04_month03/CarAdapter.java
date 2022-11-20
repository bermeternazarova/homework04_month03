package com.example.homework04_month03;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarViewHolder>  {

     private ArrayList<String> carNames;
     private  CarClickListener carClickListener;


     public CarAdapter(ArrayList<String> carNames,CarClickListener carClickListener){
         this.carNames=carNames;
         this.carClickListener=carClickListener;

     }

     @NonNull
     @Override
     public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         return new CarViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car,parent,false));
     }

     @SuppressLint("RecyclerView")
     @Override
     public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
    holder.bind(carNames.get(position));

    holder.carCt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            carClickListener.carClickListener(carNames.get(position));
        }
    });}

     @Override
     public int getItemCount() {
         return carNames.size();
     }}
