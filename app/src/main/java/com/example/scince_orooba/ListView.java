package com.example.scince_orooba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListView extends AppCompatActivity {
    android.widget.ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.List);

        List<String> ls = new ArrayList<>();
        ls.add("Herbs");
        ls.add("Seeds");
        ls.add("back");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ls);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(ListView.this, HerbsAct.class));
                } else if (position == 1) {
                    startActivity(new Intent(ListView.this, SeedsAct.class));
                }
                else {
                    startActivity(new Intent(ListView.this, signIn.class));
                }
            }
        });
    }
}

