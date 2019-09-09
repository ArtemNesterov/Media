package com.example.media;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MainActivityMVP mainActivityMVP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityMVP = new MainActivityMVP(this);

        recyclerView = findViewById(R.id.am_list);

        mainActivityMVP.setAdapterForVideos(recyclerView);

    }
}
