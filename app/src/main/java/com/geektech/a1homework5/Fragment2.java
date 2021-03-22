package com.geektech.a1homework5;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragment2 extends Fragment {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private List<String> list;
    private Context context;

    public void setText(Context context,String str){
        this.context = context;
        adapter.addString(str);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        list = new ArrayList<>();
        recyclerView = view.findViewById(R.id.recycler_text);
        adapter = new Adapter(list,context);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,RecyclerView.VERTICAL,false));
        return view;
    }




}