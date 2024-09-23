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

import com.example.fitnesstrack.Models.Profiles;
import com.example.fitnesstrack.R;

import java.util.List;

public class CommunityAdapter extends RecyclerView.Adapter<CommunityAdapter.ViewHolder> {

    private List<Profiles> profilesList;
    private Context context;

    // Constructor
    public CommunityAdapter(List<Profiles> profilesList, Context context) {
        this.profilesList = profilesList;
        this.context=context;
    }

    // ViewHolder Class
    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profileImage;
        TextView profileName, fitnessTip, rank;
        ProgressBar progressBar;

        public ViewHolder(View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.profile_image);
            profileName = itemView.findViewById(R.id.profile_name);
            fitnessTip = itemView.findViewById(R.id.fitness_tip);
            rank = itemView.findViewById(R.id.rank);
            progressBar = itemView.findViewById(R.id.progressBar);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_for_community, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Profiles profiles = profilesList.get(position);

        holder.profileImage.setImageResource(profiles.getImageResource());
        holder.profileName.setText(profiles.getName());
        holder.fitnessTip.setText(profiles.getFitnessTip());
        holder.rank.setText("Rank: " + (position + 1));

        // Set progress bar value
        holder.progressBar.setProgress((position + 1) * 10);

    }

    @Override
    public int getItemCount() {
        return profilesList.size();
    }
}
