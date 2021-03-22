package com.geektech.a1homework5;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MainViewHolder> {
    public List<String> stringList = new ArrayList<>();
    public Context context;


    public Adapter(List<String> stringList, Context context) {
        this.stringList = stringList;
        this.context = context;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_item, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(stringList.get(position));

    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    public void addString(String str) {
        Log.e("errorr","herereere");
        stringList.add(str);
        notifyDataSetChanged();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        TextView textViewStr;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewStr= itemView.findViewById(R.id.recycler_text_item);
        }

        public void onBind(String s) {
            textViewStr.setText(s);
        }
    }
}
