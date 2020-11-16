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

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.MyViewHolder> {
    List<Item2Bean> item2Beans;
    Context context;
    private int position;

    public int getContextMenuPosition() {
        return position;
    }

    public void setContextMenuPosition(int position) {
        this.position = position;
    }

    public void setItem2Beans(List<Item2Bean> item2Beans) {
        this.item2Beans = item2Beans;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2, null, false);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        final Item2Bean item1Bean = item2Beans.get(position);
        holder.ivSchool.setImageResource(item1Bean.getImageResId());
        holder.tvName.setText(item1Bean.getSchool());
        holder.tvCount.setText(item1Bean.getCount());
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                setContextMenuPosition(holder.getLayoutPosition());

                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return item2Beans == null ? 0 : item2Beans.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {
        private ImageView ivSchool;
        private TextView tvName;
        private TextView tvCount;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ivSchool = itemView.findViewById(R.id.image);
            tvName = itemView.findViewById(R.id.tv_name);
            tvCount = itemView.findViewById(R.id.tv_count);
            itemView.setOnCreateContextMenuListener(this);

        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            //注意传入的menuInfo为null
            Item2Bean mSelectModelUser = item2Beans.get(getContextMenuPosition());
            Log.i("UserAdapter", "onCreateContextMenu: " + getContextMenuPosition());
            menu.add(1, 1, 1, "添加");
            menu.add(1, 2, 1, "删除");

        }
    }
}
