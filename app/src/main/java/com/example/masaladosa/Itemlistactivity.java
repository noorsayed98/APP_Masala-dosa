package com.example.masaladosa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Itemlistactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemlistactivity);

        List<Item> items = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            items.add(new Item(
                    i,
                    "Dosa " + i,
                    "",
                    "Dosa " + i + " Description comes here",
                    "Rs. 50",
                    i % 5,
                    new Seller(
                            0,
                            "Your Friendly Neighborhood Seller",
                            "",
                            "Lorem Ipsum dolor sit amet",
                            "699",
                            5f,
                            "sayednoor003@gmail.com"
                    )
            ));
        }

        RecyclerView itemsList = findViewById(R.id.itemlistactivity);
        GridLayoutManager lm = new GridLayoutManager(
                this,
                2,
                LinearLayoutManager.VERTICAL,
                false
        );
        itemsList.setLayoutManager(lm);
        itemsList.setAdapter(new ItemAdapter(items, this));





    }
}