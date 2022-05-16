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
        holder.fish_name.setText(Fish.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return Fish.size();
    }

    public class FishAdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView fish_name;

        public FishAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            fish_name = itemView.findViewById(R.id.fishName);
        }

    }
}
