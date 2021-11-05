package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rccv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rccv = findViewById(R.id.Rv);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rccv.setLayoutManager(manager);

        ArrayList<file> fileArrayList = new ArrayList<>();
        fileArrayList.add(new file("Overlord",false));
        fileArrayList.add(new file("Conan", true));
        fileArrayList.add(new file("Gintama",true));
        fileArrayList.add(new file("Gosick",false));

        adapterFile adapter = new adapterFile(fileArrayList,this);
        rccv.setAdapter(adapter);
    }
}