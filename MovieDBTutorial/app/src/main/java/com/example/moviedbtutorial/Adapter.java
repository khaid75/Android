package com.example.moviedbtutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.CustomViewHolder> {
    private Context context;

    private List<MovieModel> moviesModelList;

    public Adapter(Context context, List<MovieModel> moviesModelList) {
        this.context = context;
        this.moviesModelList = moviesModelList;
    }

    @NonNull
    @Override
    public Adapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.design, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.CustomViewHolder holder, int position) {
        Glide.with(context).load(moviesModelList.get(position).getPoster()).into(holder.imageView);
        holder.Title.setText(moviesModelList.get(position).getTitle());
        holder.Runtime.setText(moviesModelList.get(position).getRuntime());
    }

    @Override
    public int getItemCount() {
        return moviesModelList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView Title, Runtime, Rating;
        ImageView imageView;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            Title = itemView.findViewById(R.id.title);
            Runtime = itemView.findViewById(R.id.runtime);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
