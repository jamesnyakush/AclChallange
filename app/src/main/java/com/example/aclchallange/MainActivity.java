package com.example.aclchallange;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView myTextView = (TextView) findViewById(R.id.heading);
//        Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/Lemonada-Regular.ttf");
//        myTextView.setTypeface(typeface);

        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("ACL 4 Phase 1");
        getSupportActionBar().setDisplayUseLogoEnabled(true);

//        Button a = findViewById(R.id.aboutalc);
//        Typeface typefacea=Typeface.createFromAsset(getAssets(), "fonts/Lemonada-Regular.ttf");
//        a.setTypeface(typefacea);
//
//        Button c = findViewById(R.id.myprofile);
//        Typeface typefacec=Typeface.createFromAsset(getAssets(), "fonts/Lemonada-Regular.ttf");
//        c.setTypeface(typefacec);

        findViewById(R.id.aboutalc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, About.class));
            }
        });

        findViewById(R.id.myprofile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MyProfile.class));
            }
        });
    }
}
