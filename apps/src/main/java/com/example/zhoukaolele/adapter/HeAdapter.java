package com.example.zhoukaolele.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.zhoukaolele.R;
import com.example.zhoukaolele.bean.News;

import java.util.List;

/**
 * Time:2019/4/18
 * Author:秦超蒙
 * Description:
 */
public class HeAdapter extends RecyclerView.Adapter<HeAdapter.Holder> {
    List<News> list;
    Context context;

    public HeAdapter(List<News> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.rcb, null);
        return new Holder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
holder.textView1.setText(list.get(i).getCommodityName());
holder.textView2.setText(list.get(i).getPrice());
        Glide.with(context).load(list.get(i).getMasterPic()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
ImageView imageView;
TextView textView1,textView2;
        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imagec2);
            textView1=itemView.findViewById(R.id.textc2);
            textView2=itemView.findViewById(R.id.textc22);
        }
    }
}
