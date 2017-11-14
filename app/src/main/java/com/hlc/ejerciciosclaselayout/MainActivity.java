package com.hlc.ejerciciosclaselayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirRelativeLayout(View v){
        Intent i = new Intent(this, RelativeLayout.class);
        startActivity(i);
    }

    public void abrirtableLayout(View v){
        Intent i = new Intent(this, TableLayout.class);
        startActivity(i);
    }

    public void abrirLinearLayout(View v){
        Intent i = new Intent(this, LinearLayout.class);
        startActivity(i);
    }
}
