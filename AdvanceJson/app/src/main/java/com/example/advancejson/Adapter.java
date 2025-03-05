package com.example.advancejson;

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
    private List<Model> modelList;
    public Adapter(Context context, List<Model> modelList) {
        this.context = context;
        this.modelList = modelList;
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

        Model model = modelList.get(position);
        Glide.with(context).load(modelList.get(position).getImage()).into(holder.imageView);
        holder.Title.setText(modelList.get(position).getTitle());
        holder.Description.setText(modelList.get(position).getDescription());
        holder.Price.setText(modelList.get(position).getPrice());
        holder.Rating.setText(modelList.get(position).getRating().getRate());
        holder.Quantity.setText(modelList.get(position).getRating().getCount());


    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder  {
        TextView Title,Description,Rating,Quantity,Price;
        ImageView imageView;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            Title = itemView.findViewById(R.id.product_title);
            Description = itemView.findViewById(R.id.product_description);
            Rating = itemView.findViewById(R.id.product_rating);
            Quantity = itemView.findViewById(R.id.product_quantity);
            Price = itemView.findViewById(R.id.product_price);
            imageView = itemView.findViewById(R.id.product_image); // Replace with your image view id


        }
    }
}
