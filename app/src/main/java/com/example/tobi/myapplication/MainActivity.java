package com.example.tobi.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tobi.myapplication.ressource.data_file;

public class MainActivity extends AppCompatActivity {


    String akt_freg="home";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        data_file.init();

        Button btn_qr = (Button)findViewById(R.id.qr_code);
        Button btn_files = (Button) findViewById(R.id.files);

        btn_qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(akt_freg!="qrCode") {
                    Fragment frag = new qrCode();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragment_view, frag).commit();
                    akt_freg="qrCode";
                }
            }
        });


        btn_files.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (akt_freg != "files") {
                    Fragment frag = new file_view();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragment_view, frag).commit();
                    akt_freg="files";
                }
            }
        });




    }
}
