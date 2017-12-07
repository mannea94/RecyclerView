package com.example.manne.recyclerview;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by manne on 07.12.2017.
 */

public class CustomStudentsAdapter {

    public class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.text)
        TextView textView;

        public ViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
