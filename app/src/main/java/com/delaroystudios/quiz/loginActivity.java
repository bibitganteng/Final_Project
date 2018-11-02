package com.delaroystudios.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void lgn1(View view) {
        Intent intent = new Intent(loginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
