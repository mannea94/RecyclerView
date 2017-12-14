package com.example.manne.recyclerview;


import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by manne on 07.12.2017.
 */

public class CustomImagesAdapter extends RecyclerView.Adapter<CustomImagesAdapter.ViewHolder> {
    Context context;
    List<ImageData> imageDataArrayList = new ArrayList<>();

    public void setItems(List<ImageData> students){
        imageDataArrayList = students;
    }

    public CustomImagesAdapter(Context context_) {
        context = context_;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        //Inflate the custom layout
        View view = inflater.inflate(R.layout.recyclerview_image_row, parent, false);
        //Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        // Get the data model based on position
        ImageData imageData = imageDataArrayList.get(position);
        viewHolder.textView.setText(imageData.getTags());



        Picasso.with(context)
                .load(imageData.getPreviewURL())
                .fit()
                .centerInside()
                .into(viewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return imageDataArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.text1)
        TextView textView;
//        @BindView(R.id.text2)
//        TextView textView2;
        @BindView(R.id.image)
        ImageView imageView;

        public ViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
