package com.example.tobi.myapplication.ressource;

import java.util.ArrayList;
import java.util.List;

public class data_file {


    private String name;
    private char type;
    private String pw;
    private boolean locked;


    private static  List<data_file> data_list = new ArrayList<data_file>();

    private data_file(String name,char type,String pw,boolean locked){

        this.name=name;
        this.type=type;
        this.pw=pw;
        setLocked(locked);

    }


    public String getName(){
        return this.name;
    }

    public char getType(){
        return this.type;
    }

    public String getPW(){
        return pw;
    }

    public boolean isLocked(){
        return locked;
    }

    public void setLocked(boolean locked){
        this.locked=locked;
    }

    public void add_Item_to_List(String name,char type,String pw,boolean locked){
        data_list.add(new data_file(name,type,pw,locked));
    }

    public String get_name_from_list_Item(int pos){

        return data_list.get(pos).name.toString();
    }

    public char get_type_from_list_Item(int pos){

        return data_list.get(pos).type;
    }

    public String get_pw_from_list_Item(int pos){

        return data_list.get(pos).pw.toString();
    }

    public boolean get_locked_from_list_Item(int pos){

        return  data_list.get(pos).locked;
    }

    public void change_locked_in_list(int pos,boolean locked){

        
    }

    static public int get_count(){

        return data_list.size();
    }


}
