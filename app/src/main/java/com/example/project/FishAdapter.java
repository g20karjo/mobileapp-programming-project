package com.example.project;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class FishAdapter extends RecyclerView.Adapter<FishAdapter.FishAdapterViewHolder>{
    private List<Fish> fish;

    public FishAdapter(List<Fish> fish) {
        this.fish = fish;
    }

    public void setFish(List<Fish> fish) {
        this.fish = fish;
    }

    @NonNull
    @Override
    public FishAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent, false);
        return new FishAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FishAdapterViewHolder holder, int position) {
        holder.fishName.setText(fish.get(position).getName());
        holder.fishSize.setText(String.valueOf(fish.get(position).getSize())+"cm");
        holder.fishID.setText(fish.get(position).getID());
        Picasso.get().load(fish.get(position).getImg().toString()).into(holder.fishImg);

    }

    @Override
    public int getItemCount() {
        return fish.size();
    }

    public class FishAdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView fishName;
        private TextView fishSize;
        private TextView fishID;
        private ImageView fishImg;

        public FishAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            fishName = itemView.findViewById(R.id.fishName);
            fishSize = itemView.findViewById(R.id.fishSize);
            fishID = itemView.findViewById(R.id.fishID);
            fishImg = itemView.findViewById(R.id.fishImg);
        }
    }
}
