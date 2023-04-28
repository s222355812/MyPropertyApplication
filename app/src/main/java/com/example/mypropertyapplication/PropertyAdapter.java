package com.example.mypropertyapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.ViewHolder> {
    private ArrayList<Property> properties;

    public PropertyAdapter(MainActivity mainActivity, ArrayList<Property> properties) {
        this.properties = properties;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.property_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Property property = properties.get(position);

        // Load image using Picasso
        Picasso.get().load(property.getImageUrl()).into(holder.propertyImage);

        // Set property details
        holder.propertyName.setText(property.getName());
        holder.propertyAddress.setText(property.getAddress());
        holder.propertyDescription.setText(property.getDescription());
    }



    @Override
    public int getItemCount() {
        return properties.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView propertyImage;
        TextView propertyName;
        TextView propertyAddress;
        TextView propertyDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            propertyImage = itemView.findViewById(R.id.property_image);
            propertyName = itemView.findViewById(R.id.property_name);
            propertyAddress = itemView.findViewById(R.id.property_address);
            propertyDescription = itemView.findViewById(R.id.property_description);
        }
    }

}

