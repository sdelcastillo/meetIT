package com.example.sam.meetit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            //Intent i = new Intent(login.class);
            //startActivityForResult(i, 21, savedInstanceState);
            setContentView(R.layout.activity_login);






    }



    public void goToPostSearch(View v)
    {
        setContentView(R.layout.activity_login);

    }

    public void goToCreateAccount(View v)
    {
        Intent accountCreate = new Intent(this, create_account.class);
        startActivity(accountCreate);

    }
}
