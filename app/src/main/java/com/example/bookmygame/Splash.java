package com.example.bookmygame;

import android.support.design.animation.AnimationUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Splash extends AppCompatActivity {
private ImageView logo;
private LinearLayout button;
Animation frombuttom;


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

button=(LinearLayout)findViewById(R.id.buttons);
logo=(ImageView)findViewById(R.id.logo);

frombuttom=AnimationUtils.loadAnimation(this,R.anim.frombuttom);
button.setAnimation(frombuttom);




    }
}
