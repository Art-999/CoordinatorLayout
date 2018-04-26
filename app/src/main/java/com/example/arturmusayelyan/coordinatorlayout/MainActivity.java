package com.example.arturmusayelyan.coordinatorlayout;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //  1. Snackbar and FAB
    private CoordinatorLayout coordinatorLayout;
    private Button showSnackbarBtn, nextActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinatorLayout = findViewById(R.id.coordinator_layout);
        showSnackbarBtn = findViewById(R.id.show_snack_bar);
        nextActivityBtn = findViewById(R.id.next_activity_button);
        nextActivityBtn.setOnClickListener(this);
        showSnackbarBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.show_snack_bar:
                Snackbar.make(coordinatorLayout, "This is a simple Snackbar", Snackbar.LENGTH_LONG).setAction("CLOSE", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("Art", "Cancel action");
                    }
                }).show();
                break;
            case R.id.next_activity_button:
                startActivity(new Intent(this, SecondActivity.class));
                break;
        }
    }
}
