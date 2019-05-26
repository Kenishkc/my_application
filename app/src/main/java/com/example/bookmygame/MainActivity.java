package com.example.bookmygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton fut, crk;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("BookMyGame");


        fut=(ImageButton)findViewById(R.id.futbutton);
        crk=(ImageButton)findViewById(R.id.futbutton);

        fut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenFutsaul();
            }
        });
    }

    private void OpenFutsaul() {
        Intent intent=new Intent(this,List_view_of_futsaul.class);
        startActivity(intent);

    }

}