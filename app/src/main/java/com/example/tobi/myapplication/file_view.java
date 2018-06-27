package com.example.tobi.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.tobi.myapplication.ressource.data_file;
import com.example.tobi.myapplication.ressource.list_adapter;

public class file_view extends Fragment {

    public file_view(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =   inflater.inflate(R.layout.files_grid_view, container, false);
        super.onCreate(savedInstanceState);

        GridView gridView = (GridView) view.findViewById(R.id.file_grid);
        list_adapter adp = new list_adapter(getActivity());
        gridView.setAdapter(adp);



        return  view;

    }







}
