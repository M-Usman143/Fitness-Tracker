package com.example.fitnesstrack.Activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.example.fitnesstrack.Fragments.AboutUs;
import com.example.fitnesstrack.Fragments.Home;
import com.example.fitnesstrack.Fragments.Profile;
import com.example.fitnesstrack.Fragments.Settings;
import com.example.fitnesstrack.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        // BottomNavigationView setup
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set the default fragment when the activity starts (if there's no saved instance)
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new Home())
                    .commit();
        }

        // Handling fragment selection when a bottom navigation item is selected using if-else
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                int itemId = item.getItemId();

                if (itemId == R.id.nav_home) {
                    selectedFragment = new Home();
                } else if (itemId == R.id.nav_workout) {
                    selectedFragment = new AboutUs();
                } else if (itemId == R.id.nav_progress) {
                    selectedFragment = new Profile();
                } else if (itemId == R.id.nav_profile) {
                    selectedFragment = new Settings();
                }

                // Replace the current fragment with the selected fragment
                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, selectedFragment)
                            .commit();
                }

                return true;
            }
        });
            }
        }
