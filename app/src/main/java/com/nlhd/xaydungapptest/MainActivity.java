package com.nlhd.xaydungapptest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ViewAnimator;
import android.widget.ViewSwitcher;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ViewSwitcher simpleViewSwitcher;
    Button btnNext, btnPrev;
    int [] arr = {R.drawable.ic_launcher_foreground, R.drawable.baseline_article_24, R.drawable.baseline_account_balance_24};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext = (Button) findViewById(R.id.buttonNext);
        btnPrev = (Button) findViewById(R.id.buttonPrevious);

        // get the reference of ViewSwitcher
        simpleViewSwitcher = (ViewSwitcher) findViewById(R.id.simpleViewSwitcher);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleViewSwitcher.showNext();
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleViewSwitcher.showPrevious();
            }
        });


    }
}