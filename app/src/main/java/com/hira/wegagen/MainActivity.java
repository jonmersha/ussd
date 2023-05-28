package com.hira.wegagen;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void accountEnqueiry(View view) {
        Intent intent=new Intent(getApplicationContext(), AccountEnquary.class);
        startActivity(intent);

    }

}