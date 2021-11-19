package com.example.android_team5_louer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goToBookingScreen(View v) {
        Intent loginIntent = new Intent(getApplicationContext(), BookingListActivity.class);
        startActivity(loginIntent);
    }
}