package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView1Activity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view1);
        recyclerView = findViewById(R.id.rv1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter();
        adapter.setItem1Beans(initData());
        recyclerView.setAdapter(adapter);
    }

    public List<Item1Bean> initData() {
        List<Item1Bean> list = new ArrayList<>();
        Item1Bean item1Bean = new Item1Bean("北京大学", R.drawable.beijing);
        Item1Bean item1Bean1 = new Item1Bean("清华大学", R.drawable.qinghua);
        Item1Bean item1Bean2 = new Item1Bean("杭州师范大学", R.drawable.hagnzhou);
        list.add(item1Bean);
        list.add(item1Bean1);
        list.add(item1Bean2);
        return list;
    }
}