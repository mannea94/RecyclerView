package com.example.manne.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        CustomStudentsAdapter adapter = new CustomStudentsAdapter(this);

        adapter.setItems(generateList());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    ArrayList<Student> generateList(){
        ArrayList<Student> students = new ArrayList<>();

        for(int i=0; i<100; i++){
            if(i%3==0) {
                students.add(new Student("Marjan" + i, false));
            }
            else {
                students.add(new Student("Andonov" + i, true));
            }
        }
        return students;

    }


}
