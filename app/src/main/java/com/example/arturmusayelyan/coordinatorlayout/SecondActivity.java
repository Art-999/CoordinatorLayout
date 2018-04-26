package com.example.arturmusayelyan.coordinatorlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class SecondActivity extends AppCompatActivity {
    //2. FAB follows Widget
    private RelativeLayout relativeLayout;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        relativeLayout = findViewById(R.id.main_relative_layout);
        fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(relativeLayout, "This is a simple Snackbar", Snackbar.LENGTH_LONG).setAction("OPEN", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
                    }
                }).show();
            }
        });


    }
}
