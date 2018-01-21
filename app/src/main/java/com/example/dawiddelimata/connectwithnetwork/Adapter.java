package com.example.dawiddelimata.connectwithnetwork;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Collections;
import java.util.List;

/**
 * Created by dawiddelimata on 21.01.2018.
 */

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    List<DataParts> data= Collections.emptyList();
    FromDB current;
    int currentPos=0;

    // create constructor to innitilize context and data sent from MainActivity
    public Adapter(Context context, List<DataParts> data){
        this.context=context;
        inflater= LayoutInflater.from(context);
        this.data=data;
    }

    // Inflate the layout when viewholder created
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.container_parts, parent,false);
        MyHolder holder=new MyHolder(view);
        return holder;
    }

    // Bind data
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        // Get current position of item in recyclerview to bind data and assign values from list
        MyHolder myHolder= (MyHolder) holder;
        DataParts current=data.get(position);
        myHolder.name.setText(current.name);
        myHolder.quantity.setText("Size: " + current.quantity);
//        myHolder.textType.setText("Category: " + current.catName);
//        myHolder.textPrice.setText("Rs. " + current.price + "\\Kg");
//        myHolder.textPrice.setTextColor(ContextCompat.getColor(context, R.color.colorAccent));

        // load image into imageview using glide
//        Glide.with(context).load("http://192.168.1.7/test/images/" + current.fishImage)
//                .placeholder(R.drawable.ic_img_error)
//                .error(R.drawable.ic_img_error)
//                .into(myHolder.ivFish);

    }

    // return total item from List
    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyHolder extends RecyclerView.ViewHolder{

        TextView name;
        ImageView ivParts;
        TextView quantity;
//        TextView textType;
//        TextView textPrice;

        // create constructor to get widget reference
        public MyHolder(View itemView) {
            super(itemView);
            name= (TextView) itemView.findViewById(R.id.name);
            ivParts= (ImageView) itemView.findViewById(R.id.ivParts);
            quantity = (TextView) itemView.findViewById(R.id.textSize);
//            textType = (TextView) itemView.findViewById(R.id.textType);
//            textPrice = (TextView) itemView.findViewById(R.id.textPrice);
        }

    }
}
