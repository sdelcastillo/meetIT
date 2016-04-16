package com.example.sam.meetit;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by Hayden Szymanski on 4/15/2016.
 */
public class create_account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.create_account);


    }

    public void goBackToLogin(View v)
    {
        Intent login = new Intent(this, login.class);
        startActivity(login);

    }

}
