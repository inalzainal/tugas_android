package com.example.dell.tugas_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onButtonClickSignup(View v){
        Intent myIntent = new Intent(getBaseContext(),   SignUpActivity.class);
        startActivity(myIntent);
    }
}
