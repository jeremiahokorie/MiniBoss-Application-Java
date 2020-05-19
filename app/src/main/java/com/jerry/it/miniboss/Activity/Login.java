package com.jerry.it.miniboss.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jerry.it.miniboss.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Login(View view) {
        Intent intent = new Intent(getApplicationContext(),minibossMap.class);
        startActivity(intent);
    }

    public void tvSignUp(View view) {
        Intent intent = new Intent(getApplicationContext(),Onboard.class);
        startActivity(intent);
    }
}
