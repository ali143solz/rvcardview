package com.example.rvcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    myadapterclass adapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler view and Cardview");
        recyclerView=(RecyclerView)findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new myadapterclass(dataqueue());
        recyclerView.setAdapter(adapter);
    }

    public ArrayList<mymodelclass> dataqueue()
    {
        ArrayList<mymodelclass> holder=new ArrayList<>();

     mymodelclass obj=new mymodelclass();
     obj.setHeader("C++ Programming");
     obj.setDesc("Desktop Programming");
     obj.setImgname(R.drawable.and_icon);
        holder.add(obj);

        mymodelclass obj1=new mymodelclass();
        obj1.setHeader("C++ Programming");
        obj1.setDesc("Desktop Programming");
        obj1.setImgname(R.drawable.and_icon);
        holder.add(obj1);


        mymodelclass obj2=new mymodelclass();
        obj2.setHeader("C++ Programming");
        obj2.setDesc("Desktop Programming");
        obj2.setImgname(R.drawable.and_icon);
        holder.add(obj2);

        mymodelclass obj3=new mymodelclass();
        obj3.setHeader("C++ Programming");
        obj3.setDesc("Desktop Programming");
        obj3.setImgname(R.drawable.and_icon);
        holder.add(obj3);

        mymodelclass obj4=new mymodelclass();
        obj4.setHeader("C++ Programming");
        obj4.setDesc("Desktop Programming");
        obj4.setImgname(R.drawable.and_icon);
        holder.add(obj4);

        mymodelclass obj5=new mymodelclass();
        obj5.setHeader("C++ Programming");
        obj5.setDesc("Desktop Programming");
        obj5.setImgname(R.drawable.and_icon);
        holder.add(obj5);

        mymodelclass obj6=new mymodelclass();
        obj6.setHeader("C++ Programming");
        obj6.setDesc("Desktop Programming");
        obj6.setImgname(R.drawable.and_icon);
        holder.add(obj6);

        mymodelclass obj7=new mymodelclass();
        obj7.setHeader("C++ Programming");
        obj7.setDesc("Desktop Programming");
        obj7.setImgname(R.drawable.and_icon);
        holder.add(obj7);

        mymodelclass obj8=new mymodelclass();
        obj8.setHeader("C++ Programming");
        obj8.setDesc("Desktop Programming");
        obj8.setImgname(R.drawable.and_icon);
        holder.add(obj8);

        mymodelclass obj9=new mymodelclass();
        obj9.setHeader("C++ Programming");
        obj9.setDesc("Desktop Programming");
        obj9.setImgname(R.drawable.and_icon);
        holder.add(obj9);

        mymodelclass obj10=new mymodelclass();
        obj10.setHeader("C++ Programming");
        obj10.setDesc("Desktop Programming");
        obj10.setImgname(R.drawable.and_icon);
        holder.add(obj10);

        mymodelclass obj11=new mymodelclass();
        obj11.setHeader("C++ Programming");
        obj11.setDesc("Desktop Programming");
        obj11.setImgname(R.drawable.and_icon);
        holder.add(obj11);

        mymodelclass obj12=new mymodelclass();
        obj12.setHeader("C++ Programming");
        obj12.setDesc("Desktop Programming");
        obj12.setImgname(R.drawable.and_icon);
        holder.add(obj12);

        mymodelclass obj13=new mymodelclass();
        obj13.setHeader("C++ Programming");
        obj13.setDesc("Desktop Programming");
        obj13.setImgname(R.drawable.and_icon);
        holder.add(obj13);
        return holder;
    }
}