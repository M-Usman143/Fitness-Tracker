package com.example.fitnesstrack.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import com.example.fitnesstrack.Activities.Cycling;
import com.example.fitnesstrack.Activities.Legss;
import com.example.fitnesstrack.Activities.Running;
import com.example.fitnesstrack.Activities.Siwm;
import com.example.fitnesstrack.Activities.SleepTracker;
import com.example.fitnesstrack.Activities.WaterIntaker;
import com.example.fitnesstrack.Activities.Yoga;
import com.example.fitnesstrack.R;

public class Home extends Fragment {
    ImageView running , swiming , cycling , legging , yoga;
    AppCompatButton sleeptracker , waterintaker;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        running = view.findViewById(R.id.run_icons);
        swiming = view.findViewById(R.id.swimmings);
        cycling = view.findViewById(R.id.cyclings);
        legging = view.findViewById(R.id.legss);
        yoga = view.findViewById(R.id.yogass);
        sleeptracker = view.findViewById(R.id.sleeptrackers);
        waterintaker = view.findViewById(R.id.waterintakers);

        moving_btn();

        return view;
    }

  private void moving_btn(){

        running.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the new Activity
                Intent intent = new Intent(getActivity(), Running.class);
                startActivity(intent);
            }
        });

        cycling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the new Activity
                Intent intent = new Intent(getActivity(), Cycling.class);
                startActivity(intent);
            }
        });


        swiming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the new Activity
                Intent intent = new Intent(getActivity(), Siwm.class);
                startActivity(intent);
            }
        });


        legging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the new Activity
                Intent intent = new Intent(getActivity(), Legss.class);
                startActivity(intent);
            }
        });


        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the new Activity
                Intent intent = new Intent(getActivity(), Yoga.class);
                startActivity(intent);
            }
        });

      sleeptracker.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              // Create an Intent to start the new Activity
              Intent intent = new Intent(getActivity(), SleepTracker.class);
              startActivity(intent);
          }
      });

      waterintaker.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              // Create an Intent to start the new Activity
              Intent intent = new Intent(getActivity(), WaterIntaker.class);
              startActivity(intent);
          }
      });

    }
}
