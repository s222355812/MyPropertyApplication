package com.example.mypropertyapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Property> properties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize recycler view
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Populate property list
        properties = new ArrayList<>();
        properties.add(new Property("Property 1", "https://images.unsplash.com/photo-1600585154340-be6161a56a0c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8cHJvcGVydHl8ZW58MHx8MHx8&auto=format&fit=crop&w=600&q=60", "Address: 123 Main St, City: XYZ","Richly-appointed spaces include large gathering areas, a bright,two walk-out master suites, and a home theater."));
        properties.add(new Property("Property 2", "https://images.unsplash.com/photo-1600047509807-ba8f99d2cdde?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fHByb3BlcnR5fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=600&q=60", "Address: 456 Main St, City: ABC", "Beyond a functional entryway space the home flows into a luminous, open- concept living, dining, and kitchen area. The galley-style kitchen is equipped with white quartz countertops, a white tile backsplash, Nolte cabinets, and a suite of high-end stainless steel appliances from Samsung and Fisher & Paykel. The bedroom sits just off the living area and has a large reach-in closet. The bathroom has ceramic tile flooring, textured walls, and chic Kohler and Delta fixtures. The Hill is a brand new boutique condominium located in Ocean Hill. The building has an elevator, a bicycle room, private storage, and parking spaces."));
        properties.add(new Property("Property 3", "https://images.unsplash.com/photo-1512917774080-9991f1c4c750?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fHByb3BlcnR5fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=600&q=60", "Address: 789 Main St, City: LMN", "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."));

        // Set up adapter
        PropertyAdapter adapter = new PropertyAdapter(this, properties);
        recyclerView.setAdapter(adapter);
    }
}
