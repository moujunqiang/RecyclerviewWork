package com.example.myapplication;


import android.content.Context;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    List<Item1Bean> item1Beans;
    Context context;

    public void setItem1Beans(List<Item1Bean> item1Beans) {
        this.item1Beans = item1Beans;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, null, false);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Item1Bean item1Bean = item1Beans.get(position);
        holder.ivSchool.setImageResource(item1Bean.getImageResId());
        holder.tvName.setText(item1Bean.getSchool());
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, item1Bean.getSchool(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return item1Beans == null ? 0 : item1Beans.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder  {
        private ImageView ivSchool;
        private TextView tvName;
        private Button btn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ivSchool = itemView.findViewById(R.id.image);
            tvName = itemView.findViewById(R.id.tv_name);
            btn = itemView.findViewById(R.id.btn);

        }

    }
}
