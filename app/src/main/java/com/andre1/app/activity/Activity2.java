package com.andre1.app.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.andre1.R;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main_new);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Button forgotPassword = findViewById(R.id.btn_forgot_password);

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });

    }





    public void openActivity() {

        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }




}
