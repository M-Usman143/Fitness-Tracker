package com.example.fitnesstrack.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fitnesstrack.Adapters.CommunityAdapter;
import com.example.fitnesstrack.Models.Profiles;
import com.example.fitnesstrack.R;

import java.util.ArrayList;
import java.util.List;

public class Profile extends Fragment {
    private RecyclerView recyclerView;
    private CommunityAdapter adapter;
    private List<Profiles> profilesList;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile, container, false);
        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.community_recycler);

        // Initialize profile list
        profilesList = new ArrayList<>();

        // Add sample data
        profilesList.add(new Profiles("John Doe", "Exercise regularly", R.drawable.st));
        profilesList.add(new Profiles("Jane Smith", "Drink water often", R.drawable.userperson1));
        profilesList.add(new Profiles("Emily Johnson", "Keep moving daily", R.drawable.tea));
        profilesList.add(new Profiles("Mike Brown", "Eat healthy", R.drawable.tea));
        profilesList.add(new Profiles("David Wilson", "Get enough sleep", R.drawable.userperson1));

        // Initialize the adapter and set it to the RecyclerView
        adapter = new CommunityAdapter(profilesList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

        return view;
    }
}