package com.oscar.career.adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> data = new ArrayList<>();
        data.add("java");
        data.add("python");
        data.add("c++");
        data.add("c");
        data.add("android");
        data.add("Ruby");
        data.add("laravel");
        data.add("java");
        data.add("python");
        data.add("c++");
        data.add("c");
        data.add("android");
        data.add("Ruby");
        data.add("laravel");
        data.add("java");
        data.add("python");
        data.add("c++");
        data.add("c");
        data.add("android");
        data.add("Ruby");
        data.add("laravel");
        data.add("java");
        data.add("python");
        data.add("c++");
        data.add("c");
        data.add("android");
        data.add("Ruby");
        data.add("laravel");
        data.add("java");
        data.add("python");
        data.add("c++");
        data.add("c");
        data.add("android");
        data.add("Ruby");
        data.add("laravel");
        data.add("java");
        data.add("python");
        data.add("c++");
        data.add("c");
        data.add("android");
        data.add("Ruby");
        data.add("laravel");

        MyrecAdapter ad = new MyrecAdapter(data);

        rv = findViewById(R.id.rv);
        rv.setAdapter(ad);

        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}