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

public class CustomStudentsAdapter extends RecyclerView.Adapter<CustomStudentsAdapter.ViewHolder> {
    Context context;
    List<Student> studentList = new ArrayList<>();

    public void setItems(List<Student> students){
        studentList = students;
    }

    public CustomStudentsAdapter(Context context_) {
        context = context_;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        //Inflate the custom layout
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        //Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        // Get the data model based on position
        Student student = studentList.get(position);
        viewHolder.textView.setText(student.sName);

        if(student.issOnline()) {
            viewHolder.textView2.setText("online");
            viewHolder.textView2.setBackgroundColor(Color.GREEN);
        }
        else{
            viewHolder.textView2.setText("offline");
            viewHolder.textView2.setBackgroundColor(Color.RED);
        }

        Picasso.with(context)
                .load("https://vignette4.wikia.nocookie.net/readyplayerone/images/0/09/Rubik%27s_Cube.png/revision/latest?cb=20120905191549")
                .fit()
                .centerInside()
                .into(viewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.text)
        TextView textView;
        @BindView(R.id.text2)
        TextView textView2;
        @BindView(R.id.imageView)
        ImageView imageView;

        public ViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
