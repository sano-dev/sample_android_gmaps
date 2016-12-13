package com.sanodev.android.sample.gmaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sanodev.android.sample.gmaps.option1.MapsActivity;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void option1Click(View view) {
        startActivity(new Intent(this, MapsActivity.class));
    }
}
