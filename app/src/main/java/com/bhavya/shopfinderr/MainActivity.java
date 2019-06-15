package com.bhavya.shopfinderr;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goHome(View v)
    {
        Intent intent=new Intent(MainActivity.this,HomeActivity.class);
        startActivity(intent);
    }
}
