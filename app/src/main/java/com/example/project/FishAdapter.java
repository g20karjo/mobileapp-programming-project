package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FishAdapter extends RecyclerView.Adapter<FishAdapter.FishAdapterViewHolder>{
    private List<Fish> Fish;

    public FishAdapter(List<Fish> Fish) {
        this.Fish = Fish;
    }

    @NonNull
    @Override
    public FishAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent, false);
        return new FishAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FishAdapterViewHolder holder, int position) {
        holder.fishName.setText(Fish.get(position).getName());
        holder.fishSize.setText(String.valueOf(Fish.get(position).getSize())+"m");
        holder.fishID.setText(Fish.get(position).getID());
    }

    @Override
    public int getItemCount() {
        return Fish.size();
    }

    public class FishAdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView fishName;
        private TextView fishSize;
        private TextView fishID;

        public FishAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            fishName = itemView.findViewById(R.id.fishName);
            fishSize = itemView.findViewById(R.id.fishSize);
            fishID = itemView.findViewById(R.id.fishID);
        }
    }
}
