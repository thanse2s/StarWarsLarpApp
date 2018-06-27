package com.example.tohan.starwars;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tohan.starwars.AnimationRessorces.GifImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        GifImageView gifImageView = (GifImageView)findViewById(R.id.replogo);
       gifImageView.setGifImageRessource(R.drawable.logo);


    }
}
