package com.example.homework04_month03;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

  public class CarViewHolder extends RecyclerView.ViewHolder {

      TextView carTv;
      LinearLayout carCt;

      public CarViewHolder(@NonNull View itemView) {
          super(itemView);

          carTv=itemView.findViewById(R.id.car_tv);
          carCt=itemView.findViewById(R.id.car_ct);
      }

      public void  bind(String carName){
          carTv.setText(carName);

      }}
