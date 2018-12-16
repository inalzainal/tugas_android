package com.example.dell.tugas_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void onButtonClickLogin(View v){
        Intent myIntent = new Intent(getBaseContext(),   LoginActivity.class);
        startActivity(myIntent);
    }
}
