package com.example.tobi.myapplication.ressource;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tobi.myapplication.ressource.data_file;

import org.w3c.dom.Text;

public class list_adapter extends BaseAdapter {

    private  Context mContext;

    public list_adapter(Context context){
        this.mContext=context;

    }

    @Override
    public int getCount(){
       return data_file.get_count();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView txt = new TextView(mContext);
        txt.setText(String.valueOf(position));
        txt.setTextColor(Color.WHITE);
        return  txt;

    }
}
