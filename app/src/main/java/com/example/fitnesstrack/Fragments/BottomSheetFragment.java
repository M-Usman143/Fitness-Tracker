package com.example.fitnesstrack.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitnesstrack.Adapters.RecyclerViewAdapter;
import com.example.fitnesstrack.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;

public class BottomSheetFragment extends BottomSheetDialogFragment {

    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    List<String> titles;
    List<String> minutes;
    List<Integer> images;
    List<Integer> progress;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false);

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView);

        // Initialize lists for titles, subtitles, images, and progress values
        titles = new ArrayList<>();
        minutes = new ArrayList<>();
        images = new ArrayList<>();
        progress = new ArrayList<>();

        // Sample data
        titles.add("Mountain Pose");
        minutes.add("Distance: 5km");
        progress.add(70); // Progress out of 100

        titles.add("Downward Facing");
        minutes.add("Distance: 2km");
        progress.add(50); // Progress out of 100


        titles.add("Warrior I Pose");
        minutes.add("Distance: 2km");
        progress.add(50);

        titles.add("Tree Pose ");
        minutes.add("Distance: 2km");
        progress.add(50);

        titles.add("Child’s Pose");
        minutes.add("Distance: 2km");
        progress.add(50);


        titles.add("Cobra Pose");
        minutes.add("Distance: 2km");
        progress.add(50);


        // Add sample images, replace with actual drawables
        images.add(R.drawable.yoga); // Replace with actual drawables
        images.add(R.drawable.yoga);
        images.add(R.drawable.yoga);
        images.add(R.drawable.yoga);
        images.add(R.drawable.yoga);
        images.add(R.drawable.yoga);
        images.add(R.drawable.yoga);

        // Initialize adapter and set it to the RecyclerView
        recyclerViewAdapter = new RecyclerViewAdapter(titles,images, minutes , progress);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }
}
