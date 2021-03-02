package com.example.rvcardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapterclass extends RecyclerView.Adapter<myviewholderclass>
{
    ArrayList<mymodelclass> data;
    public myadapterclass(ArrayList<mymodelclass> data)
    {
        this.data = data;
    }

    @NonNull
    @Override
    public myviewholderclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.singlerow,parent,false);//blank box bn gaya
        return new myviewholderclass(view); // ab y box fill ho gya viewholder class k references dalny sy obj k zrye

    }

    @Override
    public void onBindViewHolder(@NonNull myviewholderclass holder, int position)
    {
         holder.t1.setText(data.get(position).getHeader(""));
         holder.t2.setText(data.get(position).getDesc(""));
         holder.imageView.setImageResource(data.get(position).getImgname(R.drawable.and_icon));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
