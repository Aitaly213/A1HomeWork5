package com.geektech.a1homework5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements IFragment{
    private FragmentManager manager;
    private FragmentTransaction transaction;
    Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();
        fragment3();
    }


    public void fragment3(){
        Fragment3 fragment3 = new Fragment3();
        transaction = manager.beginTransaction();
        transaction.add(R.id.frame_lyot,fragment3);
        transaction.commit();
    }

    @Override
    public void Hide() {
        fragment2 = (Fragment2) manager.findFragmentById(R.id.fragment_recycler);
        transaction = manager.beginTransaction();
        transaction.hide(fragment2);
        transaction.commit();
    }

    @Override
    public void Show() {
        fragment2 = (Fragment2) manager.findFragmentById(R.id.fragment_recycler);
        transaction = manager.beginTransaction();
        transaction.show(fragment2);
        transaction.commit();
    }

    @Override
    public void addText(String str) {
        fragment2 = (Fragment2) manager.findFragmentById(R.id.fragment_recycler);
        fragment2.setText(this,str);
    }
}