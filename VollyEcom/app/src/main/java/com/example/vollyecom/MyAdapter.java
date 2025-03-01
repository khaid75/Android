package com.example.vollyecom;

import android.icu.text.CaseMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViweHolder> {

    private List<MyObject> myObjects ;
    public MyAdapter(List<MyObject> objects) {
        this.myObjects = objects;
    }
    @NonNull
    @Override
    public MyAdapter.MyViweHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false );
        return new MyViweHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViweHolder holder, int position) {
    MyObject myObject = myObjects.get(position);

    holder.title.setText(myObject.getTitle());
    holder.price.setText(myObject.getPrice());
    holder.description.setText(myObject.getDescription());
    Picasso.get().load(myObject.getImageUrl()).into(holder.imageUrl); // Uncomment if you have an image URL
    }

    @Override
    public int getItemCount() {
        return myObjects.size();
    }

    public class MyViweHolder extends RecyclerView.ViewHolder{
        TextView title,price, description;
        ImageView imageUrl;

        public MyViweHolder(@NonNull View itemView) {
            super(itemView);
        title = itemView.findViewById(R.id.item_title);
        price = itemView.findViewById(R.id.item_price);
        description = itemView.findViewById(R.id.item_description);
        imageUrl    = itemView.findViewById(R.id.item_image);

        }
    }
}
