package com.example.tobi.myapplication.ressource;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tobi.myapplication.R;
import com.example.tobi.myapplication.ressource.data_file;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class list_adapter extends BaseAdapter {

    private  Context mContext;
    private LayoutInflater layoutInflater;

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
       ViewHolder holder;
       if(convertView==null) {
           convertView = layoutInflater.inflate(R.layout.grid_item, null);
           holder = new ViewHolder();
           holder.flagView = (ImageView) convertView.findViewById(R.id.im_view);
           holder.nameView = (TextView) convertView.findViewById(R.id.im_text);
           convertView.setTag(holder);
       }
       else
       {
           holder=(ViewHolder)convertView.getTag();
       }

        holder.nameView.setText(data_file.get_name_from_list_Item(position).toString());
        int imageId = this.getMipmapResIdByName();
        holder.flagView.setImageResource(imageId);
        return convertView;
    }

    public int getMipmapResIdByName(){
        String pkgName = mContext.getPackageName();

        int resetID = mContext.getResources().getIdentifier("file","mipmap",pkgName);
                return resetID;
    }


    static class ViewHolder{

        ImageView flagView;
        TextView nameView;
    }
}
