package com.geektech.a1homework5;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment3 extends Fragment {
    IFragment iFragment;

    private EditText editText;
    private Button button;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        iFragment = (IFragment)context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_3, container, false);
        editText = view.findViewById(R.id.edTxt);
        button = view.findViewById(R.id.btn3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();
                Log.e("error","here is nothing!");
                iFragment.addText(str);
                editText.setText("");
            }
        });

        return view;
    }
}