package com.coders.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ListFragment;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class  MainActivity extends AppCompatActivity implements ListFrag.ItemSelected {
    ArrayList<String> descrition;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);


         descrition = new ArrayList<String>();
        descrition.add("this is the description 1");
        descrition.add("this is the description 2");
        descrition.add("this is the description 3");

    }

    @Override
    public void onItemSelected(int index) {

        textView.setText(descrition.get(index));
    }
}
