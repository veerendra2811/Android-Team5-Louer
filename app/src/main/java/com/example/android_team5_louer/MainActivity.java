package com.example.android_team5_louer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        /* Don't Disturb Main Activity Until stable*/
        Intent homeIntent = new Intent(getApplicationContext(), HomeScreenActivity.class);
        startActivity(homeIntent);
    }
}