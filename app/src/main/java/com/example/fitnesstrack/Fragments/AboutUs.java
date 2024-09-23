package com.example.fitnesstrack.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.fitnesstrack.R;

public class AboutUs extends Fragment {
LinearLayout layout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_about_us, container, false);

layout = view.findViewById(R.id.linear_layout1);
layout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        BottomSheetFragment bottomSheetFragment = new BottomSheetFragment();
        bottomSheetFragment.show(getActivity().getSupportFragmentManager(), bottomSheetFragment.getTag());
    }
});

        ImageView imageView = view.findViewById(R.id.run_exercise_image1);
        Glide.with(this)
                .load(R.drawable.fitnesspuc) // Replace with your image source
                .apply(RequestOptions.bitmapTransform(new RoundedCorners(20))) // 20dp corner radius
                .into(imageView);

        return view;

    }
}