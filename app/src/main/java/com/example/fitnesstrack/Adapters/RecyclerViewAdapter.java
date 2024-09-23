package com.example.fitnesstrack.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitnesstrack.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<String> titles;
    private List<Integer> images;
    private List<String> minutes;
    private List<Integer> progress;

    public RecyclerViewAdapter(List<String> titles, List<Integer> images , List<String> minutes ,List<Integer> progress) {
        this.titles = titles;
        this.images = images;
        this.minutes = minutes;
        this.progress = progress;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_workouts, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemTitle.setText(titles.get(position));
        holder.itemImage.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemTitle;
        TextView itemSubtitle1;
        TextView itemSubtitle2;
        ProgressBar itemProgressBar;;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.run_exercise_image1);           // ImageView for exercise
            itemTitle = itemView.findViewById(R.id.title_text);           // Main title TextView
            itemSubtitle1 = itemView.findViewById(R.id.minutes);   // First subtitle TextView
            itemProgressBar = itemView.findViewById(R.id.lineProgressBar);
        }
    }
}
