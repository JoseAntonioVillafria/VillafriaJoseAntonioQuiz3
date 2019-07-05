package com.example.villafriajoseantonioquiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    EditText txtName, txtPassword, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txtName = findViewById(R.id.tvName);
        txtPassword = findViewById(R.id.tvPassword);
        txtEmail = findViewById(R.id.etEmail);
    }

    public void goPrevious(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void displayUser(View v) {
        SharedPreferences sp =  getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        txtName.setText(sp.getString("user", ""));
        txtPassword.setText(sp.getString("pwd", ""));
        Toast.makeText(this, sp.getString("mail", ""), Toast.LENGTH_LONG).show();
    }


}
