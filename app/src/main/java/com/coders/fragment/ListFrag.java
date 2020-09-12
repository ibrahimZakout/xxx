package com.coders.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFrag extends ListFragment {

    ItemSelected activity;

    public ListFrag() {
        // Required empty public constructor
    }
    public interface ItemSelected{
        void onItemSelected(int index);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        activity=(ItemSelected)context;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<String> data =new ArrayList<String>();
        data.add(" the first : ");
        data.add(" the second : ");
        data.add(" the third : ");

        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data));
        activity.onItemSelected(0); //for disappear of textview word
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
    activity.onItemSelected(position);
    }
}
