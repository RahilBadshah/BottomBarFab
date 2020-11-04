package com.android.bottombarfab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.animation.OvershootInterpolator;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    BottomAppBar ba;
    OvershootInterpolator overshootInterpolator;
    int speed = 550;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = findViewById(R.id.bottom_bar_fab);
        ba = findViewById(R.id.bottomAppBar);
        overshootInterpolator = new OvershootInterpolator();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ba.getFabAlignmentMode() == BottomAppBar.FAB_ALIGNMENT_MODE_CENTER) {
                    ba.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_END);
                    fab.animate().setInterpolator(overshootInterpolator).rotation(45f).setDuration(speed).start();
                } else {
                    ba.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_CENTER);
                    fab.animate().setInterpolator(overshootInterpolator).rotation(0f).setDuration(speed).start();
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_bar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}