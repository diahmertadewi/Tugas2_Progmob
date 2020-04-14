package com.example.recyclerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ListAdapter adapter;
    private ArrayList<DataMahasiswa.Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new ListAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new DataMahasiswa.Mahasiswa("Diah Mertadewi", "1805551037", "123456789"));
        mahasiswaArrayList.add(new DataMahasiswa.Mahasiswa("Eka Savitry", "1805551034", "987654321"));
        mahasiswaArrayList.add(new DataMahasiswa.Mahasiswa("Kristuany Br Munthe", "1805551002", "987648765"));
        mahasiswaArrayList.add(new DataMahasiswa.Mahasiswa("Christy Idi", "1214378098", "098758124"));
    }
}
