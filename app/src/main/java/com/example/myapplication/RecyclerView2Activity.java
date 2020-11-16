package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView2Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter2 adapter;
    private List<Item2Bean> item2Beans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view2);
        recyclerView = findViewById(R.id.rv2);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new MyAdapter2();
        item2Beans = initData();
        adapter.setItem2Beans(item2Beans);
        recyclerView.setAdapter(adapter);
        registerForContextMenu(recyclerView);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Item2Bean item1Bean = new Item2Bean("北京大学", R.drawable.beijing, "10人来过");
                item2Beans.add(item1Bean);
                adapter.notifyDataSetChanged();
                break;
            case 2:
                item2Beans.remove(adapter.getContextMenuPosition());
                adapter.notifyDataSetChanged();
                break;
            default:
                break;
        }
        return super.onContextItemSelected(item);
    }


    public List<Item2Bean> initData() {
        List<Item2Bean> list = new ArrayList<>();
        Item2Bean item1Bean = new Item2Bean("北京大学", R.drawable.beijing, "10人来过");
        Item2Bean item1Bean1 = new Item2Bean("清华大学", R.drawable.qinghua, "20人来过");
        Item2Bean item1Bean2 = new Item2Bean("杭州师范大学", R.drawable.hagnzhou, "30人来过");
        list.add(item1Bean);
        list.add(item1Bean1);
        list.add(item1Bean2);
        return list;
    }
}