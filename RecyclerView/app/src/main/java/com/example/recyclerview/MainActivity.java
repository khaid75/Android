package com.example.recyclerview;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ItemAdapter itemAdapter;
    private List<Item> itemList;  // ClipData.Item পরিবর্তন করে List<Item> করা হয়েছে

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ✅ Create the item list
        itemList = new ArrayList<>();
        itemList.add(new Item("Item 1", "This is item 1", R.drawable.images, "$10"));
        itemList.add(new Item("Item 2", "This is item 2", R.drawable.images, "$20"));
        itemList.add(new Item("Item 3", "This is item 3", R.drawable.images, "$30"));
        itemList.add(new Item("Item 4", "This is item 4", R.drawable.images, "$40"));
        itemList.add(new Item("Item 5", "This is item 5", R.drawable.images, "$50"));

        itemAdapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);

    }
}
