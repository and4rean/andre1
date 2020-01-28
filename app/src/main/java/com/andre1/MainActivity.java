package com.andre1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private EditText loginEditText;
    //private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Button signInButton = findViewById(R.id.btn_sign_in);
        Button forgotPassword = findViewById(R.id.btn_forgot_password);



        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkShowInfo();
            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }








    public void openActivity2() {

       Intent intent1 = new Intent(this, Activity2.class);
       startActivity(intent1);
    }





    private void checkShowInfo() {
        EditText loginEditText = findViewById(R.id.et_login);
        EditText passwordEditText = findViewById(R.id.et_password);

        String loginText = loginEditText.getText().toString();
        String passwordText = passwordEditText.getText().toString();

        if (TextUtils.isEmpty(loginText)) {
            loginEditText.setError("cannot be empty1 !");
            //return;
        } else {
            loginEditText.setError(null);
        }
        if (TextUtils.isEmpty(passwordText)) {
            passwordEditText.setError("cannot be empty2 !");
            return;
        } else {
            passwordEditText.setError(null);
        }


        String text = "Login:" + loginText + " Passsword:" +passwordText;
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
    }






}